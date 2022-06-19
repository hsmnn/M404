package ch.epai.ict.m404.unit_converter;

import java.io.Console;
import java.util.Scanner;

public final class App {
    public static void main(String[] args) {

        // L'objet console détecte la norme d'encodage des
        // caractères utilisée par l'émulateur de terminal.
        Console cons = System.console();

        // La méthode printf permet d'écrire une chaîne dans
        // stdout et la méthode readLine() permet de lire une
        // ligne de texte depuis stdin.
        cons.printf("Veuillez saisir qqch. : ");
        String s = cons.readLine();
        cons.printf("vous avez saisi : %s\n", s);

        // Pour lire des valeurs numérique, on peut utiliser
        // un Scanner de manière similaire à ce que l'on fait
        // avec System.in.
        cons.printf("Veuillez saisir un nombre : ");
        //Scanner scan = new Scanner(cons.reader());
        //double d = scan.nextDouble();
        //scan.close();
        //cons.printf("vous avez saisi : %f\n", d);
        
        do {
            cons.printf("Valeure à convertir : ");
            Scanner scan = new Scanner(cons.reader());
            double ValToConvert = scan.nextDouble();
            scan.close();
    
            cons.printf("Unité à convertir (K = kelvin / F = fahrenheit): ");
            String unitToConvert = cons.readLine();
    
            cons.printf("Unité vers laquelle la conversion va s'effectuer : ");
            String unitToConvertTo = cons.readLine();
        }while (unitToConvert != "F" || unitToConvert != "K" || unitToConvertTo != "F" || unitToConvertTo != "K");
    }
}
