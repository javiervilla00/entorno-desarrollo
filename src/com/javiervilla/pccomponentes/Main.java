package com.javiervilla.pccomponentes;

public class Main {

    public static void main(String[] args) {
        System.out.println("Iniciando...");

        Procesador amd = new Procesador();

        /**
         * Código a ejecutar por un administrativo de la empresa.
         * Código para introducir información de procesadores.
         */
        amd.setId(1);
        amd.setMarca("Ryzen6400");
        amd.setFabricante("AMD");

        System.out.println(amd.getMarca());
        System.out.println(amd.getFabricante());

        Procesador pentium = new Procesador();
        pentium.setId(2);
        pentium.setMarca("i7");
        pentium.setFabricante("Intel");

        System.out.println(amd.getMarca());
        System.out.println(amd.getFabricante());

        MotherBoard msi = new MotherBoard();

        msi.setId(1);
        msi.setMarca("B550");
        msi.setFabricante("MSI");
        msi.setSocket("socket AM4");

        System.out.println(msi.getMarca());
        System.out.println(msi.getFabricante());
        System.out.println(msi.getSocket());

        MotherBoard gigabyte = new MotherBoard();

        gigabyte.setId(2);
        gigabyte.setMarca("X570");
        gigabyte.setFabricante("gigabyte");
        gigabyte.setSocket("socket AM4");

        System.out.println(gigabyte.getMarca());
        System.out.println(gigabyte.getFabricante());
        System.out.println(gigabyte.getSocket());

        GraphicCard asus = new GraphicCard();

        asus.setId(1);
        asus.setMarca("GeForce rtx 3090");
        asus.setFabricante("asus");
        asus.setMemorytype("GDDR6X");

        System.out.println(asus.getMarca());
        System.out.println(asus.getFabricante());
        System.out.println(asus.getMemorytype());

        GraphicCard graphicCardamd = new GraphicCard();

        graphicCardamd.setId(2);
        graphicCardamd.setMarca("raedon rx6900");
        graphicCardamd.setFabricante("amd");
        graphicCardamd.setMemorytype("GDDR6");

        System.out.println(amd.getMarca());
        System.out.println(amd.getFabricante());
        System.out.println(amd.getMemorytype());


    }
}