package cells;

import organelles.Organelle;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class Cell {
    List<Organelle> organelleList;

    Cell() {
        organelleList = new ArrayList<>();
    }


    public String toString() {
        Iterator it = organelleList.iterator();
        StringBuilder sb = new StringBuilder();
        sb.append("Inside the ");
        sb.append(getClass().toString().split("\\.")[1]);
        sb.append(":\n");
        while (it.hasNext()) {
            Organelle organelle = (Organelle) it.next();
            sb.append("name: ");
            sb.append(organelle);
            sb.append(" , function: ");
            sb.append(organelle.myFunction());
            sb.append("\n");
        }
        return sb.toString();
    }
}
