package builders;

import cells.AnimalCell;
import organelles.AnimalVacuoles;

public class AnimalCellBuilder extends CellBuilder {

    public AnimalCellBuilder() {
        super();
    }

    public AnimalCell build() {
        return new AnimalCell(this);
    }

    public AnimalCellBuilder setAnimalVacuoles(boolean animalVacuoles) {
        if (animalVacuoles) {
            organelleList.add(new AnimalVacuoles());
        }
        return this;
    }
}
