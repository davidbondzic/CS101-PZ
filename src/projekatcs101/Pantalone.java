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

public class Pantalone extends Proizvod implements Radnje {
    
    
    List<Pantalone>pantalonelista = new ArrayList<>();
    
    public void upisUsistem() {
        try {
            File pantalone = new File("pantalone.txt");
            PrintWriter pw = new PrintWriter(new FileOutputStream(pantalone, true));
            for (Proizvod lista : pantalonelista) {
                pw.println(lista.getBrend());
                pw.println(lista.getVelicina());
                pw.println(lista.getVrsta_pantalona());
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
        Pantalone pantalone = new Pantalone() {};
        while (true) {
                System.out.println("-----------------------");
                System.out.println("Unesite brend pantalona");
                System.out.println("-----------------------");
                pantalone.setBrend(sc.next());
                System.out.println("-----------------------");
                System.out.println("Unesite velicinu pantalona:");
                System.out.println("-----------------------");
                pantalone.setVelicina(sc.next());
                System.out.println("-----------------------");
                System.out.println("Vrsta pantalona je (dzeparke, texas, obicne):");
                System.out.println("-----------------------");
                pantalone.setVrsta_pantalona(sc.next());
                System.out.println("-----------------------");
                System.out.println("Unesite boju (crna, bela, plava, crvena, zelena):");
                System.out.println("-----------------------");
                pantalone.setBoja(Boja.valueOf(sc.next()));
                System.out.println("-----------------------");
                System.out.println("Unesite cenu proizvoda u dinarima:");
                System.out.println("-----------------------");
                pantalone.setCena(sc.nextDouble());
                pantalonelista.add(pantalone);
                upisUsistem();
                break;
            }
        }
    
    public void ispis() {
        List<Pantalone>pantaloneee = new ArrayList<>();
        PrintWriter pw=null;
        try {
            File pantalone = new File("pantalone.txt");
            pw = new PrintWriter(new FileOutputStream(pantalone, true));
            Scanner sc = new Scanner(pantalone);
            while (sc.hasNext()) {
                Pantalone pantalonee = new Pantalone() {};
                pantalonee.setBrend(sc.nextLine());
                pantalonee.setVelicina(sc.nextLine());
                pantalonee.setVrsta_pantalona(sc.nextLine());
                pantalonee.setBoja(Boja.valueOf(sc.nextLine()));
                pantalonee.setCena(Double.valueOf(sc.nextLine()));
                pantaloneee.add(pantalonee);
            }
            sc.close();
            Collections.sort(pantaloneee);
            for(Pantalone p : pantaloneee) {
                System.out.println(p);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Proizvod.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            pw.close();
        }
    }

    public Pantalone() {
    }

    public Pantalone(String brend, Boja boja, String vrsta_pantalona, String velicina, double cena) {
        super(brend, boja, velicina, cena);
    }

    public List<Pantalone> getPantalonelista() {
        return pantalonelista;
    }

    public void setPantalonelista(List<Pantalone> pantalonelista) {
        this.pantalonelista = pantalonelista;
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

    private ArrayList<Pantalone> listiranje() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}