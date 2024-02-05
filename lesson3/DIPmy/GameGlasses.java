package DIPmy;

public class GameGlasses  {
    Connector connector;
    public boolean isActive;

    public GameGlasses(Connector connector, boolean isActive) {
        this.isActive = isActive;
        this.connector = connector;
    }
    
    void activate() {
        connector.start();
        isActive = true;
    }
}
