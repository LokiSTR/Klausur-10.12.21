package model;

public abstract class MiniEscapeRoom {
    
    int _maxPersonen;
    int _schwierigkeitsgrad;
    String _loesung;
    int _mindestalter;



    public MiniEscapeRoom(int maxPersonen, int schwierigkeitsgrad, String loesung, int mindestalter){
        setMaxPersonen(maxPersonen);
        setSchwierigkeitsgrad(schwierigkeitsgrad);
        setLoesung(loesung);
        setMindestalter(mindestalter);
    }

    
    public void setMaxPersonen(int _maxPersonen) {
        this._maxPersonen = _maxPersonen;
    }
    public void setSchwierigkeitsgrad(int _schwierigkeitsgrad) {
        this._schwierigkeitsgrad = _schwierigkeitsgrad;
    }
    public void setLoesung(String _loesung) {
        this._loesung = _loesung;
    }
    public void setMindestalter(int _mindestalter) {
        this._mindestalter = _mindestalter;
    }


    public int getMaxPersonen() {
        return _maxPersonen;
    }
    public int getSchwierigkeitsgrad() {
        return _schwierigkeitsgrad;
    }
    public String getLoesung() {
        return _loesung;
    }
    public int getMindestalter() {
        return _mindestalter;
    }
}
