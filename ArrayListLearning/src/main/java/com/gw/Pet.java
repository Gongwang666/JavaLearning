package com.gw;

public class Pet {
    private int code;
    private String name;

    public Pet() {
    }

    public Pet(int code, String name) {
        this.code = code;
        this.name = name;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        Pet pet = (Pet) obj;
        return this.code == pet.code&&this.name == pet.name ? true : false;
    }
}
