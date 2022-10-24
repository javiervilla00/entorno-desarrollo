package com.javiervilla.pccomponentes;
import java.util.ArrayList;
import java.util.
public class SetupPC {

    private  String id;

    private  Procesador procesador;

    private MotherBoard motherBoard;
    private ArrayList<Memory> memories = new ArrayList<>();
    //Otra opción: private List<Memory> memories= new ArrayList<>();

    public void setId(String id) {
        this.id = id;
    }

    public void setProcesador(Procesador procesador) {
        this.procesador = procesador;
    }



}