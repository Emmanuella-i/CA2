import java.util.Random;

public class BeefCow extends Animal
{
    private String name;

    public BeefCow(String id, String pedigree, double weight, int age, String name) {
        super(id, pedigree, weight, age);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static BeefCow addBeefCow(String name)
    {
        Random rand = new Random();
        String i = "B011";
        String pedi = "£0";

        int agenum = rand.nextInt(20)+16;
        int pedinum = rand.nextInt(1500)+2051;
        int num = rand.nextInt(9)+1;
        int num2 = rand.nextInt(9)+1;
        int num3= rand.nextInt(9)+1;
        String id = i.replaceAll("0", ""+num+""+num2+""+num3);
        String pedigree = pedi.replaceAll("0", ""+pedinum);

        return new BeefCow(id, pedigree, 700, agenum, name);
    }

    @Override
    public String toString()
    {
        return "BeefCow{" +
                "name='" + name + '\'' +
                '}';
    }
}
