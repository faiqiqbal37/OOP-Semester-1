import sheffield.EasyReader;

public class TestFoodStore2 {
    public static void main(String[] args) {

        int refusedTransaction = 0;

        //Creating a keyboard object to take input

        sheffield.EasyReader keyboard = new EasyReader();

        FoodStore myFoodStore = new FoodStore(22);
        FoodStore myFoodStore2 = myFoodStore;

        System.out.println("The result is: " + myFoodStore.equals(myFoodStore2));



        System.out.println(" (Press 0 to end) Please Enter the amount: ");
        //int input = keyboard.readInt();

//        while (input!=0){
//
//            if(input > 0 && input != 0 && myFoodStore.getAmountStored() > 0){
//
//
//                System.out.println(" The Amount Being Deposited Is:  " + input);
//                myFoodStore.depositFood(input);
//
//            }
//            // checking the condition for withdrawal
//            else if(input < 0 && input != 0 && myFoodStore.getAmountStored() > 0 && input > -(myFoodStore.getAmountStored())){
//
//                System.out.println("The amount being withdrawn is:  " + input);
//                myFoodStore.withdrawFood(-(input));
//            }
//            else{
//                System.out.println("Transaction Refused!!");
//                refusedTransaction++;
//            }
//
//            System.out.println("(Press 0 to end) Please Enter the amount: ");
//
//            input = keyboard.readInt();
//
//        }
//
//        System.out.println(myFoodStore.toString() + "\n Refused Transaction: " + refusedTransaction);
    }
}
