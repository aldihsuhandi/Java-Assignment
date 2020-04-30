import java.util.Random;

public class Function
{
    public void printMenu()
    {
        String[] menu = {"2 Players", "3 Players", "Exit"};

        System.out.println("Snakes Ladders");
        System.out.println("==============");
        for(int i=0;i<3;++i)
            System.out.printf(" %d. %s\n", i+1, menu[i]);
        System.out.print(">> ");
    }

    public void printHeaders(int totalPlayer)
    {
        if(totalPlayer == 3)
        {
            System.out.println("|===============================================================|");
            System.out.println("|      |     Player A     |     Player B     |     Player C     |");
            System.out.println("|ROUND |--------------------------------------------------------|");
            System.out.println("|      | Old | Dice | New | Old | Dice | New | Old | Dice | New |");
            System.out.println("|===============================================================|");
        }
        else
        {
            System.out.println("|============================================|");
            System.out.println("|      |     Player A     |     Player B     |");
            System.out.println("|ROUND |-------------------------------------|");
            System.out.println("|      | Old | Dice | New | Old | Dice | New |");
            System.out.println("|============================================|");
        }    
    }

    public int getRandNum()
    {
        Random rand = new Random();

        int ret = 0;
        ret = rand.nextInt(6) + 1;
        return ret;
    }

    public int newStep(int step, int diceNum)
    {
        int ret = step + diceNum;
        if(ret > 100)
            ret = 100 + (100 - ret);

        if(ret == 13)
            ret = 7;
        else if(ret == 25)
            ret = 40;
        else if(ret == 50)
            ret = 38;
        else if(ret == 63)
            ret = 78;
        else if(ret == 83)
            ret = 97;
        else if(ret == 95)
            ret = 76;

        return ret;
    }

    public void printPlayerRound(int oldStep, int newStep, int diceNum)
    {
        char extra;
        if(Math.abs(oldStep - newStep) != diceNum)
            extra = '*';
        else
            extra = ' ';

        System.out.printf(" %-4d|   %d%c | %-4d|", oldStep, diceNum, extra, newStep);
    }

    public void printPlayer(Player player)
    {
        char name = player.getName();
        int step = player.getStep();

        System.out.printf("Player %c, steps : %d\n", name, step);
    }
}
