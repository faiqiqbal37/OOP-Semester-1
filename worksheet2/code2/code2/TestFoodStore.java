public class TestFoodStore {
    public static void main(String[] args) {

        FoodStore myFoodStore = new FoodStore(10);

        myFoodStore.depositFood(22);

        myFoodStore.withdrawFood(12);


        System.out.println("Contains: " + myFoodStore.getAmountStored());

        System.out.println(myFoodStore.toString());
    }

}
