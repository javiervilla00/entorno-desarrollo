package com.javiervilla.pccomponentes;

public class SetupPC {

    private  String id;

    private  Procesador procesador;

    private MotherBoard motherBoard;

    public void setId(String id) {
        this.id = id;
    }

    public Procesador setProcesador(Procesador procesador) {
        this.procesador = procesador;
        return procesador;
    }
}
