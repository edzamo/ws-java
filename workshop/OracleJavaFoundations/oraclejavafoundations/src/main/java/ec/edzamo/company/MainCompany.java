package ec.edzamo.company;

import java.util.Optional;

public class MainCompany {

  private static String departmentNumber = "IT";

  public static void main(String[] args) {

    Employee newEmployee = new Employee("Edwin");
    Optional<Department> department = DepartmentFinder.find(departmentNumber);
    department.ifPresent(dpt->{
      dpt.assignEmployee(newEmployee);
      newEmployee.print();
      dpt.print();
    });


  }

}
