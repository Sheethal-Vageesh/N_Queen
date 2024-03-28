import java.util.*;
import board.Board;
import player.Player;

public class App
{
    public static void main(String[] args) throws Exception 
    {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the board size : ");
        int size=(sc.nextLine().charAt(0)-'0');

        Board b=new Board(size);
        b.printBoard();

        System.out.print("Enter player name : ");
        String name=sc.nextLine();
        Player p=new Player(name);
        System.out.println("Player name : "+p.getPlayerName());
        

        sc.close();
    }
}
