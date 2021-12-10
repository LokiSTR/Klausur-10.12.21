package model;

public class Room4 extends MiniEscapeRoom {

    public Room4(int maxPersonen, int schwierigkeitsgrad, String loesung, int mindestalter) {
        super(maxPersonen, schwierigkeitsgrad, loesung, mindestalter);

        maxPersonen = 6;
        schwierigkeitsgrad = 2;
        loesung = "Im linken Schuh der Leiche auf dem Sofa";
        mindestalter = 18;


    }
    
}
