import java.util.Random;
import java.util.Scanner;

class Game{
    public int number;
    public int inputNumber;
    public int noOfGuesses;

    public int getNoOfGuesses() {
        return noOfGuesses;
    }

    public void setNoOfGuesses(int noOfGuesses) {
        this.noOfGuesses = noOfGuesses;
    }

     Game(){
        Random rand=new Random();
        this.number=rand.nextInt(100);
    }
   void  takeUserInput(){
        System.out.println("Guess the number= ");
        Scanner sc=new Scanner(System.in);
        inputNumber=sc.nextInt();
       // return inputNumber;

   }
    boolean isCorrectNumber(){
        noOfGuesses++;
        if(inputNumber==number){
            System.out.format("Yes ou guessed is right %d\n You guessed it in %d attempts ",number,noOfGuesses);
            return true;
        }
        else if(inputNumber<number){
            System.out.println("Number is too less");
        }
        else if(inputNumber>number){
            System.out.println("Number is too High");
        }
        return false;

    }
}
public class exercise3_gussthe_NUmber {
    public static void main(String[] args) {
        /*
        Create a class Game, Which allows a user to play guss the number
        game once . Game should have the following method
        1.Constructor to generate the random number
        2.takeUserInput() to take a user input of number
        3.isCorrectNumber() to detect whether the number entered by the user is
        4.getter and setter for noOfGuesses
        Use properties such as noOfGuesses(int), etc to get this task done!

         */
        Game g= new Game();
        boolean b=false;
        while (!b) {
            g.takeUserInput();
            b = g.isCorrectNumber();
            System.out.println(b);
        }


    }
}
