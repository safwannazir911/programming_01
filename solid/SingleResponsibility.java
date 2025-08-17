package solid;

public class SingleResponsibility {
    public static class Employee {
        private String name;
        private int id;

        public String getName() {
            return name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    public static class EmployeeRepository{
        public void save(Employee employee) {
            // save to DB
            System.out.print("saved");
        }
    }

    public static class EmployeeReportService {
        public String generateReport(Employee employee) {
            return "Employee Report for " + employee.getName();
        }
    }


    public static void main(String[] args) {

        Employee emp=new Employee();
        EmployeeRepository repo=new EmployeeRepository();
        repo.save(emp);

    }

}
