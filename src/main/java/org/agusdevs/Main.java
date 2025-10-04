package org.agusdevs;

public class Main {

    public void printString(String txt){

        try {

            System.out.println(txt);
        } catch (Exception e) {

            System.out.println(e);
        }
    }

    public void printInt(int n){

        try {

            System.out.println(n);
        } catch (Exception e) {

            System.out.println(e);
        }
    }

    public void printDouble(Double d){

        try {

            System.out.println(d);
        } catch (Exception e) {

            System.out.println(e);
        }
    }

    public void printBoolean(Boolean b){

        try {

            System.out.println(b);
        } catch (Exception e) {

            System.out.println(e);
        }
    }
    public static void main(String[] args) {

        Main main = new Main();

        main.printString("Hello World");
        main.printInt(15);
        main.printDouble(123.45);
        main.printBoolean(true);
    }
}