package ec.edzamo.company;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

public class DepartmentFinder {

  private static final Set<Department> departments = new HashSet<>();

  static {
    departments.add(new Department("IT"));
    departments.add(new Department("HR"));
    departments.add(new Department("Finance"));
  }

  public static Optional<Department> find(String departmentNumber) {
    return departments
        .stream()
        .filter(department -> department.getName().equalsIgnoreCase(departmentNumber))
        .findFirst();
  }

}
