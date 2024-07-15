package projekatcs101;

import java.io.FileNotFoundException;
import java.io.IOException;

public class ProjekatCS101 {

    public static void main(String[] args) throws FileNotFoundException, IOException, Izuzetak {
        try {
            
        Sistem.start();
    } catch(Izuzetak e) {
            System.err.println("Pokusajte ponovo!");
            Sistem.start();
    }
    }
}