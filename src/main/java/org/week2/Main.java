package org.week2;


import org.week2.dao.ProductDao;
import org.week2.util.DatabaseConnection;

import java.sql.Connection;

public class Main {
    public static void main(String[] args){
        Connection connection = DatabaseConnection.connection();
        ProductDao productDAO = new ProductDao();
        //productDAO.create(connection, (short) 4,"Мясо", 350);
        //productDAO.update(connection,(short) 1, "Картошка", 50);
        //productDAO.getAll(connection);
        //productDAO.delete(connection,(short) 1);



    }
}
