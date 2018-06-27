package kejn.solteq.employee.service.model;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

/**
 * {@link kejn.solteq.employee.db.model.Employee} transport object.
 */
@Data
@Builder
public class EmployeeTo {
    private String firstName;
    private String lastName;
    private BigDecimal salary;
    private String contractType;

    private String email;
    private String mobile;
    private String street;
    private String city;
    private String country;
}
