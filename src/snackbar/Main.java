package snackbar;
import java.text.DecimalFormat;

public class Main
{
    private static void workWithData()
    {
        DecimalFormat dFormat = new DecimalFormat("####,###,###.00");
        System.out.println("$" + dFormat.format(1234.567));

        Customer jane = new Customer("Jane", 45.25);
        Customer bob = new Customer("Bob", 33.14);

        VendingMachine food = new VendingMachine("Food");
        VendingMachine drink = new VendingMachine("Drink");
        VendingMachine office = new VendingMachine("Office");

        Snack chips = new Snack("Chips", 1.75, 36, food.getId(), food.getName());
        Snack chocolateBar = new Snack("Chocolate bar", 1.00, 36, food.getId(), food.getName());
        Snack pretzel = new Snack("Pretzel", 2.00, 30, food.getId(), food.getName());
        Snack soda = new Snack("Soda", 2.50, 24, drink.getId(), drink.getName());
        Snack water = new Snack("Water", 2.75, 20, drink.getId(), drink.getName());

        // Processing
        soda.buySnack(3);
        jane.cashAfterBuyingSnacks(soda.totalCost(3));
        System.out.println("Jane's cash on hand is " + "$" + dFormat.format(jane.getCashOnHand()));
        System.out.println("The quantity of soda remaining is " + soda.getQuantity());
        
        pretzel.buySnack(1);
        jane.cashAfterBuyingSnacks(pretzel.totalCost(1));
        System.out.println("Jane's cash on hand is " + "$" + dFormat.format(jane.getCashOnHand()));
        System.out.println("The quantity of pretzels remaining is " + pretzel.getQuantity());
        
        soda.buySnack(2);
        bob.cashAfterBuyingSnacks(soda.totalCost(2));
        System.out.println("Bob's cash on hand is " + "$" + dFormat.format(bob.getCashOnHand()));
        System.out.println("The quantity of soda remaining is " + soda.getQuantity());

        jane.addCash(10);
        System.out.println("Jane's cash on hand is " + "$" + dFormat.format(jane.getCashOnHand()));

        chocolateBar.buySnack(1);
        jane.cashAfterBuyingSnacks(chocolateBar.totalCost(1));
        System.out.println("Jane's cash on hand is " + "$" + dFormat.format(jane.getCashOnHand()));
        System.out.println("The quantity of chocolate bars remaining is " + chocolateBar.getQuantity());
        
        pretzel.addQuantity(12);
        System.out.println("The quantity of pretzels is now " + pretzel.getQuantity());

        pretzel.buySnack(3);
        bob.cashAfterBuyingSnacks(pretzel.totalCost(3));
        System.out.println("Bob's cash on hand is " + "$" + dFormat.format(bob.getCashOnHand()));
        System.out.println("The quantity of pretzels remaining is " + pretzel.getQuantity());

        System.out.println(soda);
    }

    public static void main(String[] args)
    {
        workWithData();
    }
}