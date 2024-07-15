package projekatcs101;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Sistem {
    public static void start() throws FileNotFoundException, IOException, Izuzetak{
        Majice majica = new Majice();
        Pantalone pantalone = new Pantalone();
        Trenerke trenerka = new Trenerke();
        Jakne jakna = new Jakne();
        Scanner sc = new Scanner(System.in);
        String dsds;
        String sdsd;
        System.out.println("-----------------------");
        System.out.println("Sta zelite da uradite?");
        System.out.println("1. Unos proizvoda");
        System.out.println("2. Ispis proizvoda");
        System.out.println("3. Zatvori program");
        System.out.println("-----------------------");
        dsds=sc.next();
        if(dsds.equals("1")){
            System.out.println("--------------------");
            System.out.println("Koji od proizvoda zelite da unesete?");
            System.out.println("1. Majica");
            System.out.println("2. Pantalone");
            System.out.println("3. Trenerka");
            System.out.println("4. Jakna");
            System.out.println("--------------------");
            sdsd=sc.next();
            if(sdsd.equals("1")){
                majica.unos();
            }
            if(sdsd.equals("2")){
                pantalone.unos();
            }
            if(sdsd.equals("3")){
                trenerka.unos();
            }
            if(sdsd.equals("4")){
                jakna.unos();
            }
        }
        else if(dsds.equals("2")){
            System.out.println("--------------------");
            System.out.println("Koju listu proizvoda zelite da ispisete?");
            System.out.println("1. Majica");
            System.out.println("2. Pantalone");
            System.out.println("3. Trenerke");
            System.out.println("4. Jakne");
            System.out.println("--------------------");
     
            sdsd=sc.next();
            if(sdsd.equals("1")){
                majica.ispis();
            }
            if(sdsd.equals("2")){
                pantalone.ispis();
            }
            if(sdsd.equals("3")){
                trenerka.ispis();
            }
            if(sdsd.equals("4")){
                jakna.ispis();
            }
        }
        else if (dsds.equals("3")) {
            System.exit(0);
        }
        else {
            throw new Izuzetak("Unos nije ispravan, pokusajte ponovo!");
        }
    }
}