package main;

import creators.CSVCreator;
import creators.Creator;
import creators.JSONCreator;
import creators.XMLCreator;
import deserializers.CSVDeserializer;
import deserializers.Deserializer;
import objects.ObjToSerialize;
import serializers.Serializer;

import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        ObjToSerialize o = new ObjToSerialize("tshirt", "red", Arrays.asList(24., 2.5, 4.3));
//        Creator c = new JSONCreator();
//        Serializer serializer = c.CreateSerializer();
//        Deserializer deserializer = c.CreateDeserializer();
//        String serializedObject = serializer.serialize(o);
//        System.out.println(serializedObject);
//        ObjToSerialize object = deserializer.deserialize(serializedObject);
        Creator c = new JSONCreator();
        Serializer serializer = c.CreateSerializer();
        Deserializer deserializer = c.CreateDeserializer();
        serializer.serialize(o);
        //System.out.println(serializedObject);
        ObjToSerialize object = deserializer.deserialize("serializedObject");
        System.out.println(object.getName());
        System.out.println(object.getColour());
        System.out.println(object.getSizes());
    }
}
