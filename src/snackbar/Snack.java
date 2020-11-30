package snackbar;

public class Snack
{
    // info
    private static int maxId = 0;

    private int id;
    private String name;
    private double cost;
    private int quantity;
    private int vendingMachineId;

    // constructor
    public Snack(String name, double cost, int quantity, int vendingMachineId)
    {
        maxId++;
        id = maxId;

        this.name = name;
        this.cost = cost;
        this.quantity = quantity;
        this.vendingMachineId = vendingMachineId;
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

    public double getCost()
    {
        return cost;
    }

    public void setCost(double cost)
    {
        this.cost = cost;
    }

    public int getVendingMachineId()
    {
        return vendingMachineId;
    }

    public void setVendingMachineId(int vendingMachineId)
    {
        this.vendingMachineId = vendingMachineId;
    }

    public int getQuantity()
    {
        return quantity;
    }

    public void setQuantity(int quantity)
    {
        this.quantity = quantity;
    }

    public void addQuantity(int addQuantity)
    {
        this.quantity += addQuantity;
        // System.out.println("Added quantity to snacks" + quantity);
    }

    public void buySnack(int snacksBought)
    {
        this.quantity -= snacksBought;
        // System.out.println(snacksBought + " were bought, your new total is now " + quantity);
    }

    public double totalCost(int quantityOfSnacks)
    {
        return this.cost * quantityOfSnacks;
    }
}