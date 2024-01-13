package allAnimal;

public class Dog extends Animal implements Land {
    private final int numberOfLegs;

    //Constructor
    public Dog(boolean mammalas, boolean carnivorous, int mood) {
        super(mammalas, carnivorous, mood);
        numberOfLegs = 4;
    }

    //Implements the interface
    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    //Methods
    @Override
    public void sayHello() {
        System.out.println("wagging their tails");
    }

    public void sayHello(int mood) {
        if (mood == super.MOOD_HAPPY) {
            System.out.println("bark loudly");
            super.mood=1;
        } else if (mood == super.MOOD_SCARE) {
            System.out.println("whooping");
            super.mood=2;
        }
    }
}
