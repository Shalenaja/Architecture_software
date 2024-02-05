package DIPmy;

public class MainDIP {
    public static void main(String[] args) {
        GameGlasses glasses = new GameGlasses(new BluetoothConnector(), false);
        glasses.activate();
        glasses = new GameGlasses(new ComputerConnector(), false);
        glasses.activate();
    }
    
}
