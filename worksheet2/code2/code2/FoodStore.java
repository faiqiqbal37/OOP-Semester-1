/*
 * FoodStore.java  1.0 26/08/2011
 *
 * Copyright (c) University of Sheffield 2011
 */

/**
* FoodStore.java
*
* A simple class used in COM6516 lab class
*
*/

// this line of code declares the class
public class FoodStore {

    // this is the constructor, which is called when a new object is created
    // the constructor name is always the same as the class name
    // classes can have more than one constructor
    // the constructor takes zero or more parameters
    // in this case there is one parameter (int a) that is used to set the
    // instance field of the class
    public FoodStore(int a) {
	amountStored = a;
	amountDeposited = 0;
	amountWithdrawn = 0;
    countOfDeposits = 0;
    countOfWithdrawls = 0;
    }

    public boolean equals(FoodStore obj){
        if(obj == null){
            return false;
        }
        else if (this == obj){
            return true;
        }
        else if (this.getClass() != obj.getClass()){
            return false;
        }else{
            return false;
        }
    }

    // these are class methods, which enable the value of the instance
    // field to be modified
    // these methods have a public access modifier, because they need to
    // be called by other classes
    // neither class method returns anything, so the return type is void
    public void depositFood(int amountToDeposit) {
	amountStored = amountStored + amountToDeposit;
	amountDeposited += amountToDeposit;
    incrementDeposits();
    }
    public void withdrawFood(int amountToWithdraw) {
	amountStored = amountStored - amountToWithdraw;
	amountWithdrawn += amountToWithdraw;
    incrementWithdrawls();
    }

    // these are accessor methods, which return the value of the instance field
    public int getAmountStored() {
	return(amountStored);
    }

    public int getCountOfWithdrawls() {
        return countOfWithdrawls;
    }

    public void setCountOfWithdrawls(int countOfWithdrawls) {
        this.countOfWithdrawls = countOfWithdrawls;
    }

    public void incrementDeposits(){
        this.countOfDeposits++;
    }

    public void incrementWithdrawls(){
        this.countOfWithdrawls++;
    }

    public int getCountOfDeposits() {
        return countOfDeposits;
    }

    public void setCountOfDeposits(int countOfDeposits) {
        this.countOfDeposits = countOfDeposits;
    }

    public String toString () {
	return ("AmountStored = " + amountStored + " AmountDeposited = "
		+ amountDeposited + " AmountWithdrawn = " + amountWithdrawn + " Total Number of Withdraws: " + countOfWithdrawls + " Total Number of Deposits: " + countOfDeposits);
    }

    // this is the instance field, which is an attribute associated with
    // each object of the FoodStore class
    // the access modifier is private, which means that this field can 
    // only be accessed through the class methods
    // by keeping instance fields private there is a well specified interface 
    // to the data associated with each object
    // this approach is called encapsulation
    private int amountStored;
    private int amountDeposited;
    private int amountWithdrawn;

    private int countOfWithdrawls;

    private int countOfDeposits;

}
