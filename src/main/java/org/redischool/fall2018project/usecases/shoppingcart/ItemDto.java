package org.redischool.fall2018project.usecases.shoppingcart;

import java.util.Date;
import java.util.Objects;

public class ItemDto {

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Date getDateOfPerchase() {
        return dateOfPerchase;
    }

    public void setDateOfPerchase(Date dateOfPerchase) {
        this.dateOfPerchase = dateOfPerchase;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getCatagory() {
        return catagory;
    }

    public void setCatagory(String catagory) {
        this.catagory = catagory;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    private String place;
    private String catagory;
    private String receiver;
   private String description;
    private String name;
    private double price;
    private int quantity;
    private Date dateOfPerchase;

    public ItemDto() {
    }

    public ItemDto(String name, double price, int quantity, String description, String receiver,Date dateOfPerchase,String place, String catagory ) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.receiver = receiver;
        this.dateOfPerchase = dateOfPerchase;
        this.place=place;
        this.catagory = catagory;
        this.quantity = quantity;
    }

    public ShoppingCart.Item toItem() {
        Product product = new Product(name, price,description,receiver,dateOfPerchase,catagory,place);
        return new ShoppingCart.Item(product, quantity);
    }

    public static ItemDto of(ShoppingCart.Item item) {
        return new ItemDto(item.getProduct().getName(), item.getProduct().getPrice(), item.getQuantity(),item.getProduct().getDescription(),item.getProduct().getReceiver(),item.getProduct().getDateOfParchase(),item.getProduct().getPlace(),item.getProduct().getCatagory());
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ItemDto itemDto = (ItemDto) o;
        return Double.compare(itemDto.price, price) == 0 &&
                quantity == itemDto.quantity &&
                Objects.equals(name, itemDto.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, price, quantity);
    }

    @Override
    public String toString() {
        return "ItemDto{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }
}
