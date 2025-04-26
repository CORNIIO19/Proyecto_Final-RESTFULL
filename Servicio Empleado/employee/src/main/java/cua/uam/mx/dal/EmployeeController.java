package cua.uam.mx.dal;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import cua.uam.mx.dal.entities.Employee;

@RestController
class EmployeeController {

  private final EmployeeRepository repository;

  EmployeeController(EmployeeRepository repository) {
    this.repository = repository;
  }


  // Aggregate root
  // tag::get-aggregate-root[]
  @GetMapping("/employee")
  List<Employee> all() {
    return repository.findAll();
  }
  // end::get-aggregate-root[]

  @PostMapping("/employee")
  Employee newEmployee(@RequestBody Employee newEmployee) {
    return repository.save(newEmployee);
  }

  // Single item
  
  @GetMapping("/employee/{id}")
  Employee one(@PathVariable Integer id) {
    
    return repository.findById(id)
      .orElseThrow(() -> new EmployeeNotFoundException(id));
  }

  @PutMapping("/employee/{id}")
  Employee replaceEmployee(@RequestBody Employee newEmployee, @PathVariable Integer id) {
    
    return repository.findById(id)
      .map(employee -> {
        employee.setName(newEmployee.getName());
        employee.setFechaIngreso(newEmployee.getFechaIngreso());
        return repository.save(employee);
      })
      .orElseGet(() -> {
        return repository.save(newEmployee);
      });
  }

  @DeleteMapping("/employee/{id}")
  void deleteEmployee(@PathVariable Integer id) {
    repository.deleteById(id);
  }
}