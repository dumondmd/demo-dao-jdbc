package application;

import java.util.Date;
import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class DemoDaoJdbc {

    public static void main(String[] args) {
        Department obj = new Department(1, "Dumon");
       
        
        Seller seller = new Seller(21, "Dumon2", "dumon@hotmail.com", new Date(), 1000.0, obj);
        
        SellerDao sellerDao = DaoFactory.createSellerDao();
        
         System.out.println(seller);
    }

}
