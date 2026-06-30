package sn.l2gl.warriors.daara.model.models;

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

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getDescricao() { return descricao; }
    public void setDescricao(String descricao) { this.descricao = descricao; }

    public Talibe getTalibe() { return talibe; }
    public void setTalibe(Talibe talibe) { this.talibe = talibe; }
}