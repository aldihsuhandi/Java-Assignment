import java.util.ArrayList;

class Function
{
    public void clear_terminal()
    {
        for(int i = 0;i < 42;++i)
            System.out.println();
    }
    public int max(int a, int b)
    {
        if(a > b)
            return a;
        return b;
    }

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

    public int getRandNum(int n)
    {
        int ret = (int)(Math.random() * n) + 1;
        return ret;
    }

    public void printRunner(int idx, Runner runner)
    {
        //System.out.println("test");
        String name = runner.getName();
        String type = runner.getType();
        int distance = runner.getDistance();
        System.out.printf("+ %-3d | %-16s| %-7s| %-9d+\n", idx, name, type, distance);
    }

    public void printTableHeaders(int distance)
    {
        System.out.println("+===========================================+");
        System.out.printf("+ Current Standing                     %-3d  +\n", distance);
        System.out.println("+===========================================+");
        System.out.println("+ No. | Name            | Type   | Distance +");
        System.out.println("+===========================================+");
        
    }
}
