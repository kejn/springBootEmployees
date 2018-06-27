package kejn.solteq.employee.db.model;

import lombok.Builder;
import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;

@Data
@Builder
@Entity
@Table(name = Employee.TABLE_NAME)
public class Employee {

    protected static final String TABLE_NAME = "EMPLOYEE";

    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "FIRST_NAME")
    private String firstName;

    @Column(name = "LAST_NAME")
    private String lastName;

    private BigDecimal salary;

    @Enumerated(EnumType.STRING)
    private ContractType contractType = ContractType.PERMANENT;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(referencedColumnName = ContactDetails.ID_COLUMN_NAME)
    private ContactDetails contactDetails;
}
