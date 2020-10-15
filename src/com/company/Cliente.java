package com.company;

public class Cliente extends Thread {

    public void run() {
        while (true) {
            try {
                synchronized (Main.barradelbar) {
                    if (!Main.barradelbar.isEmpty()) {
                        System.out.println("Voy a beberme un " + Main.barradelbar.get(0));
                        Main.barradelbar.remove(0);
                        sleep(2000);
                    }else{
                        Main.barradelbar.notify(); //Avisa de que ha acabado el proceso
                    }
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}//Se sincroniza entre ellas, mandando una *notificacion*

//Notify (Indica cuando ha acabado el proceso)