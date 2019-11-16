import creators.Creator;
import creators.XMLCreator;
import deserializers.Deserializer;
import objects.ObjToSerialize;
import org.junit.*;
import serializers.Serializer;
import static org.junit.Assert.*;
import java.util.Arrays;

public class XMLSerializatorTest {

    private ObjToSerialize object;
    private Serializer serializer;
    private Deserializer deserializer;

    @Before
    public void setUp(){
        object = new ObjToSerialize("white", "blue", Arrays.asList(6.,7.,16.7, 18.2));
        Creator creator = new XMLCreator();
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
        System.out.println("XML Serializer is fully tested");
    }


}
