package application;

import model.entities.Department;

public class DemoDaoJdbc {

    public static void main(String[] args) {
        Department obj = new Department(1, "Dumon");
        System.out.println(obj);
    }

}
