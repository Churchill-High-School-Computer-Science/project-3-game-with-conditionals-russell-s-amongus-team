import java.util.Scanner;

public class wordle
{
    public static void main(String[] args)
    {
        String[] wordlist = {"edge, goon, rizz"};
        String correctWord = wordlist[(int)(Math.random()*3)];
        
        Scanner s = new Scanner(System.in);

        System.out.println("Welcome to brainrot wordle.");
        System.out.println("Girl put in that word");
        String userGuess1 = s.next();

        if(userGuess1 == correctWord){
            System.out.println("Congratulations you skibidi genius ");
        }
        else if(userGuess1 != correctWord){
            
        }

        


        

    }
}
