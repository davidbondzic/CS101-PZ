package projekatcs101;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Majice extends Proizvod implements Radnje {

    private static ArrayList<Majice> listiranje() {
        return null;
    }

    static void pretraga(String crna) {
    }

    List<Majice>majicelista = new ArrayList<>();
    
    public void upisUsistem() {
        try {
            File majice = new File("majice.txt");
            PrintWriter pw = new PrintWriter(new FileOutputStream(majice, true));
            for (Proizvod lista1 : majicelista) {
                pw.println(lista1.getBrend());
                pw.println(lista1.getVelicina());
                pw.println(lista1.getMaterijal());
                pw.println(lista1.getBoja());
                pw.println(lista1.getCena());
            }
            pw.close();
        } 
        catch (FileNotFoundException ex) {
            Logger.getLogger(Proizvod.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void unos() {
        Scanner sc = new Scanner(System.in);
        String asd;
        Majice majica = new Majice() {};
        while (true) {
           
                System.out.println("-----------------------");
                System.out.println("Unesite brend majice:");
                System.out.println("-----------------------");
                majica.setBrend(sc.next());
                System.out.println("-----------------------");
                System.out.println("Unesite velicinu majice:");
                System.out.println("-----------------------");
                majica.setVelicina(sc.next());
                System.out.println("-----------------------");
                System.out.println("Od kog materijala je napravljena majica? :");
                System.out.println("-----------------------");
                majica.setMaterijal(sc.next());
                System.out.println("-----------------------");
                System.out.println("Unesite jednu od dostupnih boja (crna, bela, plava, crvena, zelena):");
                System.out.println("-----------------------");
                majica.setBoja(Boja.valueOf(sc.next()));
                System.out.println("-----------------------");
                System.out.println("Unesite cenu proizvoda u dinarima:");
                System.out.println("-----------------------");
                majica.setCena(sc.nextDouble());
                majicelista.add(majica);
                upisUsistem();
                break;
            }
        }
    
    public void ispis() {
        List<Majice>majicee = new ArrayList<>();
        PrintWriter pw=null;
        try {
            File majice = new File("majice.txt");
            pw = new PrintWriter(new FileOutputStream(majice, true));
            Scanner sc = new Scanner(majice);
            while (sc.hasNext()) {
                Majice majica = new Majice() {};
                majica.setBrend(sc.nextLine());
                majica.setVelicina(sc.nextLine());
                majica.setMaterijal(sc.nextLine());
                majica.setBoja(Boja.valueOf(sc.nextLine()));
                majica.setCena(Double.valueOf(sc.nextLine()));
                majicee.add(majica);
            }
            sc.close();
            Collections.sort(majicee);
            for(Majice m : majicee) {
                System.out.println(m);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Proizvod.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            pw.close();
        }
    }


    public Majice() {
    }

    public List<Majice> getMajicelista() {
        return majicelista;
    }

    public void setMajicelista(List<Majice> majicelista) {
        this.majicelista = majicelista;
    } 

    public String getBrend() {
        return brend;
    }

    public void setBrend(String brend) {
        this.brend = brend;
    }

    public Boja getBoja() {
        return boja;
    }

    public void setBoja(Boja boja) {
        this.boja = boja;
    }

    public String getVelicina() {
        return velicina;
    }

    public void setVelicina(String velicina) {
        this.velicina = velicina;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    public Majice(String materijal, String brend, Boja boja, String velicina, double cena) {
        super(brend, boja, velicina, cena);
        this.materijal = materijal;
    }
    
        public String toString() {
        return brend + " " + boja + " " + velicina + " " +  materijal + " "  + cena;
    }    
}   