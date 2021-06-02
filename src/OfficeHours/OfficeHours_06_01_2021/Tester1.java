package OfficeHours.OfficeHours_06_01_2021;
/*
                    Attributes:
                        name, employeeID, JobTitle, Salary

                    Constructor:
                        accepts and sets all instance variables

                    Actions:
                        getter/setters, smokeTesting(),  creatingTicket(), toString()

            -> Optional: static variable
 */
public class Tester1 {
    private String name;
    private int employeeId;
    private String jobTitle;
    private double salary;


    public Tester1(String name, int employeeId, String jobTitle, double salary) {
        this.name= name;
        this.employeeId= employeeId;
        this.jobTitle= jobTitle;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public void smokeTesting() {
        System.out.println(this.name + "is running a smoke test");
    }
    public void createTicket() {
        System.out.println(this.name + " is creating a ticket");
    }
    @Override
    public String toString() {
        return "Tester1{" +
                "name='" + name + '\'' +
                ", employeeId=" + employeeId +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }
}
