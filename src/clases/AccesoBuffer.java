package clases;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class AccesoBuffer {
    public static void inicio() throws IOException {
        mostrarYcontarContenido("texto.txt");
    }

    private static boolean mostrarContenido(String fichero) throws IOException {
        BufferedReader lector = null;
        try {
            lector = new BufferedReader(new FileReader("texto.txt"));
            String frase = lector.readLine();
            while (frase != null) {
                System.out.println(frase);
                frase = lector.readLine();

            }
            return true;
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
            return false;
        } finally {
            if (lector != null)
                lector.close();
        }

    }

    private static boolean mostrarYcontarContenido(String fichero) throws IOException {
        // contar significa contar las lineas totales y cuantas vacias hay.
        BufferedReader lector = null;
        int numLineas = 0;
        int numVacias = 0;
        try {
            lector = new BufferedReader(new FileReader("texto.txt"));
            String frase = lector.readLine();
            while (frase != null) {
                numLineas++;
                if (frase.isEmpty())
                    numVacias++;
                System.out.println(frase);
                frase = lector.readLine();
                
            }
            System.out.println("lineas totales" + numLineas);
            System.out.println("lineas vacias" + numVacias);
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        } finally {
            if (lector != null)
                lector.close();
        }

    }

}
