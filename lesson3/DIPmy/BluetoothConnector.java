package DIPmy;

public class BluetoothConnector implements Connector{

    @Override
    public void start() {
        System.out.println("Вы включили очки через Bluetooth");
    }   
}
