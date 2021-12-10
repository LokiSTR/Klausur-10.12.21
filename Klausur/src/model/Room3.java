package model;

public class Room3 extends MiniEscapeRoom {

    public Room3(int maxPersonen, int schwierigkeitsgrad, String loesung, int mindestalter) {
        super(maxPersonen, schwierigkeitsgrad, loesung, mindestalter);

        maxPersonen = 4;
        schwierigkeitsgrad = 2;
        loesung = "Schlüssel in der schwarzen Maske";
        mindestalter = 18;

    }
    

}
