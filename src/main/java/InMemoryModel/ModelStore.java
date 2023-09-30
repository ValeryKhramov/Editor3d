package InMemoryModel;

import ModelElements.Camera;
import ModelElements.Flash;
import ModelElements.PoligonalModel;
import ModelElements.Scene;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class ModelStore implements IModelChanger {
    public List<PoligonalModel> models;
    public List<Scene> scenes;
    public List<Flash> flashes;
    public List<Camera> cameras;
    private IModelChangedObserver[] changedObservers;

    // Регистрирует изменение модели.
    @Override
    public void notifyChange(IModelChanger sender) {

    }

    public ModelStore(IModelChangedObserver[] changedObservers) {
        this.changedObservers = changedObservers;
        this.models = new ArrayList<>();
        this.scenes = new ArrayList<>();
        this.flashes = new ArrayList<>();
        this.cameras = new ArrayList<>();
        models.add(new PoligonalModel());
        scenes.add(new Scene());
        flashes.add(new Flash());
        cameras.add(new Camera());

    }
    public Scene getScene(Integer id){
        return new Scene();
    };
}

