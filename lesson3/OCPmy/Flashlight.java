package OCPmy;

public class Flashlight {
    public String model;
    public String color;
    public int press = 1;
    
    public Flashlight(String model, String color, int press){
        this.model = model;
        this.color = color;
        this.press = press;
    }

    public int include() {
        return press;
    }
}
