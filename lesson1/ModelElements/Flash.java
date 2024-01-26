package ModelElements;

import Stuff.*;

public class Flash {
    Point3D Location;
    Angle3D Angle;
    Color Color;
    Float Power;

    public Flash(Point3D Location, Angle3D Angle, Color Color, Float Power) {
        this.Location = Location;
        this.Angle = Angle;
        this.Color = Color;
        this.Power = Power;
    }

    public void Rotate(Angle3D angle) {
    }

    public void Move(Point3D point) {
    }

}
