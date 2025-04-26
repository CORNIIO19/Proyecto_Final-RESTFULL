package cua.uam.mx.dal;

import org.springframework.data.jpa.repository.JpaRepository;
import cua.uam.mx.dal.entities.Employee;

interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
