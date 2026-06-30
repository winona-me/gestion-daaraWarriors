package sn.l2gl.warriors.daara.model;

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

    // Getters e Setters...
}
