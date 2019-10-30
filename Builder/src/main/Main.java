package main;

import builders.AnimalCellBuilder;
import cells.AnimalCell;

public class Main {
    public static void main(String[] args) {
        AnimalCellBuilder builder = new AnimalCellBuilder();
        builder.setCellMembrane(true);
        builder.setCellNucleus(true);
        AnimalCell animalCell = builder.build();
        System.out.println(animalCell);
    }
}
