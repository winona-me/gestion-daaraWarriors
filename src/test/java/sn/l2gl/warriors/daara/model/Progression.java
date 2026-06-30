
package sn.l2gl.warriors.daara.model;

import jakarta.persistence.*;

@Entity
@Table(name = "progression")
public class Progression {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String descricao;

    @ManyToOne
    @JoinColumn(name = "talibe_id")
    private Talibe talibe;

    public Progression() {}

    // Getters e Setters...
}