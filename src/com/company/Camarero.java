package com.company;

public class Camarero extends Thread {

    public void run() {
        while (true) {

            try {
                synchronized (Main.barradelbar){
                    Main.barradelbar.wait();
                String cocacola = "Coca-cola";
                Main.barradelbar.add(cocacola);
                System.out.println("Voy a añadir una " + cocacola);
                sleep(1000);
                String fanta = "Fanta";
                Main.barradelbar.add(fanta);
                System.out.println("Voy a añadir una " + fanta);
                sleep(1000);
                String vino = "vino";
                Main.barradelbar.add(vino);
                System.out.println("Voy a añadir un " + vino);
                sleep(1000);
            }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }

}
