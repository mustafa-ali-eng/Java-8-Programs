package ImportantQuestions;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class  Employee {

    private int id;
    private String name;
    private int age;
    private String gender;
    private String department;
    private int yearOfJoining;
    private double salary;


    public Employee(int id, String name, int age, String gender, String department, int yearOfJoining, double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.department = department;
        this.yearOfJoining = yearOfJoining;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getYearOfJoining() {
        return yearOfJoining;
    }

    public void setYearOfJoining(int yearOfJoining) {
        this.yearOfJoining = yearOfJoining;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}


public class InterviewQuestionPractice {


    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<Employee>();

        employeeList.add(new Employee(1, "Jhansi", 32, "Female", "HR", 2011, 25000.0));
        employeeList.add(new Employee(2, "Smith", 25, "Male", "Sales", 2015, 13500.0));
        employeeList.add(new Employee(3, "David", 29, "Male", "Infrastructure", 2012, 18000.0));
        employeeList.add(new Employee(4, "Orlen", 28, "Male", "Development", 2014, 32500.0));
        employeeList.add(new Employee(5, "Charles", 27, "Male", "HR", 2013, 22700.0));
        employeeList.add(new Employee(6, "Cathy", 43, "Male", "Security", 2016, 10500.0));
        employeeList.add(new Employee(7, "Ramesh", 35, "Male", "Finance", 2010, 27000.0));
        employeeList.add(new Employee(8, "Suresh", 31, "Male", "Development", 2015, 34500.0));
        employeeList.add(new Employee(9, "Gita", 24, "Female", "Sales", 2016, 11500.0));
        employeeList.add(new Employee(10, "Mahesh", 38, "Male", "Security", 2015, 11000.5));
        employeeList.add(new Employee(11, "Gouri", 27, "Female", "Infrastructure", 2014, 15700.0));
        employeeList.add(new Employee(12, "Nithin", 25, "Male", "Development", 2016, 28200.0));
        employeeList.add(new Employee(13, "Swathi", 27, "Female", "Finance", 2013, 21300.0));
        employeeList.add(new Employee(14, "Bubbles", 24, "Male", "Sales", 2017, 10700.5));
        employeeList.add(new Employee(15, "Ashok", 23, "Male", "Infrastructure", 2018, 12700.0));
        employeeList.add(new Employee(16, "Sanvi", 26, "Female", "Development", 2015, 28900.0));



//        1. How many male and female employees are there in the organization?

               employeeList.stream().collect(
                       Collectors.groupingBy(Employee::getGender, Collectors.counting())
               ).forEach((gender, count) -> System.out.println(gender + " : " + count));

//         2. Print the name of all departments in the organization?

               employeeList.stream().map(Employee::getDepartment).distinct().forEach(System.out::println);

//          3. What is the average age of male and female employees?

               employeeList.stream().collect(
                       Collectors.groupingBy(Employee::getGender, Collectors.averagingInt(Employee::getAge))
               ).forEach((gender, avgAge) -> System.out.println(gender + " : " + avgAge));

//        4. Get the details of highest paid employee in the organization?
            employeeList.stream().max((e1, e2) -> Double.compare(e1.getSalary(), e2.getSalary())).ifPresent(employee -> System.out.println("Highest Paid Employee: " + employee.getName() + ", Salary: " + employee.getSalary()));

//        5. Get the names of all employees who have joined after 2015?
                 employeeList.stream().filter(employee -> employee.getYearOfJoining() > 2015).forEach(employee -> {
                     System.out.println(employee.getName());});

//         6. Count the number of employees in each department?
         employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting())
         ).forEach((department, count) -> System.out.println(department + " : " + count));


//        7. What is the average salary of each department?
        Map<String, Double> avgSalary = employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));
        avgSalary.forEach((department, avgSal) -> System.out.println(department + " : " + avgSal));

//        8. Get the details of youngest male employee in the product development department?
                employeeList.stream()
                        .filter(employee -> employee.getGender().equals("Male") && employee.getDepartment().equals("Development"))
                        .min((e1, e2) -> Integer.compare(e1.getAge(), e2.getAge()))
                        .ifPresent(employee -> System.out.println("Youngest Male Employee in Development Department: " + employee.getName() + ", Age: " + employee.getAge()));


//        9. Who has the most working experience in the organization?
          employeeList.stream().min(( (e1, e2) -> Integer.compare(e1.getYearOfJoining(), e2.getYearOfJoining())))
                  .ifPresent(employee -> System.out.println("Most Experienced Employee: " + employee.getName() + ", Year of Joining: " + employee.getYearOfJoining()));

//         10. How many male and female employees are there in the Sales team?
        employeeList.stream().filter(employee -> employee.getDepartment().equals("Sales"))
                .collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()))
                .forEach((gender, count) -> System.out.println(gender + " : " + count));

//        11. What is the average salary of male and female employees?
              employeeList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingDouble(Employee::getSalary)))
                .forEach((gender, avgSalary1) -> System.out.println(gender + " : " + avgSalary));

//        12. List down the names of all employees in each department?
                employeeList.stream()
                        .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.mapping(Employee::getName, Collectors.toList())))
                        .forEach((department, names) -> System.out.println(department + " : " + names));


//        13. What is the average salary and total salary of the whole organization?
        String avg_Total_Salary = employeeList.stream()
                .collect(Collectors.teeing(
                        Collectors.averagingDouble(Employee::getSalary),
                        Collectors.summingDouble(Employee::getSalary),
                        (avgSalary2, totalSalary) -> "Average Salary: " + avgSalary + ", Total Salary: " + totalSalary));
        System.out.println(avg_Total_Salary);


//        14. Separate the employees who are younger or equal to 25 years from those employees who are older than 25 years?
               employeeList.stream().collect(
                       Collectors.partitioningBy(employee -> employee.getAge() <= 25)
               ).forEach((isYoungerOrEqualTo25, employees) -> {
                   String ageGroup = isYoungerOrEqualTo25 ? "Younger or Equal to 25" : "Older than 25";
                   System.out.println(ageGroup + ":");
                   employees.forEach(employee -> System.out.println(" - " + employee.getName() + ", Age: " + employee.getAge()));
               });


//         15. Who is the oldest employee in the organization? What is his age and which department he belongs to?
              employeeList.stream()
                      .max((e1, e2) -> Integer.compare(e1.getAge(), e2.getAge()))
                      .ifPresent(employee -> System.out.println("Oldest Employee: " + employee.getName() + ", Age: " + employee.getAge() + ", Department: " + employee.getDepartment()));
    }


}
