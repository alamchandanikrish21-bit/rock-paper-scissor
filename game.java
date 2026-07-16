import java.util.Random;
import java.util.Scanner;

public class game {
    public static void main(String[] args) {
        int cwin=0;
        int ywin =0;
        int n=0 ;

        Scanner sc = new Scanner(System.in);
        // System.out.println("welcome to the tic tac toe game ! ");
        // System.out.println("Enter your choice ");
        // System.out.println("1.Stone");
        // System.out.println("2.paper");
        // System.out.println("3.Scissor");
        // int your_choice=sc.nextInt();
        System.out.println("welcome to the Stone Paper and Scissor game ! ");
        Random random = new Random();
        
        // 1. Generates a number: 0, 1, or 2
        
        
        // 2. Decide what to do based on that number
       
        while(  n<=5 ){
        System.out.println("Enter your choice ");
        System.out.println("1.Stone");
        System.out.println("2.paper");
        System.out.println("3.Scissor");
        int your_choice=sc.nextInt();
        int comp_choice = random.nextInt(3)+1; // +1 because comp starts from 0 and go till 2 only 
        System.out.println("your choice  "+ your_choice+"  &computer choice  "+ comp_choice);  
             if (comp_choice == your_choice) {
            System.out.println("Draw!");
            } 
             else if (comp_choice==1 && your_choice==2 || comp_choice==2 && your_choice==3 || comp_choice==3 && your_choice==1 ) {
            System.out.println("you Won !");
            ywin+=1;
            }
            else{
            System.out.println("comp Won !");
            cwin++;
            }
            n++;
        }
        System.out.println("your point  "+ ywin+"computer point  "+ cwin);
    }
}
