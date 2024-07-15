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

public class Trenerke extends Proizvod implements Radnje {
    
    List<Trenerke>trenerkelista = new ArrayList<>();
    
    public void upisUsistem() {
        try {
            File trenerke = new File("trenerke.txt");
            PrintWriter pw = new PrintWriter(new FileOutputStream(trenerke, true));
            for (Proizvod lista : trenerkelista) {
                pw.println(lista.getBrend());
                pw.println(lista.getVelicina());
                pw.println(lista.getVrsta_trenerki());
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
        Trenerke trenerka = new Trenerke() {};
        while (true) {
                System.out.println("-----------------------");
                System.out.println("Unesite brend trenerke:");
                System.out.println("-----------------------");
                trenerka.setBrend(sc.next());
                System.out.println("-----------------------");
                System.out.println("Unesite velicinu trenerke:");
                System.out.println("-----------------------");
                trenerka.setVelicina(sc.next());
                System.out.println("-----------------------");
                System.out.println("Vrsta trenerke je (suskavac, obicna):");
                System.out.println("-----------------------");
                trenerka.setVrsta_trenerki(sc.next());
                System.out.println("-----------------------");
                System.out.println("Unesite boju (crna, bela, plava, crvena, zelena):");
                System.out.println("-----------------------");
                trenerka.setBoja(Boja.valueOf(sc.next()));
                System.out.println("-----------------------");
                System.out.println("Unesite cenu proizvoda u dinarima:");
                System.out.println("-----------------------");
                trenerka.setCena(sc.nextDouble());
                trenerkelista.add(trenerka);
                upisUsistem();
                break;
            }
        }
    
    public void ispis() {
        List<Trenerke>trenerkee = new ArrayList<>();
        PrintWriter pw=null;
        try {
            File trenerke = new File("trenerke.txt");
            pw = new PrintWriter(new FileOutputStream(trenerke, true));
            Scanner sc = new Scanner(trenerke);
            while (sc.hasNext()) {
                Trenerke trenerka = new Trenerke() {};
                trenerka.setBrend(sc.nextLine());
                trenerka.setVelicina(sc.nextLine());
                trenerka.setVrsta_trenerki(sc.nextLine());
                trenerka.setBoja(Boja.valueOf(sc.nextLine()));
                trenerka.setCena(Double.valueOf(sc.nextLine()));
                trenerkee.add(trenerka);
            }
            sc.close();
            Collections.sort(trenerkee);
            for(Trenerke t : trenerkee) {
                System.out.println(t);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Proizvod.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            pw.close();
        }
    }

    public Trenerke() {
    }

    public Trenerke(String brend, Boja boja, String vrsta_trenerki, String velicina, double cena) {
        super(brend, boja, velicina, cena);
    }

    public List<Trenerke> getTrenerkelista() {
        return trenerkelista;
    }

    public void setTrenerkelista(List<Trenerke> trenerkelista) {
        this.trenerkelista = trenerkelista;
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

    private ArrayList<Trenerke> listiranje() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}