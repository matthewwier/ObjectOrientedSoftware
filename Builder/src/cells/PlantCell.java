package cells;

import builders.PlantCellBuilder;

public class PlantCell extends Cell {

    public PlantCell(PlantCellBuilder plantCellBuilder) {
        organelleList = plantCellBuilder.getOrganelleList();
    }
}
