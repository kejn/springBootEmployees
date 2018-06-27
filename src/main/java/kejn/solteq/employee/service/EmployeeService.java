package kejn.solteq.employee.service;

import kejn.solteq.employee.db.EmployeeRepository;
import kejn.solteq.employee.db.model.Employee;
import kejn.solteq.employee.service.model.EmployeeTo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Service for {@link Employee}.
 */
@Service
@RequiredArgsConstructor
public class EmployeeService {

    private final EmployeeRepository repository;
    private final EmployeeMapper mapper;

    public List<EmployeeTo> getAllEmployees() {
        return mapper.fromEntity(
                repository.findAll()
        );
    }
}
