public class Employee {

    private static String employee;
    private float salary;
    private int department;

    private static int Id;

    public Employee
            (String employee, float salary,int department) {
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
    //public static void main(String[] args) {
    //    Employee[] employees = new Employee[10];
    //    employees[0] = new Employee("Ivanov Ivan Ivanovich", 65799, 1);
    //    employees[1] = new Employee("Sidorov Mikhail Alexandrovich", 55768, 1);
    //    employees[2] = new Employee("Vasiliev Matvei Grigorievich", 60000, 1);
    //    employees[3] = new Employee("Fedorov Pavel Alekseevich", 57800, 2);
    //    employees[4] = new Employee("Pavlov Sergey Sergeyevich", 75567, 3);
    //    employees[5] = new Employee("Konkin Valeriy Pavlovich", 89000, 3);
    //    employees[6] = new Employee("Starov Dmitry Alexandrovich", 95999, 4);
    //    employees[7] = new Employee("Malkin Viktor Fyodorovich", 98500, 4);
    //    employees[8] = new Employee("Nikolaev Mikhail Nikolaevich", 45569, 5);
    //    employees[9] = new Employee("Alekseev Alexey Alekseevich", 50534, 5);

        //float[] salary = new Salary[10];
        //float sumSalaryMonth = 0;


        //for (int i = 0; i < salary.length; i++) {
        //    sumSalaryMonth += salary[i];
        //}


    }











