package Coche.clases;

import Coche.interfaces.CocheCRUD;

import java.util.List;

public class CocheCRUDImpl implements CocheCRUD {

    @Override
    public void save(Coche coche) {
        System.out.println("Save");
    }


    public List<Coche> findAll() {
        System.out.println("Find all");
        return null;
    }


    public void delete(Coche coche) {
        System.out.println("Delete");
    }
}
