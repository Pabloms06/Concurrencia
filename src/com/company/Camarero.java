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

                String fanta = "Fanta";
                Main.barradelbar.add(fanta);
                System.out.println("Voy a añadir una " + fanta);

                String vino = "vino";
                Main.barradelbar.add(vino);
                System.out.println("Voy a añadir un " + vino);
                sleep(5000);
                    Main.barradelbar.notify();
            }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }

}
