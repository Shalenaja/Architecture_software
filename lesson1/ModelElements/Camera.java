package ModelElements;

import Stuff.*;

public class Camera {
    Point3D Location;
    Angle3D Angle;

    public Camera(Point3D Location, Angle3D Angle) {
        this.Location = Location;
        this.Angle = Angle;
    }

    public void Rotate(Angle3D angle) {
    }

    public void Move(Point3D point) {
    }

}
