import java.util.Collection;

public class MilkingMachine implements IMilkable
{
    private boolean milkTankConnected;
    private GoatMilkTank goattank;
    private CowMilkTank cowtank;


    public MilkingMachine( GoatMilkTank goattank, CowMilkTank cowtank) {

        this.goattank = goattank;
        this.cowtank = cowtank;
    }

    public GoatMilkTank getGoattank()
    {
        return goattank;
    }

    public CowMilkTank getCowtank()
    {
        return cowtank;
    }

    public void setCowmilktank(CowMilkTank tank)
    {
        milkTankConnected = true;
        this.cowtank = cowtank;
    }

    public void setGoattank(GoatMilkTank goattank)
    {
        milkTankConnected = true;
        this.goattank = goattank;
    }

    public void milkcow(double amount, DairyCow cow)
    {
        if(cow.getMilkinglimit() <=4)
        {
            cowtank.addToTank(amount);
        }
    }

    @Override
    public void milkgoat(double amount, Goat goat)
    {
        if(goat.getMilkinglimit() <=4)
        {
            goattank.addToTank(amount);
        }
    }

    @Override
    public void milkallcow(double amount, Collection<DairyCow> cows)
    {
        cowtank.addToTank(amount);
    }

    @Override
    public void milkallgoat(double amount, Collection<Goat> goats)
    {
        goattank.addToTank(amount);
    }

}
