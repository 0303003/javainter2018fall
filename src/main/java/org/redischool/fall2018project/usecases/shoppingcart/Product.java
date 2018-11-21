package org.redischool.fall2018project.usecases.shoppingcart;

import java.util.Date;
import java.util.Objects;

import static com.google.common.base.MoreObjects.toStringHelper;

public class Product {

    private final String name;
    private final double price;
    private final String description;
    private final String receiver;
    private final Date dateOfParchase;
    private final String category;
    private final String place;

    public Product(String name, double price, String description, String receiver, Date dateOfParchase, String catagory,String place) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.receiver = receiver;
        this.dateOfParchase = dateOfParchase;
        this.category= catagory;
        this.place = place;
    }

    @Override
    public String toString() {
        return toStringHelper(this).add("name",name).add("price", price).add("description", description).add("receiver",name).add("dateOfParchase",dateOfParchase).add("category",category ).add("place",place).toString();

    }

    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
    public String getDescription(){
        return description;
    }
    public String getReceiver(){
        return receiver;
    }
    public String getCatagory(){
        return category;
    }
    public String getPlace(){ return place;}
    public Date getDateOfParchase(){
        return dateOfParchase;
    }

    public double setPrice() {
        return price;
    }
    public String setName() {
        return name;
    }
    public String setDescription(){
        return description;
    }
    public String setReceiver(){
        return receiver;
    }
    public String setCatagory(){
        return category;
    }
    public String setPlace(){ return place; }
    public Date setDateOfParchase(){
        return dateOfParchase;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Double.compare(product.price, price) == 0 &&
                Objects.equals(name, product.name) &&
                Objects.equals(description, product.description) &&
                Objects.equals(receiver, product.receiver) &&
                Objects.equals(dateOfParchase, product.dateOfParchase) &&
                Objects.equals(category, product.category) &&
                Objects.equals(place, product.place);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price, description, receiver, dateOfParchase, category, place);
    }
}
