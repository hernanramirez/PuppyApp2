package com.jure.puppyapp2.Classes;

import java.io.Serializable;

/**
 * Created by jure on 07/05/16.
 */
public class Puppy implements Serializable {
    private int id;
    private String nombre;
    private int imagen;
    private int raiting;

    public Puppy(int id, String nombre, int imagen) {
        this.id = id;
        this.nombre = nombre;
        this.imagen = imagen;
        this.raiting = 0;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }

    public int getRaiting() {
        return raiting;
    }

    public void setRaiting(int raiting) {
        this.raiting = raiting;
    }

}
