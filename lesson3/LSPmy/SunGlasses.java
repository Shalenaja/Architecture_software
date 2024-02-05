package LSPmy;

public class SunGlasses extends Glasses {
    int glass;
    int darlings;
    public SunGlasses(int glass, int darlings){
        this.glass = glass;
        this.darlings = darlings;
    }
    @Override
    public double price() {
        return darlings * 1000;
    }
    
}
