package sn.l2gl.warriors.daara.model;

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

    // Getters e Setters...
}
