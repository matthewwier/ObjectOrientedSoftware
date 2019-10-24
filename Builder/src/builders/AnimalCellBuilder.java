package builders;

import organelles.AnimalVacuoles;

public class AnimalCellBuilder extends CellBuilder{

    AnimalCellBuilder(){
        super();
    }

    public AnimalCellBuilder setAnimalVacuoles(boolean animalVacuoles){
        if(animalVacuoles){
            organelleList.add(new AnimalVacuoles());
        }
        return this;
    }
}
