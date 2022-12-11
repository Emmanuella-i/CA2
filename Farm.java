import java.util.ArrayList;


class Farm {
    private String farmid;
    private String owner;
    private static Shed shed;
    private ArrayList<DairyCow> cows;
    private ArrayList<Goat> goats;
    private ArrayList<BeefCow> bcows;
    private ArrayList<Sheep> sheeps;


    public Farm(String farmid, String owner) {
        this.farmid = farmid;
        this.owner = owner;
        this.cows = new ArrayList<DairyCow>();
        this.goats = new ArrayList<Goat>();
        this.bcows = new ArrayList<BeefCow>();
        this.sheeps = new ArrayList<Sheep>();
    }

    public String getFarmid()
    {

        return farmid;
    }

    public String getOwner()
    {
        return owner;
    }

    public ArrayList<DairyCow> getCows()
    {
        return cows;
    }

    public ArrayList<Goat> getGoats()
    {
        return goats;
    }

    public ArrayList<BeefCow> getBcows()
    {
        return bcows;
    }

    public ArrayList<Sheep> getSheeps()
    {
        return sheeps;
    }

    public static boolean addShed()
    {

        shed.addShed();
        return true;
    }

    public static boolean addShedCustom(int capacity)
    {

        shed.addShedCustom(capacity);
        return true;
    }

    //------------------------------------------DAIRY COWS -----------------------------------------------------------------------------------------------------------
    public boolean addNewDairyCow(DairyCow cow)
    {
        if(findDairyCow(cow.getName()) >= 0)
        {
            System.out.println("Cow already in herd");
            return false;
        }
        cows.add(cow);
        return true;
    }

    public boolean removeDairyCow(DairyCow cow)
    {
        int foundPosition = findDairyCow(cow);
        if(foundPosition < 0)
        {
            System.out.println(cow.getName() + ", was not found in herd");
            return false;
        }
        this.cows.remove(foundPosition);
        System.out.println(cow.getName() + ", was deleted from herd");
        return true;
    }

    public void printDairyCows()
    {
        System.out.println("Dairy Cows: ");
        for(DairyCow cow : this.cows)
        {
            System.out.println("DairyCow ID ->"+cow.getId()+", DairyCow Name -> "+cow.getName() + ", Udder cappacity -> " + cow.getUddercapacity()+
                    ", Age -> "+cow.getAge()+", Weight ->"+cow.getWeight());
        }
    }

    public String searchDairyCow(DairyCow cow)
    {
        if(findDairyCow(cow) >=0)
        {
            return cow.getName();
        }
        return null;
    }

    public DairyCow searchDairyCow(String cowName)
    {
        int position = findDairyCow(cowName);
        if(position >=0)
        {
            return this.cows.get(position);
        }
        return null;
    }

    private int findDairyCow(DairyCow cow)
    {
        return this.cows.indexOf(cow);
    }
    private int findDairyCow(String cowName)
    {
        for(int i=0; i < this.cows.size(); i++)
        {
            DairyCow cow = this.cows.get(i);
            if(cow.getName().equals(cowName))
            {
                return i;
            }
        }
        return -1;
    }

    //---------------------------------------------------GOATS -----------------------------------------------------------------------------------------------------------
    public boolean addNewGoat(Goat goat)
    {
        if(findGoat(goat.getName()) >= 0)
        {
            System.out.println("Goat already in herd");
            return false;
        }
        goats.add(goat);
        return true;
    }

    public boolean removeGoat(Goat goat)
    {
        int foundPosition = findGoat(goat);
        if(foundPosition < 0)
        {
            System.out.println(goat.getName() + ", was not found in herd");
            return false;
        }
        this.goats.remove(foundPosition);
        System.out.println(goat.getName() + ", was deleted from herd");
        return true;
    }

    public void printGoats()
    {
        System.out.println("Goats: ");
        for(Goat goat : this.goats)
        {
            System.out.println("Goat ID ->"+goat.getId()+", Goat Name -> "+goat.getName() + ", Udder cappacity -> " + goat.getUddercapacity()+
                    ", Age -> "+goat.getAge()+", Weight ->"+goat.getWeight());
        }
    }

    public String searchGoat(Goat goat)
    {
        if(findGoat(goat) >=0)
        {
            return goat.getName();
        }
        return null;
    }

    public Goat searchGoat(String goatName)
    {
        int position = findGoat(goatName);
        if(position >=0)
        {
            return this.goats.get(position);
        }
        return null;
    }

    private int findGoat(Goat goat)
    {
        return this.goats.indexOf(goat);
    }
    private int findGoat(String goatName)
    {
        for(int i=0; i < this.goats.size(); i++)
        {
            Goat goat = this.goats.get(i);
            if(goat.getName().equals(goatName))
            {
                return i;
            }
        }
        return -1;
    }

    //------------------------------------------BEEFCOWS -----------------------------------------------------------------------------------------------------------
    public boolean addNewBeefCow(BeefCow bcow)
    {
        if(findBeefCow(bcow.getName()) >= 0)
        {
            System.out.println("BeefCow already in herd");
            return false;
        }
        bcows.add(bcow);
        return true;
    }

    public boolean removeBeefCow(BeefCow bcow)
    {
        int foundPosition = findBeefCow(bcow);
        if(foundPosition < 0)
        {
            System.out.println(bcow.getName() + ", was not found in herd");
            return false;
        }
        this.bcows.remove(foundPosition);
        System.out.println(bcow.getName() + ", was deleted from herd");
        return true;
    }

    public void printBeefCows()
    {
        System.out.println("Beef Cows: ");
        for(BeefCow bcow : this.bcows)
        {
            System.out.println("BeefCow ID ->"+bcow.getId()+", BeefCow Name -> "+bcow.getName() + ", Pedigree -> " + bcow.getPedigree()+
                    ", Age -> "+bcow.getAge()+", Weight ->"+bcow.getWeight());
        }
    }

    public String searchBeefCow(BeefCow bcow)
    {
        if(findBeefCow(bcow) >=0)
        {
            return bcow.getName();
        }
        return null;
    }

    public BeefCow searchBeefCow(String bcowName)
    {
        int position = findBeefCow(bcowName);
        if(position >=0)
        {
            return this.bcows.get(position);
        }
        return null;
    }

    private int findBeefCow(BeefCow bcow)
    {
        return this.bcows.indexOf(bcow);
    }
    private int findBeefCow(String bcowName)
    {
        for(int i=0; i < this.bcows.size(); i++)
        {
            BeefCow bcow = this.bcows.get(i);
            if(bcow.getName().equals(bcowName))
            {
                return i;
            }
        }
        return -1;
    }

    //------------------------------------------SHEEP -----------------------------------------------------------------------------------------------------------
    public boolean addNewSheep(Sheep sheep)
    {
        if(findSheep(sheep.getName()) >= 0)
        {
            System.out.println("Sheep already in herd");
            return false;
        }
        sheeps.add(sheep);
        return true;
    }

    public boolean removeSheep(Sheep sheep)
    {
        int foundPosition = findSheep(sheep);
        if(foundPosition < 0)
        {
            System.out.println(sheep.getName() + ", was not found in herd");
            return false;
        }
        this.sheeps.remove(foundPosition);
        System.out.println(sheep.getName() + ", was deleted from herd");
        return true;
    }

    public void printSheep()
    {
        System.out.println("Sheep: ");
        for(Sheep sheep : this.sheeps)
        {
            System.out.println("Sheep ID ->"+sheep.getId()+", Sheep Name -> "+sheep.getName() + ", Pedigree -> " + sheep.getPedigree()+
                    ", Age -> "+sheep.getAge()+", Weight ->"+sheep.getWeight());
        }
    }

    public String searchSheep(Sheep sheep)
    {
        if(findSheep(sheep) >=0)
        {
            return sheep.getName();
        }
        return null;
    }

    public Sheep searchSheep(String sheepName)
    {
        int position = findSheep(sheepName);
        if(position >=0)
        {
            return this.sheeps.get(position);
        }
        return null;
    }

    private int findSheep(Sheep sheep)
    {
        return this.sheeps.indexOf(sheep);
    }
    private int findSheep(String sheepName)
    {
        for(int i=0; i < this.sheeps.size(); i++)
        {
            Sheep sheep = this.sheeps.get(i);
            if(sheep.getName().equals(sheepName))
            {
                return i;
            }
        }
        return -1;
    }

    @Override
    public String toString() {
        return "Farm{" +
                "farmid=" + farmid +
                ", owner='" + owner + '\'' +
                ", shed=" + shed +
                '}';
    }
}


