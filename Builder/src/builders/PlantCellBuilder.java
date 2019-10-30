package builders;

import cells.PlantCell;
import organelles.*;

public class PlantCellBuilder extends CellBuilder {

    public PlantCellBuilder() {
        super();
        organelleList.add(new CellWall());
    }

    public PlantCell build() {
        return new PlantCell(this);
    }

    @Override
    public CellBuilder setAnimalVacuoles(boolean animalVacuoles) {
        return this;
    }

    @Override
    public PlantCellBuilder setCellWall(boolean cellWall) {
        for (Organelle organelle : organelleList) {
            if (organelle instanceof CellWall) {
                System.out.println("Cell Wall already exists in Plant Cell");
                return this;
            }
        }
        if (cellWall) {
            organelleList.add(new CellWall());
        }
        return this;
    }

    @Override
    public PlantCellBuilder setChloroplasts(boolean chloroplasts) {
        if (chloroplasts) {
            organelleList.add(new Chloroplasts());
        }
        return this;
    }

    @Override
    public PlantCellBuilder setPlantVacuoles(boolean plantVacuoles) {
        if (plantVacuoles) {
            organelleList.add(new PlantVacuoles());
        }
        return this;
    }
}
