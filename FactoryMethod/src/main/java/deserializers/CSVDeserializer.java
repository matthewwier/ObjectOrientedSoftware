package deserializers;

import objects.ObjToSerialize;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class CSVDeserializer implements Deserializer {
    public ObjToSerialize deserialize(String serializedObject) {

        StringBuilder fileContent = new StringBuilder();
        try (Stream<String> stream = Files.lines( Paths.get(serializedObject), StandardCharsets.UTF_8))
        {
            stream.forEach(s -> fileContent.append(s).append("\n"));
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        serializedObject =  fileContent.toString();




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
