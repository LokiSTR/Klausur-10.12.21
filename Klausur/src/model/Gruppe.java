package model;

public class Gruppe {


    String _zeitraum;
    String _vorname;
    String _nachame;
    int _raum;
    int _alterdesjuengsten;
    int _gruppengroesse;
    

    public Gruppe(String zeitraum, String vorname, String nachname, int raum, int alterdesjuengsten, int gruppengroesse){


        setZeitraum(zeitraum);
        setVorname(vorname);
        setNachame(nachname);
        setRaum(raum);
        setAlterdesjuengsten(alterdesjuengsten);
        setGruppengroesse(gruppengroesse);
    }





    public void setZeitraum(String _zeitraum) {
        this._zeitraum = _zeitraum;
    }
    public void setVorname(String _vorname) {
        this._vorname = _vorname;
    }
    public void setNachame(String _nachame) {
        this._nachame = _nachame;
    }
    public void setRaum(int _raum) {
        this._raum = _raum;
    }
    public void setAlterdesjuengsten(int _alterdesjuengsten) {
        this._alterdesjuengsten = _alterdesjuengsten;
    }
    public void setGruppengroesse(int _gruppengroesse) {
        this._gruppengroesse = _gruppengroesse;
    }


    public String getZeitraum() {
        return _zeitraum;
    }
    public String getVorname() {
        return _vorname;
    }
    public String getNachame() {
        return _nachame;
    }
    public int getRaum() {
        return _raum;
    }
    public int getAlterdesjuengsten() {
        return _alterdesjuengsten;
    }
    public int getGruppengroesse() {
        return _gruppengroesse;
    }


}
