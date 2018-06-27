package kejn.solteq.employee.service;

import kejn.solteq.employee.db.model.ContactDetails;
import kejn.solteq.employee.db.model.Employee;
import kejn.solteq.employee.service.model.EmployeeTo;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Mapper for {@link Employee} and {@link EmployeeTo} classes.
 */
@Component
class EmployeeMapper {

    EmployeeTo fromEntity(Employee employee) {
        ContactDetails contact = employee.getContactDetails();
        return EmployeeTo.builder()
                .firstName(employee.getFirstName())
                .lastName(employee.getLastName())
                .salary(employee.getSalary())
                .contractType(employee.getContractType().toString().toLowerCase())

                .email(contact.getEmail())
                .mobile(contact.getMobile())
                .street(contact.getStreet())
                .city(contact.getCity())
                .country(contact.getCountry())

                .build();
    }

    List<EmployeeTo> fromEntity(List<Employee> employees) {
        return employees.stream().map(this::fromEntity).collect(Collectors.toList());
    }

}
