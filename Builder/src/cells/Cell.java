package cells;

import organelles.Organelle;

import java.util.ArrayList;
import java.util.List;

public class Cell {

    List<Organelle> organelleList;
    Cell(){
        organelleList = new ArrayList<>();
    }
    public List<Organelle> showOrganelleList(){
        return this.organelleList;
    }
}
