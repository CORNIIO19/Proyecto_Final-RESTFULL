package cua.uam.mx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import cua.uam.mx.dal.entities.Employee;


@SpringBootApplication
public class EmployeeApplication {

  public static void main(String... args) {
    SpringApplication.run(EmployeeApplication.class, args);
  }
}