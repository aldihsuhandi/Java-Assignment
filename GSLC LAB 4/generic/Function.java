class Function
{
    public void print_menu()
    {
        String[] menu = {"Print elements", "Calculate cuboid volume", "Simple calculator", "Exit"};
        for(int i = 0;i < 4;++i)
            System.out.printf("%d. %s\n", i + 1, menu[i]);

        System.out.print("Choice: ");
    }

    public void clear_terminal()
    {
        for(int i = 0;i < 60;++i)
            System.out.println();
    }
}
