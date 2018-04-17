package ro.cluj.patterns.composite;

public abstract class Grafik implements Component{
    public void Zeichne() { }

    public void FuegeHinzu(Grafik grafik) {}

    public void Entferne(Grafik grafik) {}

    public void GibKindobjekt(int nr) { }
}
