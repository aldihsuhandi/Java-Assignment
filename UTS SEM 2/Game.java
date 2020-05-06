import java.util.ArrayList;
import java.util.Collections;

public class Game
{
    int totalPlayer;
    int maxStep;
    ArrayList<Player> players = new ArrayList<>();
    Function fun = new Function();

    public void initializeGame(int totalPlayer)
    {
        maxStep = 1;
        this.totalPlayer = totalPlayer;
        for(int i=0;i<totalPlayer;++i){
            char name = (char)((int)'A' + i);
            players.add(new Player(name, 1));
        }
    }

    public void inGame()
    {
        fun.printHeaders(totalPlayer);
        for(int i=1;i<=25 && maxStep != 100;++i){
            System.out.printf("|  %-4d|", i);
            for(int j=0;j<totalPlayer;++j){
                Player player = players.get(j);
                int step = player.getStep();
                int diceNum = fun.getRandNum();
                int newStep = fun.newStep(step, diceNum);
                
                if(newStep > maxStep)
                    maxStep = newStep;

                fun.printPlayerRound(step, newStep, diceNum);
                players.get(j).setStep(newStep);
            }

            System.out.println();
        }
        if(totalPlayer == 3)
            System.out.println("|===============================================================|");
        else
            System.out.println("|============================================|");
    }

    public void printWinner()
    {
        Collections.sort(players, Collections.reverseOrder());

        System.out.println("\nWinners:");
        for(int i=0;i<totalPlayer;++i){
            System.out.printf("%d. ", i+1);
            fun.printPlayer(players.get(i));
        }

        System.out.println();

        players.clear();
    } 
}
