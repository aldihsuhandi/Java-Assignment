public class PrintMenu
{
    public void print_menu()
    {
        System.out.println("Print Menu");
        System.out.println("==========");
        String[] menu = {"Print numbers", "Print words"};
        for(int i = 0;i < 2;++i)
            System.out.printf("%d. %s\n", i + 1, menu[i]);
        System.out.print("Choice: ");
    }

    public void print_numbers(int first, int second, int third)
    {
        System.out.printf("Number inputted: %d %d %d\n", first, second, third);
    }

    public void print_words(String first, String second, String third)
    {
        System.out.printf("Names inputted: %s %s %s\n", first, second, third);
    }
}
