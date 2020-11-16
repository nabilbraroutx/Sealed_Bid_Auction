package com.entity;

import java.util.List;
import java.util.stream.Collectors;

public class Auction {

    private List<Buyer> buyers;
    private AuctionedItem item;

    public Auction(List<Buyer> buyers, AuctionedItem item){
        setBuyers(buyers);
        setItem(item);
    }

    public Buyer getWinningBuyer(){
        return getWinningBuyerFromList(buyers);
    }

    private Buyer getWinningBuyerFromList(List<Buyer> buyers) {
        if(buyers.isEmpty()) {
            return null;
        }
        Buyer winner = null;
        int highestBid = item.getReserved_price();
        for (Buyer buyer : buyers) {
            if (buyer.getHighestBid() > highestBid) {
                winner = buyer;
                highestBid = buyer.getHighestBid();
            }
        }
        return winner;
    }

    public int getWinningPrice(){

        String winningBuyerName = getWinningBuyer().getName();

        List<Buyer> nonWinningBuyers = buyers.stream().filter(buyer -> !buyer.getName().equals(winningBuyerName)).collect(Collectors.toList());

        Buyer secondWinner = getWinningBuyerFromList(nonWinningBuyers);
        return secondWinner.getHighestBid() > item.getReserved_price() ? secondWinner.getHighestBid() : null;
    }

    public List<Buyer> getBuyers() {
        return buyers;
    }

    public void setBuyers(List<Buyer> buyers) {
        this.buyers = buyers;
    }

    public AuctionedItem getItem() {
        return item;
    }

    public void setItem(AuctionedItem item) {
        this.item = item;
    }
}
