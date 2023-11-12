package ModelElements;

import java.util.List;

import Stuff.Type;

public class Scene {
    public int id;
    public List<PoligonalModel> Models;
    public List<Flash> Flashes;
    public List<Camera> cameras;


    public Scene(int id, List<PoligonalModel> models, List<Flash> flashes, List<Camera> cameras) throws Exception {
        this.id = id;
        
        if (models.size() > 0) {
            Models = models;
        } else {
            throw new Exception("Need one of model");
        }
        
        Flashes = flashes;

        
        if (cameras.size() > 0) {
            this.cameras = cameras;
        } else {
            throw new Exception("Need one of camera");
        }
    }

    public Type method1(Type type) {
    return null;
    }

    public Type method2(Type type1, Type type2) {
    return null;
    }

}
