package pl.pawelzelek;

public class Cat extends Animal{

    public void metodyNadpisane(){
        super.dajGlos();
        super.dajOkrzyk();
    }

    @Override
    public void dajGlos(){
//        super.dajGlos();
        System.out.println("Miau");

    }
}
