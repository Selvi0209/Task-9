import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        
        Scanner obj = new Scanner(System.in);
        
        int userInput = obj.nextInt();
        int outputStr = 1;

        for (int i = 1; i <= userInput; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(outputStr + " ");
                outputStr++;
            }
            System.out.println("");
        }
    
      
    }
}