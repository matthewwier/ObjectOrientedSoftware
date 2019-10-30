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

    public PlantCellBuilder setCellWall(boolean cellWall) {
        for (Organelle organelle : organelleList) {
            if (organelle instanceof CellWall) {
                System.out.println("Cell Wall already exists in Plant Cell. It should be one.");
                return this;
            }
        }
        if (cellWall) {
            organelleList.add(new CellWall());
        }
        return this;
    }

    public PlantCellBuilder setChloroplasts(boolean chloroplasts) {
        if (chloroplasts) {
            organelleList.add(new Chloroplasts());
        }
        return this;
    }

    public PlantCellBuilder setPlantVacuoles(boolean plantVacuoles) {
        if (plantVacuoles) {
            organelleList.add(new PlantVacuoles());
        }
        return this;
    }
}
