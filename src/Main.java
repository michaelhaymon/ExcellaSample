import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Main {

    public static void main(String[] args) {
//        Website takes in prospective client info and dumps it into DB.
//        Batch job pulls in list of prospects and filters out unlikely
//          prospects due to short length of contract

        Collection<Prospect> prospects = prospectService.getAllProspects();


//      Stream.filter(Contract not long enough)
//
//        {
//            Filter out unlikely offers (too low bid, not enough positions, length not long enough)
//            Offer too high need to go for review to see if there was a messed up number
//            Send to sales
//        }
//
//        {
//            Sort Prospects by (bidAmount/contractLengthInMonths)/positions to get RelativeDollarValuePerEmployeePerMonth
//            IF positions is null, calculate bottom threshold for valid offer.
//            EXTRACT CALCULATION
//        }

//        {
//            Federal offers, pull list of employees with clearance
//            Normal offers, pull list of anyone.
//                Check number of employees available,
//            If number of employee are available, sent to Account Manager/Project Manager
//            If number of employees are NOT available, sent to recruiting
//        }


    }


}
