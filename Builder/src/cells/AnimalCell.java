package cells;

import builders.AnimalCellBuilder;

public class AnimalCell extends Cell {

    public AnimalCell(AnimalCellBuilder builder) {
        organelleList = builder.getOrganelleList();
    }

}
