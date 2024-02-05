package ISPmy;

public class GameGlasses implements EyeDevice3D {
    public boolean isActive;
    public GameGlasses(boolean isActive) {
        this.isActive = isActive;
    }
    @Override
    public boolean activate() {
        return isActive = true;
        
    }
    @Override
    public double price() {
        return 5000;
    }
    
}
