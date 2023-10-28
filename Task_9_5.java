import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        
        Scanner obj = new Scanner(System.in);
        
        int userInput = obj.nextInt(); 

        if (userInput > 100) {
            System.out.println("Invalid Input");
        } else { 
            
            if(userInput == 100) {
                 System.out.println("S");
                return;
            }
            else if(userInput >= 90 && userInput <= 99) {
                System.out.println("A");
                return; 
            } else if(userInput >= 80 && userInput <= 89) {
                System.out.println("B");
                return;
            } else if(userInput >= 70 && userInput <= 79) {
                System.out.println("C");
                return;
            } else if(userInput >= 60 && userInput <= 69) {
                System.out.println("D");
                return;
            } else if(userInput >= 50 && userInput <= 59) {
                System.out.println("E");
                return;
            } else {
                System.out.println("F");
                return;
            } 
        } 
      
    }
}