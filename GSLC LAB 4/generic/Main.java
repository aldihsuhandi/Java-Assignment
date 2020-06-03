import java.util.Scanner;

class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        Function fun = new Function();
        PrintMenu printmenu = new PrintMenu();
        Cuboid cuboid = new Cuboid();

        int choice = 0;
        while(choice != 4){
            fun.clear_terminal();
            fun.print_menu();
            choice = in.nextInt();
            in.nextLine();

            if(choice == 1)
            {
                printmenu.print_menu();
                int choice_temp = in.nextInt();
                in.nextLine();

                if(choice_temp == 1)
                {
                    int first, second, third;
                    do{
                        System.out.print("Input first number[>0]: ");
                        first = in.nextInt();
                    } while(first <= 0);

                    do{
                        System.out.print("Input second number[>0]: ");
                        second = in.nextInt();
                    } while(second <= 0);

                    do{
                        System.out.print("Input third number[>0]: ");
                        third = in.nextInt();
                    } while(third <= 0);

                    printmenu.print_numbers(first, second, third);
                    in.nextLine();
                }
                else if(choice_temp == 2)
                {
                    String first, second, third;
                    do{
                        System.out.print("Input the first word[must be more than 1 characters]: ");
                        first = in.nextLine();
                    } while(first.length() <= 1);
                    
                    do{
                        System.out.print("Input the second word[must be more than 1 characters]: ");
                        second = in.nextLine();
                    } while(second.length() <= 1);

                    do{
                        System.out.print("Input the third word[must be more than 1 characters]: ");
                        third = in.nextLine();
                    } while(third.length() <= 1);

                    printmenu.print_words(first, second, third);
                }
            }
            else if(choice == 2)
            {
                String datatype = "";
                
                cuboid.print_menu();
                datatype = in.nextLine();

            }

            System.out.print("\nPress enter to continue...");
            in.nextLine();

        }
    }
}
