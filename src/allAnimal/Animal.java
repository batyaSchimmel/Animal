package allAnimal;

public abstract class Animal {
    protected boolean mammalas;
    protected boolean carnivorous;
    protected int mood;
    protected final int MOOD_HAPPY=1;
    protected final int MOOD_SCARE=2;
    //Constructor
    public Animal(boolean mammalas, boolean carnivorous, int mood){
        this.mammalas=mammalas;
        this.carnivorous=carnivorous;
        this.mood=mood;
    }
    public abstract void sayHello(int mood);
    public void sayHello(){};

    //Getters & Setters
    public boolean isMammalas(){
    return mammalas;
    }
    public void setMammalas(boolean mammalas){
    this.mammalas=mammalas;
    }
    public boolean isCarnivorous(){
    return carnivorous;
    }
    public void setCarnivorous(boolean carnivorous){
    this.carnivorous=carnivorous;
    }
}