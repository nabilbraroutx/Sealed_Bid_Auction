package com.entity;

public class AuctionedItem {

    private int reserved_price;

    private String name;

    public AuctionedItem(String name, int reserved_price) {
        setName(name);
        setReserved_price(reserved_price);
    }
    public int getReserved_price() {
        return reserved_price;
    }

    public void setReserved_price(int reserved_price) {
        this.reserved_price = reserved_price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
