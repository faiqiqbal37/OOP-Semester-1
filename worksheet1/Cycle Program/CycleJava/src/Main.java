

public class Main {
    public static void main(String[] args) {


        final double PI = 3.14;
        final double DIAMETER = 0.665;



        EasyReader fileReader = new EasyReader("src/timings.txt");

        int countOfReadings = fileReader.readInt();

        double[] timeReadings = new double[countOfReadings];
        double[] instantaneousSpeedReadings = new double[countOfReadings];
        double distance = PI * DIAMETER;

        double totalDistance = 0;
        double maxSpeed = 0;
        double totalTime = 0;
        double meanSpeed = 0;
        double totalCountOfSpeeds = 0;


        System.out.println(fileReader + "Printing: " + countOfReadings);

        for (int i = 0 ; i < countOfReadings ; i++){
            timeReadings[i] = fileReader.readDouble();

            instantaneousSpeedReadings[i] = (distance / timeReadings[i]) * 3.6 ;

            totalCountOfSpeeds = totalCountOfSpeeds + instantaneousSpeedReadings[i];

            totalTime = totalTime + timeReadings[i];
            totalDistance = totalDistance + (instantaneousSpeedReadings[i] * timeReadings[i]);

            if(instantaneousSpeedReadings[i] > maxSpeed){
                System.out.println("In innner loop");
                maxSpeed = instantaneousSpeedReadings[i];
            }

            System.out.println("Time Reading" + "[" + (i +1 ) + "] :" + timeReadings[i] );

            System.out.println("\n Instantaneous Speed Reading" + "[" + (i +1 ) + "] :" + instantaneousSpeedReadings[i] );


        }

        totalTime = totalTime /60;
        totalDistance = totalDistance / 1000;
        meanSpeed = totalCountOfSpeeds/countOfReadings;


        System.out.println("The total distance covered is: " + totalDistance);
        System.out.println("The max speed attained is: " + maxSpeed);
        System.out.println("The mean speed attained is: " + meanSpeed);
        System.out.println("The total time consumed is: " + totalTime);




    }
}