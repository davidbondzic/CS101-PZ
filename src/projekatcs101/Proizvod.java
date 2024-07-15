package projekatcs101;

public abstract class Proizvod implements Comparable<Proizvod> {   

    
    enum Boja {
        crna,
        bela,
        plava,
        crvena,
        zelena  
    }
    
    public String brend;
    public Boja boja;
    public String velicina;
    public double cena;
    public String materijal;
    public String vrsta_jakne;
    public String vrsta_pantalona;
    public String vrsta_trenerki;

    public Proizvod(String brend, Boja boja, String velicina, double cena) {
        this.brend = brend;
        this.boja = boja;
        this.velicina = velicina;
        this.cena = cena;
    }

    public Proizvod() {
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

    public String getMaterijal() {
        return materijal;
    }

    public void setMaterijal(String materijal) {
        this.materijal = materijal;
    }

    public String getVrsta_jakne() {
        return vrsta_jakne;
    }

    public void setVrsta_jakne(String vrsta_jakne) {
        this.vrsta_jakne = vrsta_jakne;
    }

    public String getVrsta_pantalona() {
        return vrsta_pantalona;
    }

    public void setVrsta_pantalona(String vrsta_pantalona) {
        this.vrsta_pantalona = vrsta_pantalona;
    }

    public String getVrsta_trenerki() {
        return vrsta_trenerki;
    }

    public void setVrsta_trenerki(String vrsta_trenerki) {
        this.vrsta_trenerki = vrsta_trenerki;
    }
    
    @Override
    public String toString() {
        return brend + " " + boja + " " + velicina + " " + cena;
    }
    
        @Override
    public int compareTo(Proizvod o) {
        return (int)(this.cena - o.cena);      
    }
}