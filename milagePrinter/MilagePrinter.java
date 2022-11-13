import java.util.Scanner;
  
public class MilagePrinter {   
    
    static final double COST_PER_GALLON = 3.95;  
    
    public static void main(String[] args) {         
        Scanner reader = new Scanner(System.in);    
        
        System.out.print("Enter the number of gallons of gas in the tank: ");
        double gallons = reader.nextDouble();         
        System.out.print("Enter the fuel efficiency: ");         
        double efficiency = reader.nextDouble();  
        
        if (efficiency <= 0) System.out.print("No can go");         
        else {             
            System.out.format("Distance: %.1f%n", gallons * efficiency); 
            System.out.format("Cost: %.2f%n", (100/efficiency)*COST_PER_GALLON);
        }      
    } 
}