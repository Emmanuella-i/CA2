public class Animal
{
    private String id;
    private String pedigree;
    private double weight;
    private int age;

    public Animal(String id, String pedigree, double weight, int age)
    {
        this.id = id;
        this.pedigree = pedigree;
        this.weight = weight;
        this.age = age;
    }

    public String getId()
    {
        return id;
    }



    public String getPedigree()
    {
        return pedigree;
    }

    public double getWeight()
    {
        return weight;
    }

    public int getAge()
    {
        return age;
    }
}
