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

    @Override
    public CellBuilder setCellWall(boolean cellWall) {
        return this;
    }

    @Override
    public CellBuilder setChloroplasts(boolean chloroplasts) {
        return this;
    }

    @Override
    public CellBuilder setPlantVacuoles(boolean plantVacuoles) {
        return this;
    }

}
