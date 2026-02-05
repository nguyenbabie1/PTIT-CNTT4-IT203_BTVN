package Sessoin9.Bai3;

public class Dog extends Animal {
    private String breed;

    public Dog(String name, String breed) {
        super(name);
        this.breed = breed;
    }

    public void showInfo() {
        System.out.println("Ten: " + name);
        System.out.println("Giong: " + breed);
    }
    public static void main(String[] args) {
        Dog dog = new Dog("Lu", "Husky");
        dog.showInfo();
    }
}