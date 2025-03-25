package ec.edzamo.company;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Employee {

  private String name;
  private Department department;

  public Employee(String name) {
    this.name = name;
  }

  public void print() {
    System.out.printf("Employee: %s ", name);
  }

}
