package snackbar;

public class Customer
{
    // info
    private static int maxId = 0;

    private int id;
    private String name;
    private double cashOnHand;

    // constructor
    public Customer(String name, double cashOnHand)
    {
        maxId++;
        id = maxId;

        this.name = name;
        this.cashOnHand = cashOnHand;
    }

    // getters and setters
    public int getId()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public double getCashOnHand()
    {
        return cashOnHand;
    }

    public void setCashOnHand(double cashOnHand)
    {
        this.cashOnHand = cashOnHand;
    }

     public void addCash(double cash)
    {
        this.cashOnHand += cash;
        // System.out.println("Added cash, new total is" + cashOnHand);
    }

    public void cashAfterBuyingSnacks(double costOfSnacks)
    {
        this.cashOnHand -= costOfSnacks;
        // System.out.println("Bought snacks, cash on hand is now" + cashOnHand);
    }
}