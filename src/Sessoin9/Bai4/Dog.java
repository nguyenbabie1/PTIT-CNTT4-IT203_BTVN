package Sessoin9.Bai4;

public class Dog extends Animal {

    public void sound() {
        System.out.println("Dog :)_)_)");
    }

    public void wagTail() {
        System.out.println("Dog ");
    }

    public static void main(String[] args) {

        Animal animal = new Dog();
        animal.sound();

        if (animal instanceof Dog) {
            Dog dog = (Dog) animal;
            dog.wagTail();
        }
    }
}
