import com.entity.Auction;
import com.entity.AuctionedItem;
import com.entity.Buyer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;


import java.util.ArrayList;
import java.util.List;

public class AuctionTest {


    public Auction initializeAuction(){

        List<Integer> Bids1 = new ArrayList<Integer>();
        Bids1.add(100);
        Bids1.add(150);
        Bids1.add(200);

        /*Buyer Instantiation */
        Buyer b1 = new Buyer("James",Bids1);

        List<Integer> Bids2 = new ArrayList<Integer>();
        Bids2.add(80);
        Bids2.add(120);

        /*Buyer Instantiation */
        Buyer b2 = new Buyer("Brad",Bids2);

        List<Integer> Bids3 = new ArrayList<Integer>();
        Bids3.add(115);
        Bids3.add(90);
        Bids3.add(250);

        /*Buyer Instantiation */
        Buyer b3 = new Buyer("Peter",Bids3);


        List<Integer> Bids4 = new ArrayList<Integer>();
        Bids4.add(150);
        Bids4.add(170);
        Bids4.add(300);


        /*Buyer Instantiation */
        Buyer b4 = new Buyer("Susana",Bids4);

        /*Item for Auction*/
        AuctionedItem ai = new AuctionedItem("Object",150);

        List<Buyer> buyers = new ArrayList<>();
        buyers.add(b1);
        buyers.add(b2);
        buyers.add(b3);
        buyers.add(b4);


        /*Auction Instantiation */
        return new Auction(buyers, ai);

    }


    @Test
    public void testGetWinner(){
        Auction auction = initializeAuction();

        System.out.println(auction.getWinningBuyer().getName());
        Assertions.assertEquals(auction.getWinningBuyer().getName(),"Susana");
    }

    @Test
    public void testGetWinningPrice(){
        Auction auction = initializeAuction();

        System.out.println(auction.getWinningPrice());
        Assertions.assertEquals(auction.getWinningPrice(),250);

    }
}
