package kejn.solteq;

import kejn.solteq.employee.db.EmployeeRepository;
import kejn.solteq.employee.db.model.ContactDetails;
import kejn.solteq.employee.db.model.ContractType;
import kejn.solteq.employee.db.model.Employee;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.math.BigDecimal;

@EnableAutoConfiguration
@SpringBootApplication
public class SolteqTaskApplication {

    public static void main(String[] args) {
        SpringApplication.run(SolteqTaskApplication.class, args);
    }

    @Bean
    public CommandLineRunner dataLoader(EmployeeRepository employeeRepository) {
        return args -> {
            Employee johnDoe = Employee.builder()
                    .id(1000L)
                    .firstName("John")
                    .lastName("Doe")
                    .salary(new BigDecimal("5000"))
                    .contractType(ContractType.PERMANENT)
                    .contactDetails(ContactDetails.builder()
                            .id(101L)
                            .email("john.doe@company.com")
                            .mobile("+1 234 56 7890")
                            .street("Page Avenue 200/3")
                            .city("Missouri")
                            .country("USA")
                            .build())
                    .build();

            Employee emilyRose = Employee.builder()
                    .id(2300L)
                    .firstName("Emily")
                    .lastName("Rose")
                    .salary(new BigDecimal("7000"))
                    .contractType(ContractType.PERMANENT)
                    .contactDetails(ContactDetails.builder()
                            .id(23L)
                            .email("emily.rose@unemployed.com")
                            .mobile("+1 555 56 1111")
                            .street("Wall Street 16/43")
                            .city("New York")
                            .country("USA")
                            .build())
                    .build();

            Employee benKubrick = Employee.builder()
                    .id(3000L)
                    .firstName("Ben")
                    .lastName("Kubrick")
                    .salary(new BigDecimal("10000"))
                    .contractType(ContractType.B2B)
                    .contactDetails(ContactDetails.builder()
                            .id(301L)
                            .email("ben.kubrick@pearson-specter.com")
                            .mobile("+1 991 77 1221")
                            .street("High Road 74/37")
                            .city("Kansas")
                            .country("USA")
                            .build())
                    .build();

            Employee kentBeck = Employee.builder()
                    .id(4004L)
                    .firstName("Kent")
                    .lastName("Beck")
                    .salary(new BigDecimal("16000"))
                    .contractType(ContractType.PERMANENT)
                    .contactDetails(ContactDetails.builder()
                            .id(404L)
                            .email("kent.beck@tdd.com")
                            .mobile("+1 733 52 8211")
                            .street("JUnit Street 0K/4")
                            .city("O'Reilly")
                            .country("USA")
                            .build())
                    .build();

            employeeRepository.save(johnDoe);
            employeeRepository.save(emilyRose);
            employeeRepository.save(benKubrick);
            employeeRepository.save(kentBeck);
        };
    }
}
