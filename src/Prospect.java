import java.math.BigDecimal;

@Data
public class Prospect {
    public static final int MINIMUM_AMOUNT_PER_ROLE = 15000;
    public static final int MINIMUM_POSITIONS = 3;
    String name;
    int contractLengthInMonths;
    int positions;
    BigDecimal bidAmount;
    String[] practiceAreas;
    BigDecimal relativeValuePerMonthPerPosition;
    boolean requiresSecurityClearance;

    public Prospect(String name, int contractLengthInMonths, int positions, BigDecimal bidAmount,
                    String[] practiceAreas, boolean requiresSecurityClearance) {
        this.name = name;
        this.contractLengthInMonths = contractLengthInMonths;
        this.positions = positions;
        this.bidAmount = bidAmount;
        this.practiceAreas = practiceAreas;
        this.relativeValuePerMonthPerPosition = calculateRelativeValuePerMonthPerPositon(bidAmount,
                contractLengthInMonths, positions);
        this.requiresSecurityClearance = requiresSecurityClearance;
    }

    private BigDecimal calculateRelativeValuePerMonthPerPositon(BigDecimal bidAmount,
                                                                int contractLengthInMonths, int positions){
        return bidAmount.divide(BigDecimal.valueOf(contractLengthInMonths)).divide(BigDecimal.valueOf(positions));
    }
}
