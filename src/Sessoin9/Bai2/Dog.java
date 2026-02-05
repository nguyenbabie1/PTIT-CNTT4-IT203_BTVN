package Sessoin9.Bai2;

public class Dog extends Animal{
    @Override
    public void sound(){
        System.out.println("huuuuuuuuuuuuuuuus");
    }
    static void main (String[] args){
        Dog c = new Dog();
        c.sound();
    }
}

