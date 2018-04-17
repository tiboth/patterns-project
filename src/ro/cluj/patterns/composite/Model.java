package ro.cluj.patterns.composite;

public class Model {

    public static void main(String [ ] args) {
        Abbildung a = new Abbildung();
        Abbildung a2 = new Abbildung();
        Linie l = new Linie();
        Text t = new Text();
        a.addComponent(l);
        a2.addComponent(t);
        a.addComponent(a2);
        a.Zeichne();
    }
}
