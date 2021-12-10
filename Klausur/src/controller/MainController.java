package controller;

import model.*;
import view.*;


import java.util.ArrayList;

public class MainController {
    

    int geringstesAlter;
    
    //Output
        Output _o = new Output();

    public void setGeringstesAlter(int geringstesAlter) {
        this.geringstesAlter = geringstesAlter;
    }
    public int getGeringstesAlter() {
        return geringstesAlter;
    }

    public MainController(){
        
        //Arraylist
        ArrayList<Gruppe> gruppen = new ArrayList<Gruppe>();

        

        //Demodaten
        Gruppe g1 = new Gruppe("12.5.2912, 23:23 Uhr", "Ulrich", "Ebert", 1, 15, 3);
        Gruppe g2 = new Gruppe("1.1.2912, 21:23 Uhr", "Heinrich", "Ebert", 1, 16, 4);
        Gruppe g3 = new Gruppe("2.2.2912, 2:23 Uhr", "Dieter", "Ebert", 2, 17, 5);
        Gruppe g4 = new Gruppe("3.12.2912, 3:23 Uhr", "Hans", "Ebert", 2, 19, 3);
        Gruppe g5 = new Gruppe("5.8.2912, 6:23 Uhr", "Friedrich", "Ebert", 3, 32, 3);
        Gruppe g6 = new Gruppe("31.9.2912, 8:23 Uhr", "Lennard", "Ebert", 3, 23, 4);
        Gruppe g7 = new Gruppe("23.12.2912, 3:23 Uhr", "Nils", "Ebert", 4, 44, 3);
        Gruppe g8 = new Gruppe("8.12.2912, 7:23 Uhr", "Alex", "Ebert", 4, 55, 2);

        gruppen.add(g1);
        gruppen.add(g2);
        gruppen.add(g3);
        gruppen.add(g4);
        gruppen.add(g5);
        gruppen.add(g6);
        gruppen.add(g7);
        gruppen.add(g8);




        Room1 r1 = new Room1(4, 1, "Schlüssel stecht im Zündschloss", 12);
        Room2 r2 = new Room2(6, 3, "Schlüsselkarte in der Brust der Leiche Nr. 2", 14);
        Room3 r3 = new Room3(4, 2, "Schlüssel in der schwarzen Maske", 18);
        Room4 r4 = new Room4(6, 2, "Im linken Schuh der Leiche auf dem Sofa", 18);

        

        

    
        geringstesAlter = 1000;
        //Methode zum Bestimmen und Ausgeben der des geringsten Alters
        
        for(Gruppe a : gruppen){
            if(a.getAlterdesjuengsten() < geringstesAlter){
                geringstesAlter = a.getAlterdesjuengsten();
            }
        }
        _o.printData("Der jüngste Mitspieler ist " + geringstesAlter + " Jahre alt!");
        //Keine Zeit mehr, hier eigentlich in den einzelnen Räumen prüfen und nicht alle gleichzeitig








    
        //Alles ausgeben lassen
        for(Gruppe b : gruppen){
            _o.printData(" " + b.getVorname() + " " + b.getNachame() + " " + b.getZeitraum() + " " + b.getAlterdesjuengsten() + " " + b.getGruppengroesse());
        }
    
    
    
    

        //Prüfung, ob alt genug. Ekelig, da ich überfordert bin, keine Zeit mehr habe und nichtmehr weiter weiß
        if(r1.getMindestalter() > g1.getAlterdesjuengsten()){
            _o.printData("Kann nicht gebucht werden, da zu jung");
        }
        else {
            _o.printData("Vielen Dank für ihre Buchung");
        }

        if(r1.getMindestalter() > g2.getAlterdesjuengsten()){
            _o.printData("Kann nicht gebucht werden, da zu jung");
        }
        else {
            _o.printData("Vielen Dank für ihre Buchung");
        }

        if(r2.getMindestalter() > g3.getAlterdesjuengsten()){
            _o.printData("Kann nicht gebucht werden, da zu jung");
        }
        else {
            _o.printData("Vielen Dank für ihre Buchung");
        }

        if(r2.getMindestalter() > g4.getAlterdesjuengsten()){
            _o.printData("Kann nicht gebucht werden, da zu jung");
        }
        else {
            _o.printData("Vielen Dank für ihre Buchung");
        }

        if(r3.getMindestalter() > g5.getAlterdesjuengsten()){
            _o.printData("Kann nicht gebucht werden, da zu jung");
        }
        else {
            _o.printData("Vielen Dank für ihre Buchung");
        }

        if(r3.getMindestalter() > g6.getAlterdesjuengsten()){
            _o.printData("Kann nicht gebucht werden, da zu jung");
        }
        else {
            _o.printData("Vielen Dank für ihre Buchung");
        }

        if(r4.getMindestalter() > g7.getAlterdesjuengsten()){
            _o.printData("Kann nicht gebucht werden, da zu jung");
        }
        else {
            _o.printData("Vielen Dank für ihre Buchung");
        }

        if(r4.getMindestalter() > g8.getAlterdesjuengsten()){
            _o.printData("Kann nicht gebucht werden, da zu jung");
        }
        else {
            _o.printData("Vielen Dank für ihre Buchung");
        }
    }

    
    

}
