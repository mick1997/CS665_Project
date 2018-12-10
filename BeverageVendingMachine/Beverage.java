package BeverageVendingMachine;

public class Beverage implements VendingMachine {

    // instance variable coffee and tea with type of String
    private String[] coffee;
    private String[] tea;

    // constructor Beverage that take coffee and tea as parameters
    public Beverage(String[] coffee, String[] tea) {
        this.coffee = coffee;
        this.tea = tea;
    }

    // the showDrink method that Override from VendingMachine interface that take drinkName as parameter
    // with String type and print drink name
    @Override
    public void showDrink(String drinkName) {
        System.out.println("You have picked " + drinkName);
    }
}
