import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;

public class Shed
{
    private String shedid;
    private static GoatMilkTank goattank;

    private static CowMilkTank cowtank;
    private static MilkingMachine machine;
    private ArrayList<DairyCow> cows;
    private ArrayList<Goat> goats;

    public Shed(String shedid, MilkingMachine machine) {
        this.shedid = shedid;
        this.goattank = goattank;
        this.machine = machine;
    }


    public GoatMilkTank getGoattank() {
        return goattank;
    }

    public CowMilkTank getCowtank() {
        return cowtank;
    }

    public String getShedid() {
        return shedid;
    }

    public static MilkingMachine getMachine() 
    {
        return machine;
    }

    public ArrayList<DairyCow> getCows() {
        return cows;
    }

    public ArrayList<Goat> getGoats() {
        return goats;
    }

    public void setMachine(MilkingMachine machine)
    {
        this.machine = machine;
    }

    public static Shed addShed()
    {
        double milk = 0;
        Random rand = new Random();
        String i = "SH011";
        int num = rand.nextInt(9)+1;
        int num2 = rand.nextInt(9)+1;
        int num3= rand.nextInt(9)+1;
        String id = i.replaceAll("0", ""+num+""+num2+""+num3);
        return new Shed(id, new MilkingMachine(new GoatMilkTank(milk), new CowMilkTank(milk)));
    }



    public static Shed addShedCustom(int capacity)
    {
        double milk = 0;
        Random rand = new Random();
        String i = "SH011";
        int num = rand.nextInt(9)+1;
        int num2 = rand.nextInt(9)+1;
        int num3= rand.nextInt(9)+1;
        String id = i.replaceAll("0", ""+num+""+num2+""+num3);
        return new Shed(id, new MilkingMachine(new GoatMilkTank(capacity, milk), new CowMilkTank(capacity, milk)));
    }

    public static double freeSpaceCow()
    {
        return Shed.getMachine().getCowtank().freeSpace();
    }

    public static double freeSpaceGoat()
    {
        return Shed.getMachine().getGoattank().freeSpace();
    }



    public static void milkcow(double amount, DairyCow cow)
    {
        Shed.getMachine().milkcow(amount, cow);
        
    }

    public static void milkgoat(MilkingMachine machine, double amount, Goat goat)
    {
        Shed.getMachine().milkgoat(amount, goat);
        
    }

    public static String milkallcow(double amount, Collection<DairyCow> cows)
    {
        for(DairyCow cow : cows)
        {
            Shed.getMachine().milkallcow(amount, cows);
        }

        return "All cows milked";
    }

    public static void milkallgoat(double amount, Collection<Goat> goats)
    {
        for(Goat goat : goats)
        {
            Shed.getMachine().milkallgoat(amount, goats);
        }
    }

    @Override
    public String toString() {
        return "Shed{" +
                "shedid=" + shedid +
                ", goattank=" + goattank +
                ", cowtank=" + cowtank +
                ", machine=" + machine +
                ", cows=" + cows +
                ", goats=" + goats +
                '}';
    }
}
