package io.truelogic.jd.players.entity;

import javax.persistence.*;

@Entity
public class Player {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column
    private int id;
    @Column
    private String name;
    @Column
    private String type;

    public Player(){}

    public Player(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        /* TODO: use enum for types */
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return String.format("{ Name: %s, Type: %s }", getName(), getType());
    }
}
