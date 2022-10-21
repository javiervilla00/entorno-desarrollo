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

        System.out.println(pentium.getMarca());
        System.out.println(pentium.getFabricante());

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
        asus.setMemoryType("GDDR6X");

        System.out.println(asus.getMarca());
        System.out.println(asus.getFabricante());
        System.out.println(asus.getMemoryType());

        GraphicCard graphicCardamd = new GraphicCard();

        graphicCardamd.setId(2);
        graphicCardamd.setMarca("raedon rx6900");
        graphicCardamd.setFabricante("amd");
        graphicCardamd.setMemoryType("GDDR6");

        System.out.println(graphicCardamd.getMarca());
        System.out.println(graphicCardamd.getFabricante());
        System.out.println(graphicCardamd.getMemoryType());

        Ram kingston = new Ram();

        kingston.setId(1);
        kingston.setMarca("FURY Beast");
        kingston.setFabricante("kingston");
        kingston.setMemorytype("DDR4");

        System.out.println(kingston.getMarca());
        System.out.println(kingston.getFabricante());
        System.out.println(kingston.getMemorytype());

        Ram corsair = new Ram();

        corsair.setId(2);
        corsair.setMarca("Vengeance LPX");
        corsair.setFabricante("corsair");
        corsair.setMemorytype("DDR4");

        System.out.println(corsair.getMarca());
        System.out.println(corsair.getFabricante());
        System.out.println(corsair.getMemorytype());

        ComputerCase aerocool = new ComputerCase();

        aerocool.setId(1);
        aerocool.setMarca("Thunder x3");
        aerocool.setFabricante("aerocool");

        System.out.println(aerocool.getMarca());
        System.out.println(aerocool.getFabricante());

        ComputerCase computerCaseCorsair = new ComputerCase();

        computerCaseCorsair.setId(2);
        computerCaseCorsair.setMarca("iCUE 5000T RGB");
        computerCaseCorsair.setFabricante("corsair");

        System.out.println(computerCaseCorsair.getMarca());
        System.out.println(computerCaseCorsair.getFabricante());

        CpuFan coolerMaster = new CpuFan();

        coolerMaster.setId(1);
        coolerMaster.setMarca("Hyper 212 RGB");
        coolerMaster.setFabricante("Cooler Master");

        System.out.println(coolerMaster.getMarca());
        System.out.println(coolerMaster.getFabricante());

        Hdd seagate = new Hdd();

        seagate.setId(1);
        seagate.setMarca("Barracuda");
        seagate.setFabricante("Seagate");

        System.out.println(seagate.getMarca());
        System.out.println(seagate.getFabricante());

        PowerSupply tempest = new PowerSupply();

        tempest.setId(1);
        tempest.setMarca("PSU");
        tempest.setFabricante("Tempest");

        System.out.println(tempest.getMarca());
        System.out.println(tempest.getFabricante());

        SoundCard create = new SoundCard();

        create.setId(1);
        create.setMarca("Blaster Audigy");
        create.setFabricante("Create");

        System.out.println(create.getMarca());
        System.out.println(create.getFabricante());

        DvdRecorder dvdAsus = new DvdRecorder();

        dvdAsus.setId(1);
        dvdAsus.setMarca("SDRW-08D2S Lite");
        dvdAsus.setFabricante("Asus");

        System.out.println(dvdAsus.getMarca());
        System.out.println(dvdAsus.getFabricante());

        Display samsung = new Display();

        samsung.setId(1);
        samsung.setMarca("Odyssey G3 G30A");
        samsung.setFabricante("Samsung");

        System.out.println(samsung.getMarca());
        System.out.println(samsung.getFabricante());

        Keyboard logitech = new Keyboard();

        logitech.setId(1);
        logitech.setMarca("MK270");
        logitech.setFabricante("Logitech");

        System.out.println(logitech.getMarca());
        System.out.println(logitech.getFabricante());

        Mouse mouseMsi = new Mouse();

        mouseMsi.setId(1);
        mouseMsi.setMarca("Clutch gm08");
        mouseMsi.setFabricante("MSI");

        System.out.println(mouseMsi.getMarca());
        System.out.println(mouseMsi.getFabricante());

        Speaker woxter = new Speaker();

        woxter.setId(1);
        woxter.setMarca("Big Bass 500R");
        woxter.setFabricante("Woxter");

        System.out.println(woxter.getMarca());
        System.out.println(woxter.getFabricante());

    }
}