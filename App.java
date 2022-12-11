import java.util.Random;
import java.util.Scanner;


public class App
{

    private static Scanner keyboard = new Scanner(System.in);
    private static Random rand = new Random();
    private static String i = "D011";
    private static int num = rand.nextInt(9)+1;
    private static int num2 = rand.nextInt(9)+1;
    private static int num3= rand.nextInt(9)+1;
    private static String id = i.replaceAll("0", ""+num+""+num2+""+num3);

    private static Farm myfarm= new Farm(id, "Jhon");


    public static void main(String[] args)
    {
        System.out.println("Welcome to the Farm Simulator");
        FarmOptions selectedOption = FarmOptions.PRINT_MENU;

        boolean quit = false;
        printOptions();

        while (selectedOption != FarmOptions.QUIT)
        {
            System.out.print("\n Enter action: (0 to show available options) ");
            selectedOption = FarmOptions.values()[Integer.parseInt(keyboard.nextLine().trim())];
            switch (selectedOption)
            {
                case PRINT_MENU:
                    printOptions();
                    break;
                case ADD_FARM:
                    addFarm();
                    break;
                case ADD_SHED:
                    addShed();
                    break;
                case ADD_SHED_CUSTOM:
                    addShedCustom();
                    break;
                case SHOW_MILKTANK_FREESPACE:
                    showFreespace();
                    break;
                case ADD_DAIRYCOW:
                    addDairyCow();
                    break;
                case ADD_GOAT:
                    addGoat();
                    break;
                case ADD_BEEFCOW:
                    addBeefCow();
                    break;
                case ADD_SHEEP:
                    addSheep();
                    break;
                case REMOVE_DAIRYCOW:
                    removeDairyCow();
                    break;
                case REMOVE_GOAT:
                    removeGoat();
                    break;
                case REMOVE_BEEFCOW:
                    removeBeefCow();
                    break;
                case REMOVE_SHEEP:
                    removeSheep();
                    break;
                case MILK_DAIRYCOW:
                    milkDairyCow();
                    break;
                case MILK_ALL_DAIRYCOW:
                    milkAllDairyCow();
                    break;
                case MILK_GOAT:
                    milkGoat();
                    break;
                case MILK_ALL_GOAT:
                    milkAllGoat();
                    break;
                case COLLECT_MILK:
                    collectMilk();
                    break;
                case PRINT_ANIMALS:
                    printAnimals();
                    break;

                case QUIT:
                    System.out.println("Shutting down simulator....");
                    quit = true;
                    break;
            }
        }
    }

    private static void removeDairyCow()
    {
        System.out.print("Enter the name of the DairyCow to remove: ");
        String name = keyboard.nextLine();
        DairyCow existing = myfarm.searchDairyCow(name);
        if(existing == null)
        {
            System.out.println("DairyCow not found");
            return;
        }
        myfarm.removeDairyCow(existing);
    }

    private static void removeGoat()
    {
        System.out.print("Enter the name of the Goat to remove: ");
        String name = keyboard.nextLine();
        Goat existing = myfarm.searchGoat(name);
        if(existing == null)
        {
            System.out.println("Goat not found");
            return;
        }
        myfarm.removeGoat(existing);
    }

    private static void removeBeefCow()
    {
        System.out.print("Enter the name of the BeefCow to remove: ");
        String name = keyboard.nextLine();
        BeefCow existing = myfarm.searchBeefCow(name);
        if(existing == null)
        {
            System.out.println("BeefCow not found");
            return;
        }
        myfarm.removeBeefCow(existing);
    }

    private static void removeSheep()
    {
        System.out.print("Enter the name of the Sheep to remove: ");
        String name = keyboard.nextLine();
        Sheep existing = myfarm.searchSheep(name);
        if(existing == null)
        {
            System.out.println("Sheep not found");
            return;
        }
        myfarm.removeSheep(existing);
    }

    private static void addDairyCow()
    {

        System.out.println("Enter name for DairyCow");
        String name = keyboard.nextLine();
        DairyCow newcow = DairyCow.addDairyCow(name);
        if(myfarm.addNewDairyCow(newcow))
        {
            System.out.println("New DairyCow added: name = " + name);
        }
        else
        {
            System.out.println("Cannot add, " + name + ". Already in herd.");
        }
    }

    private static void addGoat()
    {

        System.out.println("Enter name for Goat");
        String name = keyboard.nextLine();
        Goat newgoat = Goat.addGoat(name);
        if(myfarm.addNewGoat(newgoat))
        {
            System.out.println("New Goat added: name = " + name);
        }
        else
        {
            System.out.println("Cannot add, " + name + ". Already in herd.");
        }
    }

    private static void addBeefCow()
    {

        System.out.println("Enter name for BeefCow");
        String name = keyboard.nextLine();
        BeefCow newcow = BeefCow.addBeefCow(name);
        if(myfarm.addNewBeefCow(newcow))
        {
            System.out.println("New BeefCow added: name = " + name);
        }
        else
        {
            System.out.println("Cannot add, " + name + ". Already in herd.");
        }
    }

    private static void addSheep()
    {

        System.out.println("Enter name for Sheep");
        String name = keyboard.nextLine();
        Sheep newsheep = Sheep.addSheep(name);
        if(myfarm.addNewSheep(newsheep))
        {
            System.out.println("New Sheep added: name = " + name);
        }
        else
        {
            System.out.println("Cannot add, " + name + ". Already in herd.");
        }
    }

    private static void showFreespace()
    {
        System.out.println("Freespace for Cow Tank: "+Shed.freeSpaceCow());
        System.out.println("Freespace for Goat Tank: "+Shed.freeSpaceGoat());
    }

    private static void addShed()
    {
        int shedamount = 0;
        if(shedamount>0)
        {

            System.out.println("Standard Shed already added");
        }
        else
        {
            Farm.addShed();
            System.out.println("New shed added. Milktank: Standard Capacity, 2000");
            shedamount = shedamount+1;
        }

    }

    private static void addShedCustom()
    {

        int shedamount = 0;
        if(shedamount>0)
        {

            System.out.println("Custom Shed already added");
        }
        else
        {
            int customcap = 5000;
            Farm.addShedCustom(customcap);

            System.out.println("New shed added. Milktank: Custom Capacity, "+customcap);
            shedamount = shedamount+1;
        }

    }

    public static void milkDairyCow()
    {
        System.out.println("Input name of cow to milk: ");
        String name = keyboard.nextLine();
        DairyCow existing = myfarm.searchDairyCow(name);

        int amount = 300;
        if(existing == null)
        {
            System.out.println("DairyCow not found");
            return;
        }
        if(Shed.getMachine().getCowtank().freeSpace()+amount <= 0)
        {
            System.out.println("Not enough space");
            return;
        }
        System.out.println(name+" milked for "+amount+" litres");
        Shed.milkcow(amount, existing);
    }

    public static void milkGoat()
    {
        System.out.println("Input name of goat to milk: ");
        String name = keyboard.nextLine();
        Goat existing = myfarm.searchGoat(name);
        int amount = 300;
        if(existing == null)
        {
            System.out.println("Goat not found");
            return;
        }

        if(Shed.getMachine().getGoattank().freeSpace()+amount <= 0)
        {
            System.out.println("Not enough space");
            return;
        }
        Shed.milkgoat(Shed.getMachine(), amount, existing);
        System.out.println(name+" milked for 300 litres");
    }

    public static void milkAllDairyCow()
    {

        int amount = 300;
        if(Shed.getMachine().getCowtank().freeSpace()+amount <= 0)
        {
            System.out.println("Not enough space");
            return;
        }


        System.out.println(Shed.milkallcow(amount, myfarm.getCows())+
                "\nCow Tank free space: "+Shed.getMachine().getCowtank().freeSpace());
    }

    public static void milkAllGoat()
    {

        int amount = 300;
        if(Shed.getMachine().getGoattank().freeSpace()+amount <= 0)
        {
            System.out.println("Not enough space");
            return;
        }
        Shed.milkallgoat(amount, myfarm.getGoats());
        System.out.println("All goats have been milked for 300 litres." +
                "\nGoat Tank free space: "+Shed.getMachine().getGoattank().freeSpace());
    }

    public static void collectMilk()
    {

        int amount = 500;
        Shed.getMachine().getCowtank().getFromTank(amount);
        Shed.getMachine().getGoattank().getFromTank(amount);

        System.out.println("You have collected 500 litres of milk. \nGoat Tank free space: "+Shed.getMachine().getGoattank().freeSpace()+
                "\nCow Tank free space: "+Shed.getMachine().getCowtank().freeSpace());
    }

    private static void printOptions()
    {
        System.out.println("\n Available options: ");
        System.out.println("0 - to print all options \n"+
                "1 -  add a farm \n" +
                "2 -  add a new shed\n" +
                "3 -  add a new shed with a custom size milktank\n" +
                "4 -  show remaining milktank space\n" +
                "5 -  add a new dairycow\n" +
                "6 -  add a new goat\n" +
                "7 -  add a new beefcow\n" +
                "8 -  add a new sheep\n" +
                "9 -  remove dairycow\n" +
                "10 - remove goat\n" +
                "11 - remove beefcow\n" +
                "12 - remove sheep\n" +
                "13 - milk one dairycow\n" +
                "14 - milk all dairycow\n" +
                "15 - milk one goat\n" +
                "16 - milk all goat\n" +
                "17 - collect milk\n" +
                "18 - print animals \n" +
                "19 - to quit");
    }

    private static void printAnimals()
    {
        myfarm.printGoats();
        myfarm.printDairyCows();
        myfarm.printBeefCows();
        myfarm.printSheep();
    }

    private static void addFarm()
    {
        System.out.println(myfarm.toString());

    }




}
