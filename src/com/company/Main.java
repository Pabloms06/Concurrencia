package com.company;

import java.util.ArrayList;

public class Main {
    public static final ArrayList<String> barradelbar = new ArrayList<>();
    public static void main(String[] args) {

        Camarero camarero = new Camarero();
        Cliente cliente = new Cliente();
        camarero.start();
        cliente.start();


    }
}
