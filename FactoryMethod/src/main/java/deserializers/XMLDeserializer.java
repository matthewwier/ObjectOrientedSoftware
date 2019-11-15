package deserializers;

import objects.ObjToSerialize;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class XMLDeserializer implements Deserializer{
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

        String nameRegex = Pattern.quote("<name>") + "(.*?)" + Pattern.quote("</name>");
        Pattern pattern = Pattern.compile(nameRegex);

        Matcher matcher = pattern.matcher(serializedObject);

        while (matcher.find()) {
            String name = matcher.group(1); // Since (.*?) is capturing group 1
            object.setName(name);
        }


        String colourRegex = Pattern.quote("<colour>") + "(.*?)" + Pattern.quote("</colour>");
        pattern = Pattern.compile(colourRegex);

        matcher = pattern.matcher(serializedObject);

        while (matcher.find()) {
            String colour = matcher.group(1); // Since (.*?) is capturing group 1
            object.setColour(colour);
        }

        String sizeRegex = Pattern.quote("<size>") + "(.*?)" + Pattern.quote("</size>");
        pattern = Pattern.compile(sizeRegex);

        matcher = pattern.matcher(serializedObject);

        List<Double> sizes = new ArrayList<Double>();
        while (matcher.find()) {
            Double size = Double.parseDouble(matcher.group(1)); // Since (.*?) is capturing group 1
            sizes.add(size);
        }
        object.setSizes(sizes);

        return object;
    }
}
