import java.util.Scanner;

public class TruthTable {

    public void generate(int n){
        //iterate from 0 to 2^n
        for (int i = 0; i < Math.pow(2, n); i++) {

            //convert each number to binary
            String binary = Integer.toBinaryString(i);

            int length = binary.length();

            //add zeros to the left of binary if it takes less than n bit
            if (length < n)
                binary = "0".repeat(n - length) + binary;

            System.out.println(binary);
        }
    }
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n= reader.nextInt();

        TruthTable table = new TruthTable();
        table.generate(n);



    }
}