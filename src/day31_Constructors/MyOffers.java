package day31_Constructors;

import java.util.ArrayList;
import java.util.Arrays;

public class MyOffers {

    public static void main(String[] args) {

       Offer offer1 = new Offer();
        offer1.setInfo("VA", "Amazon INC", "SDET", 110000, true, true, true, true);
        System.out.println(offer1);

        Offer offer2 = new Offer();
        offer2.setInfo("CA", "Sony INC", "QA", 120000, true, false, false, true);
        System.out.println(offer2);

        Offer offer3 = new Offer();
        offer3.setInfo("Fl", "Apple INC", "QE", 125000, true, true, true, false);
        System.out.println(offer3);

        Offer offer4 = new Offer();
        offer4.setInfo("TX", "CapitalOne", "SM", 115000, false, false, true, true);
        System.out.println(offer4);

        Offer offer5 = new Offer();
        offer5.setInfo("WA", "Bank of America", "BA", 130000, true, true, true, true);
        System.out.println(offer5);

        System.out.println(offer1);
        System.out.println(offer2);
        System.out.println(offer3);
        System.out.println(offer4);
        System.out.println(offer5);

        Offer[] myOffers = {offer1, offer2, offer3, offer4, offer5};

        ArrayList<Offer> fullTimeOffers = new ArrayList<>( Arrays.asList( myOffers) );
        fullTimeOffers.removeIf( p -> !p.isFullTime);
        System.out.println(fullTimeOffers.size());

        ArrayList<Offer> localOffers = new ArrayList<>( Arrays.asList( myOffers ) );
        localOffers.removeIf( p -> !p.location.equals("VA") );
        System.out.println(localOffers.size());



    }

}
