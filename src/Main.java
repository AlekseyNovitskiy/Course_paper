public class Main {
    public static void main(String[] args) {
        Employee[] Employee = new Employee[10];


        Employee[0] = new Employee("Иванов", "Иван", "Иванович", 35000, "1");
        Employee[1] = new Employee("Петров", "Петр", "Васильевич", 47000, "2");
        Employee[2] = new Employee("Баженов", "Валентин", "Самсонович", 52000, "3");
        Employee[3] = new Employee("Бодров", "Михаил", "Михайлович", 49000, "4");
        Employee[4] = new Employee("Белкин", "Вадим", "Вадимович", 38000, "5");
        Employee[5] = new Employee("Мальцев", "Сергей", "Сергеевич", 33000, "1");
        Employee[6] = new Employee("Шахов", "Петр", "Николаевич", 44000, "2");
        Employee[7] = new Employee("Ворошилов", "Максим", "Максимович", 102000, "3");
        Employee[8] = new Employee("Слезко", "Юрий", "Иванович", 89000, "4");
        Employee[9] = new Employee("Сидоренко", "Александр", "Васильевич", 138000, "5");

        ListEmployers(Employee);

        System.out.println("Сумма затрат за месяц составила " + MonthlySalaries(Employee) + " рублей");

        System.out.println("Минимальная сумма зарплаты сотрудника " + MinimumSalary(Employee) + " рублей. Максимальная сумма зарплаты сотрудника " + MaximumSalary(Employee) + " рублей");

        System.out.println("Среднее значение зарплат " + AverageSalary(Employee) + " рублей");
        AllEmployees(Employee);

        IndexSalary(Employee);

        ListEmployers(Employee);

        String numTestDepartment = "2";

        System.out.println("Минимальная сумма зарплаты сотрудника в отделе №" + numTestDepartment + " составила " + MinimumSalaryDepartment(Employee, numTestDepartment) +
                " рублей. Максимальная сумма зарплаты сотрудника в отделе №" + numTestDepartment + " составила " + MaximumSalaryDepartment(Employee,numTestDepartment) + " рублей");
        System.out.println("Сумма затрат за месяц в отделе №" + numTestDepartment + " составила " + MonthlyDepartmentSalaries(Employee, numTestDepartment) + " рублей");

        System.out.println("Среднее значение зарплат в отделе №" + numTestDepartment + " составила " + AverageSalaryDepartment(Employee, numTestDepartment) + " рублей");

        IndexSalaryDepartment(Employee, numTestDepartment, 1.06);

        ListEmployersDepartment(Employee,numTestDepartment);

        LessSalary(Employee, 50000) ;

        MoreSalary(Employee, 50000) ;
    }

    public static void ListEmployers(Employee[] Employees) {
        for (Employee employee : Employees) {
            if (employee != null) {
                System.out.println(employee);
            }

        }
    }

    public static int MonthlySalaries(Employee[] Employees) {
        int sumSalaries = 0;
        for (Employee employee : Employees) {
            if (employee != null) {
                sumSalaries = sumSalaries + employee.getSalary();
            }
        }
        return sumSalaries;
    }

    public static int MaximumSalary(Employee[] Employees) {
        int maxSum = Integer.MIN_VALUE;
        for (Employee employee : Employees) {
            if (employee != null) {
                if (employee.getSalary() > maxSum) {
                    maxSum = employee.getSalary();
                }
            }
        }
        return maxSum;
    }

    public static int MinimumSalary(Employee[] Employees) {
        int minSum = Integer.MAX_VALUE;
        for (Employee employee : Employees) {
            if (employee != null) {
                if (employee.getSalary() < minSum) {
                    minSum = employee.getSalary();
                }
            }
        }
        return minSum;
    }

    public static double AverageSalary(Employee[] Employees) {
        double averageValue = 0;
        int countEmployers = 0;
        for (Employee employee : Employees) {
            if (employee != null) {
                countEmployers++;
            }
        }
        averageValue = MonthlySalaries(Employees);
        averageValue /= countEmployers;
        return averageValue;
    }

    public static void AllEmployees(Employee[] Employees) {
        String allEmployees = null;
        for (Employee employee : Employees) {
            if (employee != null) {
                allEmployees = employee.getName() + " " + employee.getSurname() + " " + employee.getPatronymic();
                System.out.println(allEmployees);
            }
        }
    }

    //Level 2
    public static void IndexSalary(Employee[] Employees) {
        double index = 1.05;
        for (Employee employee : Employees) {
            if (employee != null) {
                employee.setSalary((int) (employee.getSalary()*index));
            }
        }
    }

    public static int MonthlyDepartmentSalaries(Employee[] Employees, String numDepartment) {
        int sumSalaries = 0;
        for (Employee employee : Employees) {
            if (employee != null && employee.getDepartment().equals(numDepartment)) {
                sumSalaries = sumSalaries + employee.getSalary();
            }
        }
        return sumSalaries;
    }

    public static int MaximumSalaryDepartment(Employee[] Employees, String numDepartment) {
        int maxSum = Integer.MIN_VALUE;
        for (Employee employee : Employees) {
            if (employee != null && employee.getDepartment().equals(numDepartment)) {
                if (employee.getSalary() > maxSum) {
                    maxSum = employee.getSalary();
                }
            }
        }
        return maxSum;
    }

    public static int MinimumSalaryDepartment(Employee[] Employees, String numDepartment) {
        int minSum = Integer.MAX_VALUE;
        for (Employee employee : Employees) {
            if (employee != null && employee.getDepartment().equals(numDepartment)) {
                if (employee.getSalary() < minSum) {
                    minSum = employee.getSalary();
                }
            }
        }
        return minSum;
    }

    public static double AverageSalaryDepartment(Employee[] Employees, String numDepartment) {
        double averageValue = 0;
        int countEmployers = 0;
        for (Employee employee : Employees) {
            if (employee != null && employee.getDepartment().equals(numDepartment)) {
                countEmployers++;
            }
        }
        averageValue = MonthlyDepartmentSalaries(Employees, numDepartment);
        averageValue /= countEmployers;
        return averageValue;
    }
    public static void IndexSalaryDepartment(Employee[] Employees, String numDepartment, double index) {
        for (Employee employee : Employees) {
            if (employee != null && employee.getDepartment().equals(numDepartment)) {
                employee.setSalary((int) (employee.getSalary()*index));
            }
        }
    }

    public static void ListEmployersDepartment(Employee[] Employees, String numDepartment) {
        for (Employee employee : Employees) {
            if (employee != null && employee.getDepartment().equals(numDepartment)) {
                System.out.println(employee.toStringDepartment());
            }

        }
    }

    public static int LessSalary(Employee[] Employees, int maxSum) {
        System.out.println("Сотрудники с зарплатой меньше " + maxSum + ":");
        for (Employee employee : Employees) {
            if (employee != null) {
                if (employee.getSalary() < maxSum) {
                    System.out.println(employee);
                }
            }
        }
        return maxSum;
    }

    public static int MoreSalary(Employee[] Employees, int minSum) {
        System.out.println("Сотрудники с зарплатой больше " + minSum + ":");
        for (Employee employee : Employees) {
            if (employee != null) {
                if (employee.getSalary() > minSum) {
                    System.out.println(employee);
                }
            }
        }
        return minSum;
    }

}