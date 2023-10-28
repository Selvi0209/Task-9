import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        
        Scanner obj = new Scanner(System.in);
        
        int userInput = obj.nextInt(); 

        for (int i = 1; i <= userInput; i++) {
            for (int j = 1; j <= userInput; j++) {
                if (j == i || j == userInput - i + 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }

    
      
    }
}