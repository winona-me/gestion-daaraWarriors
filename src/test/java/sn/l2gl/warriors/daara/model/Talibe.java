package sn.l2gl.warriors.daara.model.models;

import jakarta.persistence.*;

@Entity
@Table(name = "talibe")
public class Talibe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String matricula;

    @ManyToOne
    @JoinColumn(name = "classe_id")
    private Classe classe;

    public Talibe() {}

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getMatricula() { return matricula; }
    public void setMatricula(String matricula) { this.matricula = matricula; }

    public Classe getClasse() { return classe; }
    public void setClasse(Classe classe) { this.classe = classe; }
}