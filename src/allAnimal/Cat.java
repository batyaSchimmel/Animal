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
    @Override
    public void sayHello() {
        System.out.println("meow~");
    }

    public void sayHello(int mood) {
        if (mood == super.MOOD_HAPPY) {
            System.out.println("purr, purr");
        } else if (mood == super.MOOD_SCARE) {
            System.out.println("hiss");
        }
    }
}
