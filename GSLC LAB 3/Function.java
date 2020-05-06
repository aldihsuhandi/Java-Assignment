class Function
{
    public void printMenu()
    {
        String[] menu = {"Add Runner", "Join Run", "View Standing", "Close Program"};
        System.out.println("+=======================+");
        System.out.println("+ Menu List~            +");
        System.out.println("+=======================+");
        for(int i = 0;i < 4;++i)
            System.out.printf("+ %d. %-19s+\n", i + 1, menu[i]);
        System.out.println("+=======================+");
        System.out.print("Choice >> ");
    }
}
