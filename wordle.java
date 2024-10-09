import java.util.Scanner;

public class wordle
{
    public static void main(String[] args)
    {
        String[] wordlist = {"rizz","ohio","skib","chat","pork","beta","chad","baka","suss","aura", "siwa","blud", "mogs"};
        String correctWord = wordlist[(int)(Math.random()* wordlist.length)];
        
        Scanner s = new Scanner(System.in);

        System.out.println("Welcome to brainrot wordle.");
        System.out.println("Gurl put in that word - 3 attempts to guess the 4 letter word");

       boolean isCorrect = false;
        int attempts = 3;

        while(attempts > 0 && !isCorrect) {
            System.out.println("Enter your guess:");
            String userGuess = s.next();
           userGuess = userGuess.toLowerCase();  
            if(userGuess.equals(correctWord)) {
                System.out.println("Congratulations! You skibidi genius!");
                isCorrect = true;
            
            } else if(userGuess.equals("kuma")) {
                System.out.println("You sir... y-you have cracket the secret code!! *they all sing* KUMALALA KUMALALA KUMALA SEVESTA");
                isCorrect = true;}
            else {
                attempts--;
                
               
                if(userGuess.length() == 4) {
                    for(int i = 0; i < 4; i++) {
                        if(userGuess.charAt(i) == correctWord.charAt(i)) {
                            System.out.println("Letter " + (i + 1) + ": Correct!");
                        } else if(correctWord.contains(Character.toString(userGuess.charAt(i)))) {
                            System.out.println("Letter " + (i + 1) + ": In the word but wrong position.");
                        } else {
                            System.out.println("Letter " + (i + 1) + ": Not in the word.");
                        }
                    }
                } else {
                    System.out.println("Your guess must be exactly 4 letters.");
                }

               
                if(attempts > 0 && !isCorrect) {
                    System.out.println("Try again. You have " + attempts + " attempt(s) left.");
                } else if (attempts == 0) {
                    System.out.println("Game over! The correct word was: " + correctWord);
                }
                
            }
        }
        s.close();
    }
    
}

//From the screen to the ring to the pen to the king 
//MS GHENT HAVE A WONDERFUL SKIBY DAY <333333
//kumalala kumalala kumalala savesta
//in the thick of it - ksi