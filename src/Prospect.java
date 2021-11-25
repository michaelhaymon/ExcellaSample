import java.math.BigDecimal;
import java.util.Optional;

public class Prospect {
    private static final int MINIMUM_AMOUNT_PER_ROLE = 15000;
    private static final int MAXIMUM_AMOUNT_PER_ROLE = 500000;
    private static final int MINIMUM_POSITIONS = 3;
    int contractLengthInMonths;
    int positions;
    int bidAmount;
    String[] practiceAreas;
    BigDecimal RelativeValuePerEmployeePerMonth;
}
