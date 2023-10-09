import org.w3c.dom.ls.LSOutput;

public class TestBasket {

    public static void main (String[] args) {

        sheffield.EasyReader keyboard = new sheffield.EasyReader();


        int choice = 0;
        System.out.println("Please Enter the number of items to be added: ");
        choice = keyboard.readInt();


        Item[] shoppingList = new Item[choice];




        for (int i = 0; i < choice; i++){
            String name;
            double quantity;

            System.out.println("Please Enter the Name of the Item: ");
            name = keyboard.readString();

            System.out.println("Please Enter the price: ");
            quantity = keyboard.readDouble();

            shoppingList[i] = new Item(name, quantity);
        }

        for (int i = 0; i < choice; i++){
            System.out.println(shoppingList[i].toString());
        }

        Basket newBasket = new Basket(shoppingList);

        System.out.println("The total price is: " + newBasket.total());
    }
}
