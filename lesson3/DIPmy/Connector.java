package DIPmy;

public interface Connector {
    default void start() {
        System.out.println("Вы включили очки");
    }    
}
