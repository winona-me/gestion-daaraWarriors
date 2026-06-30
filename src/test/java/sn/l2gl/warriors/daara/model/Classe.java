package sn.l2gl.warriors.daara.model.models;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "classe")
public class Classe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    @Enumerated(EnumType.STRING)
    private Niveau niveau;

    @ManyToOne
    @JoinColumn(name = "maitre_id")
    private Maitre maitre;

    @OneToMany(mappedBy = "classe")
    private List<Talibe> talibes;

    public Classe() {}

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public Niveau getNiveau() { return niveau; }
    public void setNiveau(Niveau niveau) { this.niveau = niveau; }

    public Maitre getMaitre() { return maitre; }
    public void setMaitre(Maitre maitre) { this.maitre = maitre; }

    public List<Talibe> getTalibes() { return talibes; }
    public void setTalibes(List<Talibe> talibes) { this.talibes = talibes; }
}