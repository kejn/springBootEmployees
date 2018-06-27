package kejn.solteq.employee;

import kejn.solteq.employee.db.model.Employee;
import kejn.solteq.employee.service.EmployeeService;
import kejn.solteq.employee.service.model.EmployeeTo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;

@Controller
@RequiredArgsConstructor
class EmployeeController {

    private final EmployeeService employeeService;

    @RequestMapping
    public String home(Map<String, Object> params) {
        List<EmployeeTo> employeeList = employeeService.getAllEmployees();
        params.put("employees",employeeList);
        return "index";
    }
}
