package org.week2.dao;

import org.week2.entity.Product;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProductDao {
    public void create(Connection connection, short id, String name, int price) {
        String insertSQL = "INSERT INTO product (id, name, price) VALUES (?, ?, ?)";

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(insertSQL);

            preparedStatement.setShort(1, id);
            preparedStatement.setString(2, name);
            preparedStatement.setInt(3, price);

            preparedStatement.executeUpdate();
            System.out.println("Продукт успешно добавлен в таблицу");
        } catch (SQLException e) {
            System.out.println("Ошибка");
            throw new RuntimeException(e);
        }
    }

    public void update(Connection connection, short id, String newName, int newPrice) {
        String updateSQL = "UPDATE product SET name = ?, price = ? WHERE id = ?";

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(updateSQL);
            preparedStatement.setShort(3, id);
            preparedStatement.setString(1, newName);
            preparedStatement.setInt(2, newPrice);


            int rowsUpdate = preparedStatement.executeUpdate();

            if (rowsUpdate > 0) {
                System.out.println("Продукт был обнавлен");
            } else {
                System.out.println("Не удалось обновить продукт");
            }
        } catch (SQLException e) {
            System.out.println("Ошибка");
            throw new RuntimeException(e);
        }
    }

    public void delete(Connection connection, short id) {
        String deleteSQL = "DELETE FROM product WHERE id = ?";

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(deleteSQL);
            preparedStatement.setInt(1, id);

            preparedStatement.executeUpdate();
            System.out.println("Продукт был удален");
        } catch (SQLException e) {
            System.out.println("Ошибка");
            throw new RuntimeException(e);
        }
    }

    public List<Product>getAll(Connection connection) {
        List<Product> products = new ArrayList<>();

        try {
            Statement statement = connection.createStatement();

            String selectQuery = "SELECT * FROM product";
            ResultSet resultSet = statement.executeQuery(selectQuery);

            while (resultSet.next()) {
                Product product = new Product();
                product.setId(resultSet.getShort("id"));
                product.setName(resultSet.getString("name"));
                product.setPrice(resultSet.getInt("price"));
                products.add(product);

                System.out.println("Id: " + product.getId() + ", Наименование: " + product.getName() + ", Цена: " + product.getPrice());
            }

            resultSet.close();
            statement.close();
            connection.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return products;
    }

}
