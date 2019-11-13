package main;

import creators.CSVCreator;
import creators.Creator;
import deserializers.CSVDeserializer;
import deserializers.Deserializer;
import objects.ObjToSerialize;

import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        ObjToSerialize s = new ObjToSerialize("tshirt", "red", Arrays.asList(24., 2.5, 4.3));
//        Creator c = new JSONCreator();
//        Serializer serializer = c.CreateSerializer();
//        serializer.serialize(s);
        Creator csvCreator = new CSVCreator();
        Deserializer ds = new CSVDeserializer();
        String serialized = csvCreator.CreateSerializer().serialize(s);
        System.out.println(serialized);
        ObjToSerialize object = ds.deserialize(serialized);
        System.out.println(object.getColour());
        System.out.println(object.getName());
        System.out.println(object.getSizes());

    }
}
