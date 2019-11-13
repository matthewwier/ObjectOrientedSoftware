package deserializers;

import objects.ObjToSerialize;

import java.util.ArrayList;
import java.util.List;

public class CSVDeserializer implements Deserializer {
    public ObjToSerialize deserialize(String serializedObject) {
        ObjToSerialize object = new ObjToSerialize();
        String[] lines = serializedObject.split("\n");
        String line = lines[1].replace(" ","");
        object.setName(line.split(",")[0].replace(" ", ""));
        object.setColour(line.split(",")[1].replace(" ", ""));
        String sizesExpression = lines[1].split(",")[2];
        String[] sizes = sizesExpression.split(" ");
        List<Double> szs = new ArrayList<Double>();
        for(String size : sizes){
            if(size.length() > 0){
                szs.add(Double.parseDouble(size));
            }
        }
        object.setSizes(szs);
        return object;
    }
}
