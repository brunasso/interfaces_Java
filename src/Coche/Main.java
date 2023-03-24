package Coche;

import Coche.clases.Coche;
import Coche.clases.CocheCRUDImpl;
import Coche.interfaces.CocheCRUD;

public class Main {
    public static void main(String[] args) {

        Coche coche = new Coche(5, "Mercedes", 2015, 60);

        CocheCRUD main = new CocheCRUDImpl();

        main.save(coche);
        main.findAll();
        main.delete(coche);

    }
}