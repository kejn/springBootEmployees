package kejn.solteq.employee.db.model;

import lombok.Builder;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Builder
@Entity
@Table(name = ContactDetails.TABLE_NAME)
public class ContactDetails {

    protected static final String TABLE_NAME = "CONTACT_DETAILS";
    protected static final String ID_COLUMN_NAME = "CONTACT_DETAILS_ID";

    @Id
    @Column(name = ID_COLUMN_NAME)
    private Long id;

    private String email;
    private String mobile;
    private String street;
    private String city;
    private String country;

}
