import java.util.Objects;

public class Employee {

    private static int counter = 0; //Счетчик идентификатора

    private int id; // Идентификатор
    private String name; // Имя
    private String surname; //Фамилия
    private String patronymic; //Отчество
    private int salary; // Зарплата

    private String department; //  Название отдела


    public Employee (String name, String surname, String patronymic, int salary, String department) {
        counter++;
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.salary = salary;
        this.department = department;
        this.id = counter;
    }

    public String getName() {
        return this.name;
    }
    public String getSurname() {
        return this.surname;
    }
    public String getPatronymic() {
        return this.patronymic;
    }
    public int getSalary() {
        return this.salary;
    }
    public String getDepartment() {
        return this.department;
    }
    public void setSalary (int salary){
        this.salary = salary;
    }
    public void setDepartment (String department){
        this.department = department;
    }

    public String toString() {
        return "id=" + this.id + ", Имя '" + this.name + "', Фамилия '" + this.surname + "', Отчество '"
                + this.patronymic + "', Зарплата " + this.salary + ", Отдел " + this.department;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return salary == employee.salary && name.equals(employee.name) && surname.equals(employee.surname) && patronymic.equals(employee.patronymic) && department.equals(employee.department);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, patronymic, salary, department);
    }
}
