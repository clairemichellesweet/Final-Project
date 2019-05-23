public class PetShop
    {
        //#20 this class this class calls methods from the pet class
        //array
        public Pet [] shop = new Pet [10];
        
        public PetShop(Pet pet1, Pet pet2, Pet pet3, Pet pet4, Pet pet5, Pet pet6, Pet pet7, Pet pet8, Pet pet9, Pet pet10)
        {
            shop[0] = pet1;
            shop[1] = pet2;
            shop[2] = pet3;
            shop[3] = pet4;
            shop[4] = pet5;
            shop[5] = pet6;
            shop[6] = pet7;
            shop[7] = pet8;
            shop[8] = pet9;
            shop[9] = pet10;
        }
        
        public void addPet(Pet pet, boolean wouldreplace, int indexOfReplace)
        {
            int count = 0;
            //for loop 1
            for (Pet p : shop)
            {
                if (p == null)
                {
                    count++;
                }
            }
            //#2 if-then-else statement
            if (count >0 && count < shop.length)
            {
                //#4 while loop
                int i = 0;
                while (i < shop.length)
                {
                    if (shop[i] == null)
                    {
                        shop[i]=pet;
                        System.out.println("We put your pet in an available space. ");
                        break;
                    }
                    else
                    {
                        i++;
                    }
                
                }
            }
            if (count == shop.length && wouldreplace == false)
            {
                System.out.println("There is no room for your pet");
            }
            if (count == shop.length && wouldreplace == true)
            {
                shop[indexOfReplace] = pet;
                System.out.println("The other pet is kicked out and you get your spot");
            }
        }
        
        //#24 Selection sort method
        public String putPetsInOrder()
        {
            int count = 0;
            Pet temp;
            //put the null at the end of the list so no null exception is thrown
            for (int j=0; j<shop.length; j++){
                if (shop[j]==null){
                    for (int k=j+1; k<shop.length; k++){
                        shop[k-1] = shop[k];
                    }
                    shop[shop.length-1] = null;
                    boolean allNulls = true;
                    for (int k = j; k < shop.length; k++)
                    {
                        if (shop[k] != null)
                        {
                            allNulls = false;
                        }
                    }
                    if (allNulls)
                    {
                        break;
                    }
                    j--;
                }
            }
            // count how many null is in the list so you can sort up to the last null elements 
            //and no exception is thrown
            for (Pet p : shop)
            {
                if (p == null)
                {
                    count++;
                }
            }
            int len = shop.length - count;
            //#24 Selection sort method
            for (int i = 0; i < len; i++) 
            {
                for (int j = i + 1; j < len; j++) 
                {
                    if (shop[i].getAnimal().compareTo(shop[j].getAnimal())>0) 
                    {
                        temp = shop[i];
                        shop[i] = shop[j];
                        shop[j] = temp;
                    }
                }
            }
            
            
            String str = "";
            for (Pet p : shop)
            {
                str += p + "\n";
            }
            return str;
        }
        public String getPet(int indexOfPet)
        {
            //#1 logical operator !
            
            if (!(shop[indexOfPet] == null))
            {
                String string = "Enjoy your new "+ shop[indexOfPet].getAnimal();
                shop[indexOfPet]= null;
                return string;
            }
            else 
            {
                return "There is no animal in that cage";
            }
            
        }
        
        public int inventory()
        {
            int count = 0;
            int index = 0; 
            //#4 do while loop
            do{
                if (shop[index] != null )
                {
                    count ++;
                }
                index ++;
            } while (index < shop.length);
            return count; 
        }
        
        public String animalsAtTheShop()
        {
            String animals= "The animals are : \n";
            //#4 for-each loop
            for (Pet p : shop)
            {
                animals ="- \t"+ p.getAnimal()+"\n";
            }
            return animals;
        }
        
        public String PetWithTheMostTricks()
        {
            //#14 maximum
            Pet pet = shop [0];
            int cage = 0;
            //#4 for loop
            for (int i = 1; i < shop.length; i++)
            {
                if (shop[i].numberOfTricks() > pet.numberOfTricks())
                {
                    pet = shop[i];
                    cage = i;
                }
            }
            return "The "+pet.getAnimal() + "at cage #"+ cage;
        }
        //input upper case letters
        //#7 .equals(), .substring(), and .toUpercase
        public String guessTheAnimal(String guess)
        {
    
                Pet answer = null;
                while (answer == null)
                {
                    answer = shop[(int)(Math.random()*10)];
                }
                
                String solution = answer.getAnimal();
                solution = solution.toUpperCase();
                if (solution.substring(0) == guess.substring(0) && !(solution.equals(guess)))
                {
                    return "You got the first letter the answer was "+ solution;
                }
                else if (solution.equals(guess))
                {
                    return "You got the answer it was "+ solution;
                }
                else
                {
                    return "Sorry you couldn't get it the answer was " + solution;
                }
        }
        
        public String toString()
        {
            String pets = new String();
            //#12 go through the array 
            pets += "The pets are: \n";
            for (int i = 0; i < shop.length; i++ )
            {
                pets += "\t- "+ shop[i]+"\n\n";
            }
            return pets;
        }
}
