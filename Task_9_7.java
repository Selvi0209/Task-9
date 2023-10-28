import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        
        Scanner obj = new Scanner(System.in);
        
        int x = obj.nextInt(); 
        int y = obj.nextInt(); 
        int z = obj.nextInt(); 
        
        int largestNumber;
        
        if(x > y) {
            largestNumber = x;
        } else {
            largestNumber = y;
        }
        
        
        if(z > largestNumber) {
            largestNumber = z;
        }  
        

        System.out.println("The largest number is : " + largestNumber);

    }
}