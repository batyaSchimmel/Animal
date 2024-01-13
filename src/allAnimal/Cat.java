package allAnimal;

public class Cat extends Animal implements Land {
    private final int numberOfLegs;

    //Constructor
    public Cat(boolean mammalas, boolean carnivorous, int mood) {
        super(mammalas, carnivorous, mood);
        numberOfLegs = 4;
    }

    //Implements the interface
    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    //Methods
    public void sayHello() {
        System.out.println("meow~");
    }

    @Override
    public void sayHello(int mood) {
        if (mood == super.MOOD_HAPPY) {
            System.out.println("purr, purr");
            super.mood=1;
        } else if (mood == super.MOOD_SCARE) {
            System.out.println("hiss");
            super.mood=2;
        }
    }
}
