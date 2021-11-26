import java.math.BigDecimal;

@Data
@Builder
public class Contract {
    String name;
    boolean federal = false;
    BigDecimal bidAmount;
    int contractLength;
    int positions;
    String[] practiceAreas;
    Employee[] employees;
}
