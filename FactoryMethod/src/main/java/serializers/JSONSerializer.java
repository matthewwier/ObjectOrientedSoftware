package serializers;

import objects.ObjToSerialize;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class JSONSerializer implements Serializer {

    public void serialize(ObjToSerialize object) {

        StringBuilder json = new StringBuilder("{ ");
        json.append('"');
        json.append("name");
        json.append('"');
        json.append(':');
        json.append('"');
        json.append(object.getName());
        json.append('"');
        json.append(", ");
        json.append('"');
        json.append("colour");
        json.append('"');
        json.append(':');
        json.append('"');
        json.append(object.getColour());
        json.append('"');
        json.append(", ");
        json.append('"');
        json.append("sizes");
        json.append('"');
        json.append(": [");
        int i = 1;
        for(Double size : object.getSizes()){
            json.append(" ");
            json.append(size);
            if(i < object.getSizes().size())
                json.append(",");
            i++;
        }
        json.append(" ]");
        json.append(" ");
        json.append("}");

        System.out.println("JSON:");
        System.out.println(json.toString());
        System.out.println("Object:");

        BufferedWriter writer = null;
        try {
            writer = new BufferedWriter(new FileWriter("serializedObject"));
            writer.write(json.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
