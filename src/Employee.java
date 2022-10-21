public class Employee {

    private static String employee;
    private float salary;
    private int department;

    private static int Id;

    public Employee
            (String employee, float salary, int department) {
        this.employee = employee;
        this.salary = salary;
        this.department = department;
        Id++;

    }

    public String getEmployee() {
        return employee;
    }

    public float getSalary() {
        return salary;
    }

    public int getDepartment() {
        return department;
    }

    public int getId() {
        return this.Id;
    }

    public void setEmployee(String employee) {
        this.employee
                = employee;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public String toString() {
        return "№" + Id + "  " + "Ф.И.О.- " + employee + ",зарплата - "
                + salary + "(рублей),отдел - "
                + department + ".";



    }

}











