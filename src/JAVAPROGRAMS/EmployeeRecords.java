package JAVAPROGRAMS;
import java.util.HashMap;
import java.util.Map;
public class EmployeeRecords
{
    private Map<Integer, String> employees = new HashMap<>();

    public EmployeeRecords()
    {
        employees.put(201, "Mounika");
        employees.put(202, "Mani");
        employees.put(203, "Sriya");
    }

    public void displayEmployees()
    {
        System.out.println("\nEmployee Records:");
        for(Map.Entry<Integer, String> entry : employees.entrySet())
        {
            System.out.println("Employee ID: " + entry.getKey() + ", Name: " + entry.getValue());
        }
    }
}
