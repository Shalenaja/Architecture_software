package OCPmy;

public class PocketFlashlight extends Flashlight {

    public PocketFlashlight(String model, String color, int press) {
        super(model, color, press);
    }

    @Override
    public int include() {
        return super.press + 1;  
    }

}
