import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        
        Scanner obj = new Scanner(System.in);
        
        int month         = obj.nextInt(); 
        double perDayRent = obj.nextInt(); 
        int noofDays      = obj.nextInt(); 
        
        double outputValue = 0.00;        
        
        switch (month) {
            case 4:
            case 5:
            case 6:
            case 11:
            case 12:
                perDayRent = perDayRent * 1.20; // 20% increase during peak season
                break;
            default:
                break;
        }
            
        outputValue = perDayRent * noofDays;

        System.out.println("The hotel room traiff is : " + outputValue);

      
    }
}