package com.reactive.programming.udemy.reactive.observerPattern;

import java.util.ArrayList;


public class Book implements SubjectLibrary {

    private String name;
    private String type;
    private String author;
    private double price;
    private String inStock;
    private ArrayList<Observer> obsList = new ArrayList<>();


    public Book(String name, String type, String author, double price, String inStock) {
        this.name = name;
        this.type = type;
        this.author = author;
        this.price = price;
        this.inStock = inStock;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getInStock() {
        return inStock;
    }

    public void setInStock(String inStock) {
        this.inStock = inStock;
        System.out.println("Availability changed from Sold out to Back in stock ");
        notifyObserver();
    }

    public ArrayList<Observer> getObsList() {
        return obsList;
    }

    public void setObsList(ArrayList<Observer> obsList) {
        this.obsList = obsList;
    }

    @Override
    public void subscribeObserver(Observer ob) {
        obsList.add(ob);
    }

    @Override
    public void unSubscribeObserver(Observer ob) {
        obsList.remove(ob);
    }

    @Override
    public void notifyObserver() {
        System.out.println("Book{" +
                "Book name='" + this.name + '\'' +
                ", Book type='" + this.type + '\'' +
                ", author='" + this.author + '\'' +
                ", price=" + this.price +
                ", inStock='" + this.inStock + '\'' +
                '}');
        for (Observer o: obsList){
            o.update(this.inStock);
        }
    }


}
