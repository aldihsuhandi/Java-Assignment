import java.util.ArrayList;
import java.math.BigInteger;

public class Function
{
    void printHeaders()
    {
        System.out.println("ABC EMPLOYEE DATA");
        System.out.println("=================");
        System.out.println("1. Add employee");
        System.out.println("2. View employee");
        System.out.println("3. Resign");
        System.out.println("4. Exit");
        System.out.print("Choice: ");
    }
    
    void printData(Employee employee, int idx)
    {
        System.out.printf("Employee no.%d\n", idx);
        String name = employee.getName();
        int age = employee.getAge();
        String type = employee.getType();
        String role = employee.getRole();
        String status = employee.getStatus();

        if(type.equals("FullTime"))
            System.out.println("Full Time Employee");
        else
            System.out.println("Part Time Employee");
        System.out.println("==================");

        System.out.println("Status: " + status);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Role: " + role);
        
        if(type.equals("FullTime"))
        {
            Fulltime extra = (Fulltime) employee;
            System.out.println("Base salary per month: " + extra.getBaseSalary());
        }
        else
        {
            Parttime extra = (Parttime) employee;
            int payPerHour = Integer.parseInt(extra.getPayPerHour());
            int hours = extra.getHourPerWeek();
            int payPerMonth = payPerHour * hours * 4;

            System.out.println("Pay per hour: " + payPerHour);
            System.out.println("Working hour per week: " + hours);
            System.out.println("Salary per month: " + payPerMonth);
        }

        System.out.println();

    }

    void viewEmployeeList(ArrayList<Employee> employeeList)
    {
        if(employeeList.isEmpty())
            System.out.println("There is no employee data in the list\n");
        else
        {
            for(int i=0;i<employeeList.size();++i)
                printData(employeeList.get(i), i+1);
        }
    }

    void resignEmployee(Employee employee)
    {
        if(employee.getStatus().equals("not active"))
            System.out.println("Employee has already resigned!");
        else
        {
            System.out.printf("%s is resigning...\n", employee.getName());
            employee.setStatus("not active");
        }

        System.out.println();
    }
}
