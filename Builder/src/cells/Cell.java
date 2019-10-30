package cells;

import organelles.Organelle;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Cell {
    // zaimplementowac to String w każdym z organelli
    // ustalenie ze blona i sciana komorkowa tylko raz
    List<Organelle> organelleList;
    Cell(){
        organelleList = new ArrayList<>();
    }
    public List<Organelle> showOrganelleList(){
        return this.organelleList;
    }

    public String toString(){
        Iterator it = organelleList.iterator();
        StringBuilder sb = new StringBuilder();
        sb.append("Cell contains:\n");
        while(it.hasNext()){
            sb.append(it.next());
            sb.append("\n");
        }
        return sb.toString();
    }
}
