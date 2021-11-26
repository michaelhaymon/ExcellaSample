import java.math.BigDecimal;
import java.util.Collection;
import java.util.stream.Collectors;

/*
    In this example, Excella has a public facing website that allows
    prospective clients to enter the requirements for contracts they
    wish to arrange with Excella. The data for each contract includes
    client name, length of contract in months, number of desired
    positions filled, bid amount for total contract, and the languages
    needed for the client's tech stack. This info is stored into a
    database and processed by a batch job routinely. The following is
    a detailed pseudocode representation of how that batch job might
    function and provide utility to Excella. This is a purely a theoretical
    example to indicate my capabilities and train of thought while coding,
    not a representation of any sort of actual intended application.
 */

public class Main {

    private static final int MINIMUM_CONTRACT_LENGTH_IN_MONTHS = 6;

    public static void main(String[] args) {

        //  prospectService connects to repository class of client information received
        //  from database.
        Collection<Prospect> prospects = prospectService.getAllProspects();
        //  This series of filters removes prospects not deemed valuable enough for consideration
        prospects = prospects.stream()
                //  Remove prospects for contracts shorter than 6 months.
                .filter(p -> p.contractLengthInMonths > MINIMUM_CONTRACT_LENGTH_IN_MONTHS)
                //  Remove prospects for teams with less than 3 positions.
                .filter(p -> p.positions >= Prospect.MINIMUM_POSITIONS)
                //  Remove prospects for contracts whose bid / positions
                //  would result in paying developers less than federal
                //  minimum wage.
                .filter(p -> isBidOverMinimumPerPosition(p.relativeValuePerMonthPerPosition))
                .collect(Collectors.toList());

       // Offer too high need to go for review to see if there was a messed up number
//            Send to sales
        //        }
//
//        {
//            Sort Prospects by (bidAmount/contractLengthInMonths)/positions to get RelativeDollarValuePerEmployeePerMonth
//
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

    //  Returns if bid amount is over minimum wage per position required.
    private static boolean isBidOverMinimumPerPosition(BigDecimal relativeValuePerMonthPerPosition) {
        return (relativeValuePerMonthPerPosition.multiply(BigDecimal.valueOf(12)))
                .compareTo(BigDecimal.valueOf(Prospect.MINIMUM_AMOUNT_PER_ROLE)) > 1;
    }

}
