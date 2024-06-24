package org.example.entities;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Cliente {
    private String name;

    public Cliente(String name) {
        this.name = name;
    }
}
