package ro.cluj.patterns.composite;

import java.util.List;

public class Abbildung extends Grafik implements  Composite{

    private List<Component> listGrafik;

    @Override
    public void addComponent(Component g) {
        listGrafik.add(g);
    }

    @Override
    public void Zeichne() {

        System.out.println("zeichne Unterabbildung mit folgenden Elementen: \n");
        for (int i=0; i<listGrafik.size(); i++) {
            ((Grafik)listGrafik.get(i)).Zeichne();
        }
    }

    @Override
    public void FuegeHinzu(Grafik grafik) {
        grafik.FuegeHinzu(grafik);
    }

    @Override
    public void Entferne(Grafik grafik) {}

    @Override
    public void GibKindobjekt(int nr) { }
}
