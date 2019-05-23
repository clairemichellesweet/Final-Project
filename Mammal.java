//#21 inheritance, pet is a mammal 
public class Mammal extends Pet
{
    private boolean hasFur;
    private boolean hasEggs;
    public Mammal()
    {
        hasFur = true;
        hasEggs = false;
    }
    public String CanPet()
    {
        return "I am nice and furry";
    }
}