import java.util.Collection;

@Data
public class Employee {

    public Employee(String name, boolean securityClearance, Collection<String> practiceAreas) {
        this.name = name;
        this.securityClearance = securityClearance;
        this.practiceAreas = practiceAreas;
    }

    String name;
    boolean securityClearance;
    Collection<String> practiceAreas;
}
