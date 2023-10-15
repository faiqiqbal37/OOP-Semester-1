import java.util.Arrays;
import java.util.Random;

public class Multiplication {

    // This is a recursive function to calculate the multiplication
    public static void printMultiplicationTable(int number, int count, int column) {
        if (count <= column) {
            int result = number * count;
            System.out.print(result + "\t");
            printMultiplicationTable(number, count + 1, column);
        }
    }

    public static void main(String[] args) {
        System.out.println("Starting the program.....!");

        //The random object for random values
        Random rnd = new Random();

        // Defining the random values for the rows and columns
        int columns = rnd.nextInt(1,10);
        int rows = rnd.nextInt(1,10);

        System.out.println(columns);
        System.out.println(rows);

        System.out.print("\t");
        for (int i = 1; i<=columns; i++){
            System.out.print("\t" + i);
        }
        System.out.println();

        //System.out.println("\t\t1\t2\t3\t4\t5\t6\t7\t8\t9");
        System.out.println("\t\t----------------------------------");

        // First loop is there to iterate till the number of row times
        for(int i = 1 ; i <= rows ; i++){

            System.out.print(  i +"\t" + "|" + "\t");
            printMultiplicationTable(i,1, columns);

            // The second loop is responsible to iterate for the number of column times
            for (int j = 1; j <= rows ; j++){

            }
            System.out.println();

        }
        System.out.println();
    }
}
