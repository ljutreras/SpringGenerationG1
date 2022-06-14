package com.generation.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name="usuarios")

public class Usuario {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Size(min=3, max=30) //LIMITA la cantidad de caracteres
    private String nombre;

    @Size(min=3, max=30)
    private String apellido;


    private Integer edad;

    @NotNull
    @Size(min=6, max=8)
    private String passwd;

    public Usuario() {
    }

    public Usuario(String nombre, String apellido, Integer edad, String passwd) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.passwd = passwd;
    }

    //GETTER & SETTER
    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

}
