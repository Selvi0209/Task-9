import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        
        Scanner obj = new Scanner(System.in);
        
        String useInput = obj.next();
        
        
        String rStr = "";
        
        
        for(int i = (useInput.length() - 1);  i >=0; i-- ) { 
            rStr = rStr + useInput.charAt(i);
        }
        
         System.out.println("The reveresed String is : "+ rStr);   
      
    }
}