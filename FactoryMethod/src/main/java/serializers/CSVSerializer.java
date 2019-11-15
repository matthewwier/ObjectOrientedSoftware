package serializers;

import objects.ObjToSerialize;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


public class CSVSerializer implements Serializer {

    public void serialize(ObjToSerialize object) {
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

        BufferedWriter writer = null;
        try {
            writer = new BufferedWriter(new FileWriter("serializedObject"));
            writer.write(sb.toString());
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
