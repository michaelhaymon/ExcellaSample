import java.math.BigDecimal;

@Data
@Builder
public class Prospect {
    public static final int MINIMUM_AMOUNT_PER_ROLE = 15000;
    public static final int MINIMUM_POSITIONS = 3;
    String name;
    int contractLengthInMonths;
    int positions;
    int bidAmount;
    String[] practiceAreas;
    BigDecimal relativeValuePerMonthPerPosition;

    public Prospect(String name, int contractLengthInMonths, int positions, int bidAmount, String[] practiceAreas) {
        this.name = name;
        this.contractLengthInMonths = contractLengthInMonths;
        this.positions = positions;
        this.bidAmount = bidAmount;
        this.practiceAreas = practiceAreas;
        this.relativeValuePerMonthPerPosition = calculateRelativeValuePerMonthPerPositon(bidAmount,
                contractLengthInMonths, positions);
    }

    private BigDecimal calculateRelativeValuePerMonthPerPositon(int bidAmount,
                                                                int contractLengthInMonths, int positions){
        return BigDecimal.valueOf((bidAmount/contractLengthInMonths)/positions);
    }
}
