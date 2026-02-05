package Sessoin9.Bai2;

public class cat extends Animal{
    @Override
    public void sound(){
        System.out.println("ahhaahahahahahahahahah");
    }
    static void main (String[] args){
        cat c = new cat();
        c.sound();
    }
}

