public class Employee {
    private int id;
    private int salary;
public void setSalary(int salary) {
        this.salary = salary;
    }
public String getSalary() {
        if (this.salary < 10000) {
            return "Salary is less than 10,000";
        } else {
            return "Salary is 10,000 or more";
        }
    }

    public static void main(String args[]) {
        Employee e = new Employee();
e.setSalary(8000); 
System.out.println(e.getSalary());
  }
}


