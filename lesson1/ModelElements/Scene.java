package ModelElements;

import java.lang.ProcessBuilder.Redirect.Type;
import java.util.List;

public class Scene {
    int id;
    List<PoligonalModel> Models;
    List<Flash> Flashes;
    List<Camera> Cameras;

    public Scene(int id, List<PoligonalModel> Models, List<Flash> Flashes, List<Camera> Cameras) {
        this.id = id;
        this.Models = Models;
        this.Flashes = Flashes;
        this.Cameras = Cameras;

        Models.add(new PoligonalModel(null));
        Cameras.add(new Camera(null, null));
    }

    public void method1(Type type) {
    }

    public void method2(Type type) {
    }

}
