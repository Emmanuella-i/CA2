import java.util.Collection;
import java.util.ArrayList;

public interface IMilkable
{

    void milkcow(double amount, DairyCow cow);
    void milkgoat(double amount, Goat goat);

    void milkallcow(double amount, Collection<DairyCow> cows);
    void milkallgoat(double amount, Collection<Goat> goats);



}
