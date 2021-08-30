package de.bfw;

public class Autos {
    // Klassenvariable
    private int autoId;
    private static int startwert = 1;

    // Attribute


   private String modell;
   private double preis;
   private String kraftstoff;

   // Konstruktor
    public Autos(String modell, double preis, String kraftstoff ){
        autoId =  startwert;
        startwert++;
        this.modell = modell;
        this.preis = preis;
        this.kraftstoff = kraftstoff;

    }

   //Getter

    public int getAutoId() { return autoId; }

    public String getModell() { return modell; }

    public Double getPreis() { return preis; }

    public String getKraftstoff() { return kraftstoff; }


    //Setter

    public void setAutoId(int autoId) { this.autoId = autoId; }

    public void setModell(String modell) { this.modell = modell; }

    public void setPreis(Double preis) { this.preis = preis; }

    public void setKraftstoff(String kraftstoff) { this.kraftstoff = kraftstoff; }






}
