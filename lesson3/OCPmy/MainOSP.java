package OCPmy;

public class MainOSP {
    public static void main(String[] args) {
        Flashlight flashlight = new Flashlight("Flashlight", "red", 1);
        printNumberPress(flashlight);
        Flashlight flashlight2 = new PocketFlashlight("PocketFlashligh", "green", 1);
        printNumberPress(flashlight2);
        
        BuildingFlashlight flashlight3 = new BuildingFlashlight("BuildingFlashlight", "grey");
        printNumberPress(flashlight3);
    }

    public static void printNumberPress(Flashlight flashlight) {
        System.out.println(flashlight.model +  ": кол-во нажатий для включения режимов: " + flashlight.include());
    }
}
