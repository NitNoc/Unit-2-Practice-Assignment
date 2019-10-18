import java.util.Scanner;
/*
 * 1 = rock
 * 2 = paper
 * 3 = scissor
 */
public class Game   {
    static int win = 0, loss = 0, ties = 0;
    static String you = "", opponent = "";
    public static void main(String[] args) {
        boolean turn = true;
        int input = 0;
        String choice = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("RPS");
        System.out.println("*********************************************************");
        System.out.println("Good luck, human ...");

        while(turn == true) {
            System.out.print("What do you throw? [1] Rock, [2] Paper, [3] Scissors? 1");
            input = sc.nextInt();
            System.out.print("");
            outcome(input);
            System.out.println("");
            System.out.print("Play again? [y,n] ");
            System.out.print("");
            choice = sc.next();
            if(choice.equals("y"))  turn = true;
            if(choice.equals("n"))  turn = false;
        }
        if(turn == false)   {
            System.out.println("Wins: " + win);
            System.out.println("Losses: " + loss);
            System.out.println("Ties: " + ties);
        }
    }

    public static void outcome(int _input)    {
        double computer = Math.random() * 3 + 1;
        if(_input == 1) you = "Rock";
        if(_input == 2) you = "Paper";
        if(_input == 3) you = "Scissors";
        if((int) computer == 1) opponent = "Rock";
        if((int) computer == 2) opponent = "Paper";
        if((int) computer == 3) opponent = "Scissors";
        if(_input == 1 && (int) computer == 1 || _input == 2 && (int) computer == 2 || _input == 3 && (int) computer == 3)  {
            ties = ties + 1; 
            System.out.println("You threw " + you + "! I threw " + opponent + "!");
            System.out.println("A draw ... pretty good, human! I demand a rematch ...");
        }   else if(_input == 1 && (int) computer == 3 || _input == 2 && (int) computer == 1 || _input == 3 && (int) computer == 2)  {
            win = win + 1;
            System.out.println("You threw " +you + "! I threw " + opponent + "!");
            System.out.println("Whaaa?? ... You beat me? RAGE!");
        }   else    {
            loss = loss + 1;
            System.out.println("You threw " +you + "! I threw " + opponent + "!");
            System.out.println("I win! You are not a challenge for me ...");
        }
    }
}