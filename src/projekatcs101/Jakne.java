package projekatcs101;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Jakne extends Proizvod implements Radnje {
    
 List<Jakne>jaknelista = new ArrayList<>();
    
    public void upisUsistem() {
        try {
            File jakne = new File("jakne.txt");
            PrintWriter pw = new PrintWriter(new FileOutputStream(jakne, true));
            for (Proizvod lista : jaknelista) {
                pw.println(lista.getBrend());
                pw.println(lista.getVelicina());
                pw.println(lista.getVrsta_jakne());
                pw.println(lista.getBoja());
                pw.println(lista.getCena());
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
        Jakne jakna = new Jakne() {};
        while (true) {
                System.out.println("-----------------------");
                System.out.println("Unesite ime brenda:");
                System.out.println("-----------------------");
                jakna.setBrend(sc.next());
                System.out.println("-----------------------");
                System.out.println("Unesite velicinu jakne:");
                System.out.println("-----------------------");
                jakna.setVelicina(sc.next());
                System.out.println("-----------------------");
                System.out.println("Vrsta jakne je (zimska, prolecna, jesenja):");
                System.out.println("-----------------------");
                jakna.setVrsta_jakne(sc.next());
                System.out.println("-----------------------");
                System.out.println("Unesite boju (crna, bela, plava, crvena, zelena):");
                System.out.println("-----------------------");
                jakna.setBoja(Boja.valueOf(sc.next()));
                System.out.println("-----------------------");
                System.out.println("Unesite cenu proizvoda u dinarima:");
                System.out.println("-----------------------");
                jakna.setCena(sc.nextDouble());
                jaknelista.add(jakna);
                upisUsistem();
                break;
            }
        }
    
    public void ispis() {
        List<Jakne>jaknee = new ArrayList<>();
        PrintWriter pw=null;
        try {
            File jakne = new File("jakne.txt");
            pw = new PrintWriter(new FileOutputStream(jakne, true));
            Scanner sc = new Scanner(jakne);
            while (sc.hasNext()) {
                Jakne jakna = new Jakne() {};
                jakna.setBrend(sc.nextLine());
                jakna.setVelicina(sc.nextLine());
                jakna.setVrsta_jakne(sc.nextLine());
                jakna.setBoja(Boja.valueOf(sc.nextLine()));
                jakna.setCena(Double.valueOf(sc.nextLine()));
                jaknee.add(jakna);
            }
            sc.close();
            Collections.sort(jaknee);
            for(Jakne j : jaknee) {
                System.out.println(j);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Proizvod.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            pw.close();
        }
    }

    public Jakne() {
    }

    public Jakne(String brend, Boja boja, String vrsta_pantalona, String velicina, double cena) {
        super(brend, boja, velicina, cena);
    }

    public List<Jakne> getJaknelista() {
        return jaknelista;
    }

    public void setJaknelista(List<Jakne> jaknelista) {
        this.jaknelista = jaknelista;
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
    
   @Override
    public String toString() {
        return super.toString();
    }   

    private ArrayList<Jakne> listiranje() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}