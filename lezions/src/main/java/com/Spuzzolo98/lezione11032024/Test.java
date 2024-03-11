package com.Spuzzolo98.lezione11032024;
import com.Spuzzolo98.lezione11032024.Patients;
public class Test{
    public static void main(String[] args) {

        Patients patiente = new Patients(); //non è una buona idea usare un costruttore vuoto poichè si incombe in nullpointerexception

        patiente.name = "Giorgio";
        patiente.age = 22;
        patiente.weight = 100;

        System.out.println(patiente.getage());
    }
}