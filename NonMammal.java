//#21 inheritance, pet is a nonMammal
public class NonMammal extends Pet
{
    private boolean hasFur;
    private boolean hasEggs;
    public NonMammal()
    {
        hasFur = false;
        hasEggs = true;
    }
    public String CanPet()
    {
        return "I am not fun to pet";
    }
}