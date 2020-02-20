package application;

import java.util.Date;
import model.entities.Department;
import model.entities.Seller;

public class DemoDaoJdbc {

    public static void main(String[] args) {
        Department obj = new Department(1, "Dumon");
       
        
        Seller seller = new Seller(21, "Dumon2", "dumon@hotmail.com", new Date(), 1000.0, obj);
        
         System.out.println(seller);
    }

}
