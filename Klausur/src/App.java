/**
 * Erklärung:
 * Superklasse: Eine Klasse, aus der eine andere Klasse per extends- und super-Aufruf die, im Kontruktor erstellten, Informationen, Variablen und Parameter erhält. ggf werden hier auch im Fall einer abstract-Superklasse auch abstrakte Methoden übergeben, falls diese erstellt wurden.  
 * abstract: Wenn man in einer Klassensignatur abstract hinzufügt kann aus dieser keine Instanz erstellt werden, jedoch kann nach, wie vor noch aus ihr vererbt werden. Wenn man eine abstracte Methode in dem Klassenrumpf erstellt, so hat diese keinen Inhalt in ihrem Methodenrumpf, sondern nur eine Methodensignatur. Wurde nun aus dieser Klasse erstellt, so muss auch die abstrakte Methode in jeder Vererbten Klasse aufgeführt werden und einen return-Wert haben.
 * MVC: Bei dem MVC-Modell geht es um Arbeitsteilung und Übersichtlichkeit. M steht für model. Hier werden die Klassen eingefügt, aus denen Instanzen erstellt werden. V steht für view. In der View geht es ausschließlich um die Ausgabe. C steht für Controller. Dieser verbindet die View mit dem Model. Diese dürfen selbst nie miteinander interagieren! Im Controller passiert durchschnittlich das Meiste. 
 * OOP generell:
 * Bei der Objekt orientierten Programmierung erstellt man Klassen als Baupläne für Objekte. Diesen Objekten kann man verschiedene Werte zuweisen. Sie können untereinander interagieren. In einer Klasse können verschiedene Variablen deklariert und initialisiert werden. Das heißt, dass man diese erstellt und ihnen verschiedene Werte zuweisen kann. In vershciedenen Methoden kann man verschiedene Szenarien erstellen und diese beim aufrufen über ein Objekt durchlaufen lassen. Im Konstruktor jeder Klasse kann man den Variablen konkrete Werte, welche ihrem Datentypen entsprechen, zuweisen. Man kann ihm ebenfalls Werte übergeben lassen, welche beim Erstellen eines Objektes der jeweiligen Klasse eingetragen werden müssen. 
*/






import controller.*;

public class App {
    public static void main(String[] args) throws Exception {
        MainController mc = new MainController();
    }
}
