package sn.l2gl.warriors.daara.model.models;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "maitre")
public class Maitre {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    @OneToMany(mappedBy = "maitre")
    private List<Classe> classes;

    public Maitre() {}

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public List<Classe> getClasses() { return classes; }
    public void setClasses(List<Classe> classes) { this.classes = classes; }
}