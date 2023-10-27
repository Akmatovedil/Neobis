package org.week2.entity;



public class Client {

    private short id;
    private String name;
    private String surname;
    private Basket basket;

    public Client() {
    }

    public Client(String name, String surname, Basket basket) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.basket = basket;
    }

    public short getId() {
        return id;
    }

    public void setId(short id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Basket getBasket() {
        return basket;
    }

    public void setBasket(Basket basket) {
        this.basket = basket;
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", basket=" + basket +
                '}';
    }
}
