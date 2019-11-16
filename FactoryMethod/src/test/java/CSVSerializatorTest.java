import creators.CSVCreator;
import creators.Creator;
import deserializers.Deserializer;
import objects.ObjToSerialize;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import serializers.Serializer;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class CSVSerializatorTest {

    private ObjToSerialize object;
    private Serializer serializer;
    private Deserializer deserializer;

    @Before
    public void setUp(){
        object = new ObjToSerialize("white", "blue", Arrays.asList(6.,7.,16.7, 18.2));
        Creator creator = new CSVCreator();
        serializer = creator.CreateSerializer();
        deserializer = creator.CreateDeserializer();
    }

    @Test
    public void checkName(){
        serializer.serialize(object);
        ObjToSerialize deserialized =  deserializer.deserialize("serializedObject");
        assertEquals(deserialized.getName(), object.getName());
    }

    @Test
    public void checkColour(){
        serializer.serialize(object);
        ObjToSerialize deserialized =  deserializer.deserialize("serializedObject");
        assertEquals(deserialized.getColour(), object.getColour());
    }

    @Test
    public void checkSizes(){
        serializer.serialize(object);
        ObjToSerialize deserialized =  deserializer.deserialize("serializedObject");
        assertEquals(deserialized.getSizes(), object.getSizes());
    }

    @AfterClass
    public static void exit(){
        System.out.println("CSV Serializer is fully tested");
    }
}
