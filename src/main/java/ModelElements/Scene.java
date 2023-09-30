package ModelElements;


import Staff.Type;

import java.util.ArrayList;
import java.util.List;

public class Scene {
    public Integer id;
    public List<PoligonalModel> models;
    public List<Flash> flashes;
    public List<Camera> cameras = new ArrayList<>();
    public Type method1(Type type){
        return type;
    };

    public Type method2(Type type1, Type type2){
        return type1;
    };

    public Scene(Integer id, ArrayList<PoligonalModel> poligonalModels, ArrayList<Flash> flashes, ArrayList<Camera> cameras) {
        this.id = id;
        this.models = poligonalModels;
        this.flashes = flashes;
        this.cameras = cameras;
    }
}
