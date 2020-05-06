import java.util.ArrayList;
import java.util.Scanner;
import java.io.IOException;

public class Main
{
    public Main() throws IOException 
    {
        Scanner in = new Scanner(System.in);
        Function fun = new Function();
        ArrayList<Employee> employeeList = new ArrayList<>();

        int choice = 0;
        while(choice != 4){
            fun.printHeaders();
            choice = in.nextInt();
            in.nextLine();
            System.out.println();

            if(choice == 1)
            {
                String name, role, type;
                int age;

                do{
                    System.out.print("Input employee name[must be more than 3 characters]: ");
                    name = in.nextLine();
                } while(name.length() <= 3);

                do{
                    System.out.print("Input employee age[>= 17]: ");
                    age = in.nextInt();
                } while(age < 17);
                in.nextLine();
                
                do{
                    System.out.print("Input employee role[Assistant | Programmer](Case Sensitive): ");
                    role = in.nextLine();
                } while(!(role.equals("Assistant") || role.equals("Programmer")));

                do{
                    System.out.print("Input employee type[PartTime | FullTime](Case Sensitive: ");
                    type = in.nextLine();
                } while(!(type.equals("PartTime") || type.equals("FullTime")));
                
                if(type.equals("FullTime"))
                {
                    String baseSalary;
                    Fulltime employee = new Fulltime(name, age, role, type);
                    do{
                        System.out.print("Input base salary[>=10000]: ");
                        baseSalary = in.nextLine();
                    } while(baseSalary.charAt(0) == '0' && baseSalary.length() < 5);

                    employee.setBaseSalary(baseSalary);
                    employee.setStatus("active");
                    employeeList.add(employee);
                }
                else if(type.equals("PartTime"))
                {
                    int hourPerWeek;
                    String payPerHour;
                    Parttime employee = new Parttime(name, age, role, type);
                    do{
                        System.out.print("Input pay per hour[>=10000]: ");
                        payPerHour = in.nextLine();
                    } while(payPerHour.charAt(0) == '0' && payPerHour.length() < 5);

                    do{
                        System.out.print("Input working hour per week[>0]: ");
                        hourPerWeek = in.nextInt();
                    } while(hourPerWeek < 1);
                    in.nextLine();

                    employee.setPayPerHour(payPerHour);
                    employee.setHourPerWeek(hourPerWeek);
                    employee.setStatus("active");
                    employeeList.add(employee);
                }

                System.out.print("Success insert employee data\n\nPress any key to continue...");
                System.in.read();
            }
            else if(choice == 2)
            {
                fun.viewEmployeeList(employeeList);
                System.out.print("Press any key to continue...");
                System.in.read();
            }
            else if(choice == 3)
            {
                fun.viewEmployeeList(employeeList);
                if(!employeeList.isEmpty())
                {
                    System.out.printf("Input employee number that want to resign[1..%d]: ", employeeList.size());
                    int idx = in.nextInt();
                    System.out.println();

                    fun.resignEmployee(employeeList.get(idx-1));
                }

                System.out.print("Press any key to continue...");
                System.in.read();
            }

            System.out.println();
        }
    }

    public static void main(String[] args) throws IOException 
    {
        new Main();
    }
}
