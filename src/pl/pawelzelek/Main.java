package pl.pawelzelek;

import java.io.File;
import java.io.FileWriter;
import java.util.Formatter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

File f = new File("plik.json");
if (!f.exists()) {
    try {
        f.createNewFile();
        System.out.println("Plik został utworzony");
    } catch (Exception e){
        System.out.println(e.getMessage());
    }
}
if(f.canWrite()){
    try{
        FileWriter fw = new FileWriter(f,true);
        Formatter fm = new Formatter(fw);

        Scanner sf  = new Scanner(f);
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj tekst do pliku");
        String tekst =  sc.nextLine();
        fm.format("%s \r\n",tekst);
        System.out.println("Zapisano do pliku");
        fm.close();
        fw.close();

        System.out.println("\nZawartość pliku");
        while(sf.hasNextLine()){
            System.out.println(sf.nextLine());
        }
        sc.close();
        sf.close();


    }catch(Exception e){
        System.out.println(e.getMessage());
    }
}


//PlikZapis.SaveFile();
//PlikZapis nowyPlik = new PlikZapis()


//        Animal kot = new Cat();
//        kot.dajGlos();
//
//        Animal pies = new Dog();
//        pies.dajGlos();
//        ((Dog)pies).idz();
//
//        Anim aa = new Anim() {
//            @Override
//            public void klasaAbs() {
//                System.out.println("helllo");
//            };
//        };
    }
}
