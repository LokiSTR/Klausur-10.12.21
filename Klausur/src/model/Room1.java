package model;


public class Room1 extends MiniEscapeRoom {

    public Room1(int maxPersonen, int schwierigkeitsgrad, String loesung, int mindestalter) {
        super(maxPersonen, schwierigkeitsgrad, loesung, mindestalter);
        maxPersonen = 4;
        loesung = "Schlüssel stecht im Zündschloss";
        schwierigkeitsgrad = 1;
        mindestalter = 12;
    }
    
}
