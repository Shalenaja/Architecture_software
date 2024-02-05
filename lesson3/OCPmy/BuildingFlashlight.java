package OCPmy;

public class BuildingFlashlight extends Flashlight{
    public BuildingFlashlight(String model, String color) {
        super(model, color, 1);
    }

    @Override
    public int include() {
        return super.press + 2;
    }

}
