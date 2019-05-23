//#17 JScaner input
import java.util.Scanner;
public class Driver 
{
    //#20 This class calls methods from the PetShop Class 
    public static void main (String [] args)
    {
        Scanner in = new Scanner (System.in);
        //#11 Class Composition in Driver
        PetShop shop = new PetShop(null, 
                                   null, 
                                   new Pet("turtle",false, 2, 1,false),
                                   null, 
                                   new Pet("dog",true, 65, 3 ,true), 
                                   new Pet("cat",false, 15, 1,true), 
                                   new Pet("lizard",true,4, 1,false) ,
                                   new Pet("dog",true, 70,4,false),
                                   new Pet("bird",true, 2, 1 ,false), 
                                   null);
        System.out.println(shop);      
        System.out.println(shop.putPetsInOrder());
        System.out.println("Welcome to Claire-Michelle's Pet Shop");
        System.out.println(shop);
        System.out.println();
        System.out.println("Do you want to do any thing (enter: yes or no)");
        String doSomething = in.next();
        boolean exit = false;
        if (doSomething.equals("yes"))
        {
            while (exit == false )
            {
                System.out.println("What do you want to do? (you can: addpet, getpet, getinventory, or playguesgame)");
                String action = in.next();
                
                if (action.equals("addpet"))
                {
                    //make variables for the pet
                    System.out.println("What kind of amimal do you want to add");
                    String animal = in.next();
                    
                    System.out.println("Does this pet like humans(enter true or false)");
                    boolean likesHuman = in.nextBoolean();
                    
                    System.out.println("How much does this pet weigh");
                    double weight = in.nextDouble();
                    
                    System.out.println("What is the size of this pet on a scale of 1-4");
                    int size = in.nextInt();
                    
                    System.out.println("Would you want this pet(enter true or false)");
                    boolean wantPet = in.nextBoolean();
                    
                    System.out.println("If there is no room would you replace a pet?(enter true or false)");
                    boolean replacePet = in.nextBoolean();
                    if (replacePet == true)
                    {
                        System.out.println("What cage do you want it to go in if you want to replace another pet");
                        int index = in.nextInt();
                        shop.addPet(new Pet(animal, likesHuman, weight, size, wantPet), replacePet, index);
                        System.out.print("The shop now has: \n"+shop);
                    }
                    //want to exit the loop
                    System.out.println();
                    System.out.println("Do you wanna exit the game(enter: true or false)");
                    boolean leave = in.nextBoolean();
                    exit = leave;
                }
                else if (action.equals("getpet"))
                {
                    System.out.println("What cage is the pet in");
                    int cage = in.nextInt()-1;
                    System.out.println(shop.getPet(cage));
                    
                    //want to exit the loop
                    System.out.println();
                    System.out.println("Do you wanna exit the game(enter: true or false)");
                    boolean leave = in.nextBoolean();
                    exit = leave;
                }
                else if (action.equals("getinventory"))
                {
                    System.out.println("There are "+shop.inventory()+" pets in the shop");
                    
                    //want to exit the loop
                    System.out.println();
                    System.out.println("Do you wanna exit the game(enter: true or false)");
                    boolean leave = in.nextBoolean();
                    exit = leave;
                }
                else if (action.equals("playguessgame"))
                {
                    System.out.println("What is the animal you want to guess(in all caps)");
                    String guess = in.next();
                    
                    System.out.println(shop.guessTheAnimal(guess));
                    
                    //want to exit the loop
                    System.out.println();
                    System.out.println("Do you wanna exit the game(enter: true or false)");
                    boolean leave = in.nextBoolean();
                    exit = leave;
                }
                else
                {
                    System.out.println("That is not an option try again");
                    
                    //want to exit the loop
                    System.out.println();
                    System.out.println("Do you wanna exit the game(enter: true or false)");
                    boolean leave = in.nextBoolean();
                    exit = leave;
                }
                
            }
        }
        else if (doSomething.equals("no"))
        {
            System.out.print("OK see you later!");
        }
        else 
        {
          System.out.print("That is not a proper response so you are out the game bye...");  
        }
    }
}
