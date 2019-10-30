package main;

import builders.AnimalCellBuilder;
import builders.PlantCellBuilder;
import cells.Cell;

public class Main {
    public static void main(String[] args) {
        AnimalCellBuilder builder = new AnimalCellBuilder();
        builder.setAnimalVacuoles(true);
        builder.setCellMembrane(true);
        Cell animalCell = builder.build();

        PlantCellBuilder plantCellBuilder = new PlantCellBuilder();
        plantCellBuilder.setChloroplasts(true);
        plantCellBuilder.setCellWall(true);
        plantCellBuilder.setLysosomes(true);
        plantCellBuilder.setLysosomes(true);
        Cell plantCell = plantCellBuilder.build();

        System.out.println(animalCell);
        System.out.println(plantCell);
    }
}
