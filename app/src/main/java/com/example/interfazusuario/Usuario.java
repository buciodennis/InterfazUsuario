package com.example.interfazusuario;

import java.io.Serializable;

public class Usuario implements Serializable {
    String nombre;
    int telefono;
    String email;
    String contraseña;

    public Usuario(String nombre, int telefono, String email, String contraseña) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.email = email;
        this.contraseña = contraseña;
    }

    public String getNombre() {
        return nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public String getEmail() {
        return email;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
}
