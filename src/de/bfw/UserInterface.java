package de.bfw;

import java.util.Scanner;

public class UserInterface {
    // globale Varaiable
    static Scanner sc = new Scanner(System.in);
    // Datenbank Objekt erzeugen
    static DatenBank datenbank = new DatenBank();

    public static void main(String[] args) {

        menu();
    }
        // Testen
/*
        Autos a1 = new Autos("golf", 6000, "Benzin");
        System.out.println(a1.getKraftstoff());
        System.out.println(a1.getAutoId());

        Autos a2 = new Autos("golf4", 12000, "Diesel");
        System.out.println(a2.getKraftstoff());
        System.out.println(a2.getAutoId());
*/
        public static void menu() {
            System.out.println("Cars die Datenbank");
            System.out.println("Auto hinzufügen (a)");
            System.out.println("Auto löschen (d)");
            System.out.println("Datenbank einsehen (s)");
            System.out.println("Datenbank alphabetisch Ausgeben (e)");
            System.out.println("Überrasch Mich! (u)");
            System.out.println("Auto suchen (f)");
            System.out.println("Ich weiß nicht");
            System.out.println("Datenbank verlassen (q)");
            Scanner sc = new Scanner(System.in);
            String Auswahl = sc.nextLine();
            do {
                switch (Auswahl) {
                    case "a":
                        System.out.println("Auto hinzufügen");
                        datenbank.neuenDatenSatzHinzufugen();
                        //methode hinzufügen
                        break;
                    case "d":
                        System.out.println("Auto löschen");
                        //methode hinzufügen
                        break;
                    case "s":
                        System.out.println("Datenbank einsehen");
                        datenbank.alleDatenSatzeAusgeben();
                        break;
                    case "e":
                        System.out.println("Alphabetisch");
                        //methode hinzufügen
                        break;
                    case "u":
                        System.out.println("Überraschung!");
                        //methode hinzufügen
                        break;
                    case "f":
                        System.out.println("Auto suchen!");

                        System.out.println("Bitte geben Sie die ID Ihres Autos an:");
                        int EingabeID = sc.nextInt();
                        Datensatzsuchen(EingabeID);

                        break;
                    case "?":
                        System.out.println("Bist du dumm?");
                        //methode hinzufügen
                        break;
                }
            } while (Auswahl != "q");

        }


    }





       // neuesAuto(){}





