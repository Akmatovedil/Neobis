package org.week2.entity;

import java.util.List;

public class Basket {

    private short id;

    private Client client;

    private List<Product> product;

    public Basket() {
    }

    public Basket(short id, Client client, List<Product> product) {
        this.id = id;
        this.client = client;
        this.product = product;
    }

    public short getId() {
        return id;
    }

    public void setId(short id) {
        this.id = id;
    }

    public List<Product> getProducts() {
        return product;
    }

    public void setProducts(List<Product> products) {
        this.product = products;
    }

    @Override
    public String toString() {
        return "Basket{" +
                "id=" + id +
                ", client=" + client +
                ", product=" + product +
                '}';
    }
}
