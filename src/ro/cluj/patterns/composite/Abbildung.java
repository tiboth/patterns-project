package ro.cluj.patterns.composite;

public class Abbildung extends Grafik{
    public void Zeichne() {

    }

    public void FuegeHinzu(Grafik grafik) {
        grafik.FuegeHinzu(grafik);
    }

    public void Entferne(Grafik grafik) {}

    public void GibKindobjekt(int nr) { }
}
