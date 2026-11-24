public class Pet
{
    // instance variables - replace the example below with your own
    private int energy;
    private String name;
    private int hunger;

    /**
     * Constructor for objects of class Pet
     */
    public Pet(String name)
    {
        // initialise instance variables
        this.name = name;
        this.energy = 50;
        this.hunger = 50;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void feedPet()
    {
        // put your code here
        hunger = hunger - 15;
        System.out.println(name + ": :3 yum! ");
    }
    
    public void playWPet(){
        energy = energy - 15;
        hunger = hunger + 15;
        
        System.out.println(name + ": :< I had fun but im tired now ");
        
    }
    
    public void status(){
        System.out.println("Your pets name is " + name);
        System.out.println("Hunger level: " + hunger);
        System.out.println("Energy level: " + energy);
        if (energy < 20){
            System.out.println(name + " is tired!");
        }
    }
    
    public void sleep(){
        energy = energy + 15;
        System.out.println(" :D Nap time!! ");
    }
}