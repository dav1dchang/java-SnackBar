package snackbar;

public class Main
{
    private static void workWithData()
    {
        Customer jane = new Customer("Jane", 45.25);
        Customer bob = new Customer("Bob", 33.14);

        VendingMachine food = new VendingMachine("Food");
        VendingMachine drink = new VendingMachine("Drink");
        VendingMachine office = new VendingMachine("Office");

        Snack chips = new Snack("Chips", 1.75, 36, food.getId());
        Snack chocolateBar = new Snack("Chocolate bar", 1.00, 36, food.getId());
        Snack pretzel = new Snack("Pretzel", 2.00, 30, food.getId());
        Snack soda = new Snack("Soda", 2.50, 24, drink.getId());
        Snack water = new Snack("Water", 2.75, 20, drink.getId());

        // Processing
        soda.buySnack(3);
        jane.cashAfterBuyingSnacks(soda.totalCost(3));
        System.out.println("Jane's cash on hand is " + jane.getCashOnHand());
        System.out.println("The quantity of soda remaining is " + soda.getQuantity());
        
        pretzel.buySnack(1);
        jane.cashAfterBuyingSnacks(pretzel.totalCost(1));
        System.out.println("Jane's cash on hand is " + jane.getCashOnHand());
        System.out.println("The quantity of pretzels remaining is " + pretzel.getQuantity());
        
        soda.buySnack(2);
        bob.cashAfterBuyingSnacks(soda.totalCost(2));
        System.out.println("Bob's cash on hand is " + bob.getCashOnHand());
        System.out.println("The quantity of soda remaining is " + soda.getQuantity());

        jane.addCash(10);
        System.out.println("Jane's cash on hand is " + jane.getCashOnHand());

        chocolateBar.buySnack(1);
        jane.cashAfterBuyingSnacks(chocolateBar.totalCost(1));
        System.out.println("Jane's cash on hand is " + jane.getCashOnHand());
        System.out.println("The quantity of chocolate bars remaining is " + chocolateBar.getQuantity());
        
        pretzel.addQuantity(12);
        System.out.println("The quantity of pretzels is now " + pretzel.getQuantity());

        pretzel.buySnack(3);
        bob.cashAfterBuyingSnacks(pretzel.totalCost(3));
        System.out.println("Bob's cash on hand is " + bob.getCashOnHand());
        System.out.println("The quantity of pretzels remaining is " + pretzel.getQuantity());
    }

    public static void main(String[] args)
    {
        workWithData();
    }
}