package main;

import builders.AnimalCellBuilder;
import builders.CellBuilder;
import builders.PlantCellBuilder;
import cells.Cell;

public class Main {
    public static void main(String[] args) {
        CellBuilder builder = new AnimalCellBuilder();
        builder.setCellMembrane(true);
        builder.setRibosomes(true);
        builder.setMitochondria(true);
        Cell animalCell = builder.build();


        CellBuilder plantCellBuilder = new PlantCellBuilder();
        plantCellBuilder.setChloroplasts(true);
        Cell plantCell = plantCellBuilder.build();
        System.out.println(plantCell);
        System.out.println(animalCell);
    }
}
