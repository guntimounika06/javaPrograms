package JAVAPROGRAMS;

public class MainApp
{
    public static void main(String[] args)
    {
        StudentRecords studentRecords = new StudentRecords();
        EmployeeRecords employeeRecords = new EmployeeRecords();

        studentRecords.displayStudents();
        employeeRecords.displayEmployees();
    }
}
