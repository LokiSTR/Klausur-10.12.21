package model;

public class Room2 extends MiniEscapeRoom {

    public Room2(int maxPersonen, int schwierigkeitsgrad, String loesung, int mindestalter) {
        super(maxPersonen, schwierigkeitsgrad, loesung, mindestalter);
        maxPersonen = 6;
        schwierigkeitsgrad = 3;
        loesung = "Schlüsselkarte in der Brust der Leiche Nr. 2";
        mindestalter = 14;


    }
    
}
