package builders;

import organelles.*;

import java.util.ArrayList;
import java.util.List;

public abstract class CellBuilder {
    List<Organelle> organelleList;

    CellBuilder() {
        organelleList = new ArrayList<>();
    }

    public void showOrganelles() {
        System.out.println(organelleList.toString());
    }


    public List<Organelle> getOrganelleList() {
        return this.organelleList;
    }

    // cell membrane
    public CellBuilder setCellMembrane(boolean cellMembrane) {
        if (cellMembrane) {
            organelleList.add(new CellMembrane());
        }
        return this;
    }

    public CellBuilder setCellNucleus(boolean cellNucleus) {
        for(Organelle organelle : organelleList){
            if (organelle instanceof CellNucleus) {
                System.out.println("Cell Nucleus already exists in Cell");
                return this;
            }
        }
        if (cellNucleus) {
            organelleList.add(new CellNucleus());
        }
        return this;
    }

    public CellBuilder setNuclearEnvelope(boolean nuclearEnvelope) {
        if (nuclearEnvelope) {
            organelleList.add(new NuclearEnvelope());
        }
        return this;
    }

    public CellBuilder setCytoplasm(boolean cytoplasm) {
        if (cytoplasm) {
            organelleList.add(new Cytoplasm());
        }
        return this;
    }

    public CellBuilder setEndoplasmicreticulum(boolean endoplasmicreticulum) {
        if (endoplasmicreticulum) {
            organelleList.add(new EndoplasmicReticulum());
        }
        return this;
    }

    public CellBuilder setRibosomes(boolean ribosomes) {
        if (ribosomes) {
            organelleList.add(new Ribosomes());
        }
        return this;
    }

    public CellBuilder setMitochondria(boolean mitochondria) {
        if (mitochondria) {
            organelleList.add(new Mitochondria());
        }
        return this;
    }

    public CellBuilder setLysosomes(boolean lisosomes) {
        if (lisosomes) {
            organelleList.add(new Lysosomes());
        }
        return this;
    }


}
