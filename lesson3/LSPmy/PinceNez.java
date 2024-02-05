package LSPmy;

public class PinceNez extends Glasses{
    int glass;
    public PinceNez(int glass){
        this.glass = glass;       
    }

    @Override
    double price() {
        return 500;
    }
    
}
