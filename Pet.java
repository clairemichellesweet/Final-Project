//#23 Polymorphism when determining if the pet is a mammal or nonmammal
import java.util.ArrayList;
public class Pet implements IsFun
{
    //#22 implements inferface
    //#20 This class calls methods from the fun class
    //#9 Class Design-variables 
    //#3 variables
    private boolean hasFur;
    private boolean hasEggs;
    private String animal;
    private boolean likesHumans;;
    private double weight;
    private int size;
    private boolean wantPet;
    //array list
    //#13 Array List within the wrapper class
    private ArrayList <String> tricks = new ArrayList <String>(); 
    
    //#9 Class Design-constructors
    //zero-arg
    public Pet()
    {
        animal = "dog";
        likesHumans = true;
        weight = 50;
        size = 3;
        wantPet=true;
        tricks.add("HandShake");
        
    }
    //multi-arg
    public Pet(String animal,boolean likesHumans, double weight, int size, boolean wantPet)
    {
        this.animal = animal;
        this.likesHumans= likesHumans;
        this.weight = weight;
        this.size = size;
        this.wantPet = wantPet;
        tricks = new ArrayList <String>();
    }
    //#22 the abstract Method
    public boolean Fun()
    {
        if (likesHumans == true)
        {
            return true;
        }
        return false;
    }
    //#9,10setters
    //1
    public void setLikesHumans(boolean likesHumans)
    {
        this.likesHumans = likesHumans;
    }
    //2
    public void setWantPet (boolean wantPet)
    {
        this.wantPet = wantPet;
    }
    //#9,10getters
    //1
    public int getSize()
    {
        return size;
    }
    //2
    public double weight()
    {
        return weight;
    }
    //3
    public int numberOfTricks()
    {
        return tricks.size();
    }
    //4
    public String getAnimal()
    {
        return animal;
    }
    //#10 overload methods-the other over load is in the petshop
    //#9 processor methods
    //overload 1
    public String personality(double weight)
    {
        //# 1 rational operators < and > and logical operators &&
        //logical and rational operators
        //#2 if-then else and thrown exception
        if (weight>0 && weight<20)//
        {
            return "That is a pretty small pet seems nice to me.";
        }
        else if (weight>=20 && weight<40)
        {
            return "Dang that is kinda big I would stay cautious.";
        }
        else if (weight>=40 && weight<60)
        {
            return "Wooahh that is one big animal!!";
        }
        else if(weight>=60 && weight<100)
        {
            return "Ahhhhh!! That is scary";
        }
        else
        {
            throw new IllegalArgumentException("That weight just doesn't make sense");
        }
    }
    //overload 2
    public String personality ()
    {
        //#6 Math.random() 
        //#8 casting
        return tricks.get((int)(Math.random()*tricks.size()));
    }
    //#10 student made
    //1
    public void addTrick(String trick)
    {
        tricks.add(trick);
    }
    //2
    public String howMuchYourPetCosts()
    {
        double cost = 0;
        //#6 Math.pow()
        cost = weight/(Math.pow(size,2));
        return "Your pet costs"+cost;
    }
    //3
    public String sizeRate(Pet pet)
    {
        int s = pet.getSize();
        String exclaim = "";
        //#5 switch statement
        switch (s) 
        {
            case 1:
                exclaim = "That's small";
                break;
            case 2:
                exclaim = "That's kinda big";
                break;
            case 3:
                exclaim = "That's huge";
                break;
            case 4:
                exclaim = "Not even the army could take that thing down";
                break;
            default:
                exclaim = "That's not a size option";
        }
        return exclaim;
    }
    //4 
    public String tricks()
    {
        //#13 traverse through the Array List
        String string = new String();
        for (String trick : tricks)
        {
            string = trick+" ";
        }
        return string;
    }
    //#9 Class Design-to String
    public String toString()
    {
        return "The animal is: "+ animal+ "\n"+
               "\tThe size is: "+size+"\n"+
               "\tLikes humans: "+likesHumans;
    }
}
