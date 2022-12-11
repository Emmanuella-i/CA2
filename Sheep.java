import java.util.Random;

public class Sheep extends Animal
{
    private String name;

    public Sheep(String id, String pedigree, double weight, int age, String name)
    {
        super(id, pedigree, weight, age);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static Sheep addSheep(String name)
    {
        Random rand = new Random();
        String i = "S011";
        String pedi = "£0";

        int agenum = rand.nextInt(12)+9;
        int pedinum = rand.nextInt(1500)+2051;
        int num = rand.nextInt(9)+1;
        int num2 = rand.nextInt(9)+1;
        int num3= rand.nextInt(9)+1;
        String id = i.replaceAll("0", ""+num+""+num2+""+num3);
        String pedigree = pedi.replaceAll("0", ""+pedinum);

        return new Sheep(id, pedigree, 160, agenum, name);
    }

}
