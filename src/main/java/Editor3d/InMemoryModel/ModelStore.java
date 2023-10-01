package Editor3d.InMemoryModel;


import Editor3d.ModelElements.*;


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
        models.add(new PoligonalModel(new ArrayList<Texture>()));
        scenes.add(new Scene(1,new ArrayList<PoligonalModel>(),new ArrayList<Flash>(),new ArrayList<Camera>()));
        flashes.add(new Flash());
        cameras.add(new Camera());

    }
    public Scene getScene(Integer id){
        return new Scene(1,new ArrayList<PoligonalModel>(),new ArrayList<Flash>(),new ArrayList<Camera>());
    };
}

