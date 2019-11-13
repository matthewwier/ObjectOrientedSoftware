package objects;

import java.util.List;

public class ObjToSerialize {
    private String name;
    private String colour;
    private List<Double> sizes;

    public ObjToSerialize() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public List<Double> getSizes() {
        return sizes;
    }

    public void setSizes(List<Double> sizes) {
        this.sizes = sizes;
    }


    public ObjToSerialize(String name, String colour, List<Double> sizes) {
        this.name = name;
        this.colour = colour;
        this.sizes = sizes;
    }

}
