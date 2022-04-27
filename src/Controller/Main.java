package Controller;

import Model.Logic.Entity.*;


public class Main {
    public static void main(String[] args) {
        Orange orange= new Orange(200,3000,4.5);
        System.out.println(orange);
        Milk milk= new Milk(1,2.5,3);
        System.out.println(milk);
    }
}
