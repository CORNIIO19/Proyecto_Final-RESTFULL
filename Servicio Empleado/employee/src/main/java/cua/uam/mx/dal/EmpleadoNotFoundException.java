package cua.uam.mx.dal;

class EmployeeNotFoundException extends RuntimeException {

  EmployeeNotFoundException(Integer id) {
    super("Could not find employee " + id);
  }
}