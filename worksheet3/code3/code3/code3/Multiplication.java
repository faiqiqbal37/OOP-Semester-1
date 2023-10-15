public class Multiplication {

    public static void printMultiplicationTable(int number, int count) {
        if (count <= 9) {
            int result = number * count;
            System.out.print(result + "\t");
            printMultiplicationTable(number, count + 1);
        }
    }

    public static void main(String[] args) {
        System.out.println("Starting the program.....!");

        System.out.println("\t\t1\t2\t3\t4\t5\t6\t7\t8\t9");
        System.out.println("\t\t----------------------------------");

        for(int i = 1 ; i <= 9 ; i++){

            System.out.print(  i +"\t" + "|" + "\t");
            printMultiplicationTable(i,1);

            for (int j = 1; j <= 9 ; j++){

            }
            System.out.println();

        }
        System.out.println();
    }
}
