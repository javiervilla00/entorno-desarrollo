package com.javiervilla.pccomponentes;

public class GraphicCard {
    private Integer id;
    private String marca;
    private String fabricante;
    private String memorytype;

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

    public String getMemorytype() {
        return memorytype;
    }

    public void setMemorytype(String memorytype) {
        this.memorytype = memorytype;
    }
}

