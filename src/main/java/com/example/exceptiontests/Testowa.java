package com.example.exceptiontests;

import java.util.ArrayList;

public class Testowa {

    static ArrayList<Long> czasy = new ArrayList<Long>();
    static ArrayList<Long> czasy2 = new ArrayList<Long>();

    public static void main(String[] args) {


        ///dzielenie////

        //ok
        System.out.println("*******dzielenie ok 10000******");
        petlaDzielOk(10000);
        printuj();
        czasy.clear();

        System.out.println("*******dzielenie ok 1000******");
        petlaDzielOk(1000);
        printuj();
        czasy.clear();


        System.out.println("*******dzielenie ok 100******");
        czasy.clear();
        petlaDzielOk(100);
        printuj();
        czasy.clear();

        System.out.println("*******dzielenie ok 100******");
        czasy.clear();
        petlaDzielOk(100);
        printuj();
        czasy.clear();

        System.out.println("*******dzielenie ok 1000******");
        petlaDzielOk(1000);
        printuj();
        czasy.clear();

        System.out.println("*******dzielenie ok 10000******");
        petlaDzielOk(10000);
        printuj();
        czasy.clear();

        //przechwycenie

        czasy.clear();
        System.out.println("*******dzielenie przechwycenie 100******");
        petlaDzielZero(100);
        printuj();
        czasy.clear();

        System.out.println("*******dzielenie przechwycenie 1000******");
        petlaDzielZero(1000);
        printuj();
        czasy.clear();

        System.out.println("*******dzielenie przechwycenie 10000******");
        petlaDzielZero(10000);
        printuj();
        czasy.clear();

        //rzucenie

        czasy.clear();
        System.out.println("*******dzielenie rzucenie 100******");
        petlaDzielZero2(100);
        printuj();
        czasy.clear();

        System.out.println("*******dzielenie rzucenie 1000******");
        petlaDzielZero2(1000);
        printuj();
        czasy.clear();

        System.out.println("*******dzielenie rzucenie 10000******");
        petlaDzielZero2(10000);
        printuj();
        czasy.clear();

        //odczyt z tablicy////

        //ok
        czasy.clear();
        System.out.println("*******odczyt z tablicy ok 100******");
        petlaTablicaOk(100);
        printuj();
        czasy.clear();

        System.out.println("*******odczyt z tablicy ok 1000******");
        petlaTablicaOk(1000);
        printuj();
        czasy.clear();

        System.out.println("*******odczyt z tablicy ok 10000******");
        petlaTablicaOk(10000);
        printuj();
        czasy.clear();
        //przechwycenie
        czasy.clear();
        System.out.println("*******odczyt z tablicy przechwycenie 100******");
        petlaTablicaZakres(100);
        printuj();
        czasy.clear();

        System.out.println("*******odczyt z tablicy przechwycenie 1000******");
        petlaTablicaZakres(1000);
        printuj();
        czasy.clear();

        System.out.println("*******odczyt z tablicy przechwycenie 10000******");
        petlaTablicaZakres(10000);
        printuj();
        czasy.clear();
        //rzucenie
        czasy.clear();
        System.out.println("*******odczyt z tablicy rzucenie 100******");
        petlaTablicaZakres2(100);
        printuj();
        czasy.clear();

        System.out.println("*******odczyt z tablicy rzucenie 1000******");
        petlaTablicaZakres2(1000);
        printuj();
        czasy.clear();

        System.out.println("*******odczyt z tablicy rzucenie 10000******");
        petlaTablicaZakres2(10000);
        printuj();
        czasy.clear();
        czasy2.clear();
        System.out.println("Dzielenie");
        System.out.println("Metoda OK");
        petlaDzielOk(100);
        petlaDzielOk(1000);
        petlaDzielOk(10000);
        System.out.println("[" + czasy2.get(0) + "  " + czasy2.get(1) + "  " + czasy2.get(2) + "]");


        System.out.println("Przechwycenie");
        petlaDzielZero(100);
        petlaDzielZero(1000);
        petlaDzielZero(10000);
        System.out.println("[" + czasy2.get(3) + "  " + czasy2.get(4) + "  " + czasy2.get(5) + "]");

        System.out.println("Rzucenie wyjątku");
        petlaDzielZero2(100);
        petlaDzielZero2(1000);
        petlaDzielZero2(10000);
        System.out.println("[" + czasy2.get(6) + "  " + czasy2.get(7) + "  " + czasy2.get(8) + "]");

        System.out.println("\nOdczyt z tabeli");
        System.out.println("Metoda OK");
        petlaTablicaOk(100);
        petlaTablicaOk(1000);
        petlaTablicaOk(10000);
        System.out.println("[" + czasy2.get(9) + "  " + czasy2.get(10) + "  " + czasy2.get(11) + "]");


        System.out.println("Przechwycenie");
        petlaTablicaZakres(100);
        petlaTablicaZakres(1000);
        petlaTablicaZakres(10000);
        System.out.println("[" + czasy2.get(12) + "  " + czasy2.get(13) + "  " + czasy2.get(14) + "]");

        System.out.println("Rzucenie wyjątku");
        petlaTablicaZakres2(100);
        petlaTablicaZakres2(1000);
        petlaTablicaZakres2(10000);
        System.out.println("[" + czasy2.get(15) + "  " + czasy2.get(16) + "  " + czasy2.get(17) + "]");

    }

    public static double dzielOk() {
        double zmienna = 0;
        zmienna = 3 / 4;
        return zmienna;
    }

    public static double dzielZero() {
        double zmienna = 0;
        try {
            zmienna = 3 / 0;
        } catch (ArithmeticException ex) {

        }
        return zmienna;
    }

    public static double dzielZero2() throws ArithmeticException {
        double zmienna = 0;
        //try{
        zmienna = 3 / 0;
        //}
        //catch(ArithmeticException ex){

        //}
        return zmienna;
    }

    public static int tablicaOk() {
        int indeks = 0;

        int[] tablica = {0, 4};

        indeks = tablica[1];

        return indeks;
    }

    public static int tablicaZakres() {
        int indeks = 0;

        try {

            int[] tablica = {0, 4};

            indeks = tablica[3];
        } catch (ArrayIndexOutOfBoundsException ex) {

        }

        return indeks;
    }

    public static int tablicaZakres2() throws ArrayIndexOutOfBoundsException {
        int indeks = 0;

        //try{

        int[] tablica = {0, 4};

        indeks = tablica[3];
        //}
        //catch(ArrayIndexOutOfBoundsException ex){

        //}

        return indeks;
    }

    public static void petlaDzielOk(int liczbaPowtorzen) {
        long czas1;
        long czas2;
        long czas = System.nanoTime();


        for (int i = 0; i < liczbaPowtorzen; i++) {

            czas1 = System.nanoTime();
            double zmienna = dzielOk();
            czas2 = System.nanoTime();
            czasy.add(czas2 - czas1);

        }
        czasy2.add(System.nanoTime() - czas);
    }

    public static void petlaDzielZero(int liczbaPowtorzen) {
        long czas1;
        long czas2;
        long czas = System.nanoTime();
        for (int i = 0; i < liczbaPowtorzen; i++) {
            czas1 = System.nanoTime();
            double zmienna = dzielZero();
            czas2 = System.nanoTime();
            czasy.add(czas2 - czas1);

        }
        czasy2.add(System.nanoTime() - czas);
    }

    public static void petlaDzielZero2(int liczbaPowtorzen) {
        long czas1;
        long czas2;
        long czas = System.nanoTime();
        for (int i = 0; i < liczbaPowtorzen; i++) {

            czas1 = System.nanoTime();


            try {
                double zmienna = dzielZero2();
            } catch (ArithmeticException e) {

            }

            czas2 = System.nanoTime();
            czasy.add(czas2 - czas1);

        }
        czasy2.add(System.nanoTime() - czas);
    }

    public static void petlaTablicaOk(int liczbaPowtorzen) {
        long czas1;
        long czas2;
        long czas = System.nanoTime();
        for (int i = 0; i < liczbaPowtorzen; i++) {
            czas1 = System.nanoTime();
            int zmienna = tablicaOk();
            czas2 = System.nanoTime();
            czasy.add(czas2 - czas1);

        }
        czasy2.add(System.nanoTime() - czas);
    }

    public static void petlaTablicaZakres(int liczbaPowtorzen) {
        long czas1;
        long czas2;
        long czas = System.nanoTime();

        for (int i = 0; i < liczbaPowtorzen; i++) {
            czas1 = System.nanoTime();
            int zmienna = tablicaZakres();
            czas2 = System.nanoTime();
            czasy.add(czas2 - czas1);

        }
        czasy2.add(System.nanoTime() - czas);
    }

    public static void petlaTablicaZakres2(int liczbaPowtorzen) {
        long czas1;
        long czas2;
        long czas = System.nanoTime();
        for (int i = 0; i < liczbaPowtorzen; i++) {

            czas1 = System.nanoTime();


            try {
                int zmienna = tablicaZakres2();
            } catch (ArrayIndexOutOfBoundsException e) {

            }

            czas2 = System.nanoTime();
            czasy.add(czas2 - czas1);

        }
        czasy2.add(System.nanoTime() - czas);
    }

    public static void printuj() {
        int j = 0;
        for (long i : czasy) {
            //if (i < 500) {
                System.out.println(++j + ": " + i);
            //}
        }
    }

    public static void printuj(ArrayList<Long> lista) {
        int j = 0;
        for (long i : lista) {
            //if (i < 500) {
                System.out.println(++j + ": " + i);
            //}
        }
    }


}



