public class MilkTank
{
    private final int capacity;
    private double milk;


    public MilkTank(double milk)
    {
        this.capacity = 2000;
        this.milk = 0;
    }

    public MilkTank(int capacity, double milk)
    {
        this.capacity = capacity;
        this.milk = 0;
    }

    public double getCapacity()
    {
        return capacity;
    }


    public double freeSpace()
    {
        double space = (double)capacity - milk;
        return space;
    }

    public void addToTank(double amount)
    {
        if ((amount) <= (double)capacity)
        {
            milk = milk+amount;
        }
    }

    public double getFromTank(double amount)
    {
        milk = milk-amount;
        double space = (double)capacity - milk;

        return space;
    }

    @Override
    public String toString() {
        return "MilkTank{" +
                "capacity=" + capacity +
                ", milk=" + milk +
                '}';
    }
}
