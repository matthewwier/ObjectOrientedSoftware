package serializers;

import objects.ObjToSerialize;


public class CSVSerializer implements Serializer {

    public String serialize(ObjToSerialize object) {
        StringBuilder sb = new StringBuilder("name, colour, sizes");
        sb.append("\n");
        sb.append(object.getName());
        sb.append(", ");
        sb.append(object.getColour());
        sb.append(", ");
        for(Double size: object.getSizes()){
            sb.append(size);
            sb.append(" ");
        }
        return sb.toString();
    }
}
