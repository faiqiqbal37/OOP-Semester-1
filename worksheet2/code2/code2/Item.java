/** Item.java
*
* Part of lab class for COM6516
* Written by Mark Stevenson mark.stevenson@sheffield.ac.uk
* Based on code written by Steve Maddock and Richard Clayton
*
*/

public class Item {

    public Item(String n, double p) {
	name = n;
	price = p;
    }

    public String getName() {
	return name;
    }
    public double getPrice() {
	return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    // using ukp to denote pounds sterling as unicode pound symbol
    // does not display properly in MS Command Window
    public String toString() {
	return ("object type = " + getClass() + "; " + name + " = ukp" + price);
    }

    // instance fields
    private double price;
    private String name;
    

}
