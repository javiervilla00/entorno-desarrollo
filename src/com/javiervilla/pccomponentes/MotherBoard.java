package com.javiervilla.pccomponentes;

/**
 * Clase MotherBoard
 */

public class MotherBoard {

    /**
     * Atributos, propiedades, variables, estado
     */

    private Integer id;
    private String marca;
    private String fabricante;
    private String socket;

    /**
     * Métodos, funciones, comportamiento
     */

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getSocket() {
        return socket;
    }

    public void setSocket(String socket) {
        this.socket = socket;
    }


}

