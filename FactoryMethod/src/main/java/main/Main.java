package main;

import creators.CSVCreator;
import creators.Creator;
import creators.JSONCreator;
import creators.XMLCreator;
import deserializers.Deserializer;
import objects.ObjToSerialize;
import serializers.Serializer;

import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        ObjToSerialize o = new ObjToSerialize("cube", "red", Arrays.asList(24., 2.5, 4.3));
        Creator[] creators = {new JSONCreator(), new CSVCreator(), new XMLCreator()};
        for(Creator c : creators){
            Serializer serializer = c.CreateSerializer();
            Deserializer deserializer = c.CreateDeserializer();
            serializer.serialize(o);
            ObjToSerialize object = deserializer.deserialize("serializedObject");
            System.out.println(object.getName());
            System.out.println(object.getColour());
            System.out.println(object.getSizes());
        }

    }
}
