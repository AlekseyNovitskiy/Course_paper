public class Employee {

    private static int counter = 0; //Счетчик идентификатора

    private int id; // Идентификатор
    private String name; // Имя
    private String surname; //Фамилия
    private String patronymic; //Отчество
    private int salary; // Зарплата

    private String department; //  Название отдела


    public Employee (String name, String surname, String patronymic, int salary, String department) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.salary = salary;
        this.department = department;
        this.id = counter;
        counter++;
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

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", Имя '" + name + '\'' +
                ", Фамилия '" + surname + '\'' +
                ", Отчество '" + patronymic + '\'' +
                ", Зарплата " + salary +
                ", Отдел '" + department + '\'' +
                '}';
    }

}
