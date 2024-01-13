package allAnimal;
public class Frog extends Animal implements Land, Water {
    private final int numberOfLegs;

    //Constructor
    public Frog(boolean mammalas, boolean carnivorous, int mood) {
        super(mammalas, carnivorous, mood);
        numberOfLegs = 4;
    }

    //Implements the interfaces
    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public boolean hasGills() {
        return true;
    }

    public boolean hasLaysEggs() {
        return true;
    }

    //Methods
    public void sayHello(int mood) {
        if (mood == super.MOOD_HAPPY) {
            System.out.println("quack quack quack");
            super.mood=1;
        } else if (mood == super.MOOD_SCARE) {
            System.out.println("plop into the water");
            super.mood=2;
        }
    }
}
