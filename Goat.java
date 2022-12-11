import java.util.Random;

public class Goat extends Animal
{
    private String name;
    private int milkinglimit;
    private double uddercapacity;

    public Goat(String id, String pedigree, double weight, int age, String name, int milkinglimit, double uddercapacity)
    {
        super(id, pedigree, weight, age);
        this.name = name;
        this.milkinglimit = milkinglimit;
        this.uddercapacity = uddercapacity;
    }

    public String getName()
    {
        return name;
    }

    public int getMilkinglimit()
    {
        return milkinglimit;
    }

    public double getUddercapacity()
    {
        return uddercapacity;
    }

    public static Goat addGoat(String name)
    {
        Random rand = new Random();
        String i = "G011";
        int agenum = rand.nextInt(20)+16;
        int uddernum = rand.nextInt(40)+21;
        int num = rand.nextInt(9)+1;
        int num2 = rand.nextInt(9)+1;
        int num3= rand.nextInt(9)+1;
        String id = i.replaceAll("0", ""+num+""+num2+""+num3);
        return new Goat(id, null, 640, agenum, name, 4, uddernum);
    }
}
