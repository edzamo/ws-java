package ec.edzamo.company;

import java.util.Collection;
import java.util.HashSet;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Department extends Employee {

  private Collection<Employee> employees = new HashSet<>();


  public Department(String name) {
    super(name);
  }


  void assignEmployee(Employee employee) {
    employee.setDepartment(this);
    employees.add(employee);
  }

  private Collection<Employee> getEmployee() {
    return employees;
  }


  @Override
  public void print() {
    System.out.println("Department: " + getName() + "| Employees:" + employees.size());
  }


}
