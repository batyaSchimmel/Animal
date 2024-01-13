import allAnimal.Cat;
import allAnimal.Dog;
import allAnimal.Frog;

public class Main {
    public static void main(String[] args) {
        Frog frog = new Frog(false, false, 1);
        Cat cat= new Cat(true,true,1);
        Dog dog=new Dog(true,true,1);
        //Dog
        System.out.println("My dog wants to say hello to you, dogs greet people by: ");
        dog.sayHello();
        System.out.println("Dogs have "+dog.getNumberOfLegs() +" legs");
        System.out.println("Is a dog a Mammalian? "+dog.isMammalas());
        System.out.println("Is a dog a Carnivorous? "+dog.isCarnivorous());
        System.out.println("When my dog feel comfortable being touched, it will ");
        dog.sayHello(dog.getMood());
        dog.changeMood();
        System.out.println("When my dog is frightened, it will be ");
        dog.sayHello(dog.getMood());
        
        //Cat
        System.out.println("My cat wants to say hello to you, cats greet people by: ");
        cat.sayHello();
        System.out.println("Cats have "+cat.getNumberOfLegs() +" legs");
        System.out.println("Is a cat a Mammalian? "+cat.isMammalas());
        System.out.println("Is a cat a Carnivorous? "+cat.isCarnivorous());
        System.out.println("When my cat is in a good mood, it does");
        cat.sayHello(cat.getMood());
        cat.changeMood();
        System.out.println("When my cat is frightened, it does ");
        cat.sayHello(cat.getMood());
        
        //Frog
        System.out.println("Frog have "+frog.getNumberOfLegs() +" legs");
        System.out.println("Is a frog a Mammalian? "+frog.isMammalas());
        System.out.println("Is a frog a Carnivorous? "+frog.isCarnivorous());
        System.out.println("Is a frog has gills? "+frog.hasGills());
        System.out.println("Is a frog has lays eggs? "+frog.hasLaysEggs());
        System.out.println("When my frog in a good mood, he does");
        frog.sayHello(frog.getMood());
        frog.changeMood();
        System.out.println("When my frog is frightened, it will  ");
        frog.sayHello(frog.getMood());
    }
}
