package ModelElements;

import java.lang.ProcessBuilder.Redirect.Type;
import java.util.List;

public class Scene {
    int id;
    List<PoligonalModel> Models;
    List<Flash> Flashes;
    List<Camera> Cameras;

    public Scene(int id, List<PoligonalModel> Models, List<Flash> Flashes, List<Camera> Cameras) throws IllegalArgumentException {
        if(Cameras.size() < 1) 
            try {
                throw new IllegalArgumentException("size List<Camera> cannot be less than 1");
            } catch (Exception e) {
                e.printStackTrace();
            }
        if(Models.size() < 1)
            try {
                throw new IllegalArgumentException("size List<PoligonalModel> cannot be less than 1");
            } catch (Exception e) {                
                e.printStackTrace();
            }  
        this.id = id;
        this.Models = Models;
        this.Flashes = Flashes;
        this.Cameras = Cameras;
    }

    public void method1(Type type) {
    }

    public void method2(Type type) {
    }

}
