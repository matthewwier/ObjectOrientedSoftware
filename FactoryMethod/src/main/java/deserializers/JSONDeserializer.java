package deserializers;

import objects.ObjToSerialize;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class JSONDeserializer implements Deserializer{
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


        String[] parts = serializedObject.split(",");
        ObjToSerialize object = new ObjToSerialize();
        List<Double> sizes = new ArrayList<Double>();
        int counter = 0;
        for(String part : parts){
            if(part.contains("\"") && counter < 2){
                if(counter==0){
                    object.setName(part.split("\"")[3]);
                }
                else if(counter==1){
                    object.setColour(part.split("\"")[3]);
                }
            }
            else{
                if(part.contains("[")){
                    Double size = Double.parseDouble(part.split(" ")[3]);
                    sizes.add(size);
                }else if(part.contains("]")){
                    Double size = Double.parseDouble(part.split(" ")[1]);
                    sizes.add(size);
                }
                else{
                    Double size = Double.parseDouble(part.split(" ")[1]);
                    sizes.add(size);
                }
            }
            counter++;
        }

        object.setSizes(sizes);

        return object;
    }
}
