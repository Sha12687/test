// import java.io.*;
import java.util.Random;
import java.util.Scanner;

//import javax.lang.model.util.ElementScanner6;
public class SessionPaperRock {
 
   public enum Move{
        PAPER("paper"),
        ROCK("rock"),
        SCISSORS("scissors");
        
        private String action;
  
        // getter method
        public String getAction()
        {
            return this.action;
        }
      
        // enum constructor - cannot be public or protected
        private Move(String action)
        {
            this.action = action;
        }


    }
    public static String PlayerInput(){
        Scanner sc=new Scanner(System.in);
        String choice=sc.nextLine();
        String playerchoice =choice.toUpperCase();
        if(playerchoice.equals("PAPER")|| playerchoice.equals("ROCK")||playerchoice.equals("SCISSORS")){
            return playerchoice;
        }
        else{
            System.out.println("this is not a valid Move");
            return "Bad Input";
        }
    }
    public static String computerInpu(){
        String computerchoice;
        Random rand=new Random();
        int a=rand.nextInt(3)+1 ;
      if(a==1){
       return  computerchoice=Move.PAPER.name();
      }
      else if(a==2){
        return  computerchoice=Move.ROCK.name();
      }
      else {
        return  computerchoice =Move.SCISSORS.name();
      }
    }
    public static void main(String[] args) {

        
        System.out.println(Move.ROCK.getAction());
//         System.out.println("Welcome to Rock Paper Game! \nYour's Game partner is Computer. \nEnter Your Move:  ");
//         System.out.println("ROCK");
//         System.out.println("PAPER");
//         System.out.println("SCISSORS");
//         String getplayermove=PlayerInput();
//         String getcomputermove=computerInpu();
//         System.out.println("Your move is: "+ getplayermove);
//  if(!getplayermove.equals("Bad Input")){
//      System.out.println("Computer  move is :" + getcomputermove);
//      if(getplayermove.equals(getcomputermove)){
//         System.out.println("Game is Tie !!");
//      }
//  else if(getplayermove.equals(move.ROCK.name())){
//      if(getcomputermove.equals(move.PAPER.name())){
//         System.out.println("Computer Winsss");
//         System.out.println("Better Luck Nexxt Time!");
//      }
//      else {
//         System.out.println("You Win!!!!");
//         System.out.println("OOhhOO, Congratulions!!! ");
//     }
//  }
//  else if (getplayermove.equals(move.PAPER.name())) {
//     if(getcomputermove.equals(move.SCISSORS.name())) { 
//         System.out.println("Computer Wins");
//         System.out.println("Better Luck Next Time!");
//     }
//     else { 
//         System.out.println("You Win!");
//         System.out.println("OOhhOO, Congratulations!!! ");
//     }
// }
//  else{
//      if(getcomputermove.equals(move.ROCK.name())){
//         System.out.println("Computer Wins");
//         System.out.println("Better Luck Next Time!");
//      }
//      else{ 
//         System.out.println("You Win!");
//         System.out.println("OOhhOO, Congratulations!!! ");
//     }
//  }
// }
     }
}
