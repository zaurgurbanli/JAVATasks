import java.util.Scanner;

public class TruthTable {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = reader.nextInt();

        for (int i =0; i<Math.pow(2,n); i++){
            String binary = Integer.toBinaryString(i);
            int length = binary.length();

            if(length<n)
                binary = "0".repeat(n-length)+binary;

            System.out.println(binary);
        }
    }
}