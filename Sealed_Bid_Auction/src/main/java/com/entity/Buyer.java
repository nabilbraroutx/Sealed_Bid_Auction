package com.entity;

import java.util.List;

public class Buyer {

    private String name;
    private List<Integer> bids;

    public Buyer(String name, List<Integer> bids) {

        setName(name);
        setBids(bids);
    }

    protected int getHighestBid() {


        if(bids.isEmpty()) {
            return 0;
        }
        int highestBid = bids.get(0);
        for (Integer bid : bids) {
            if (bid > highestBid) {
                highestBid = bid;
            }
        }
        return highestBid;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Integer> getBids() {
        return bids;
    }

    public void setBids(List<Integer> bids) {
        this.bids = bids;
    }



}
