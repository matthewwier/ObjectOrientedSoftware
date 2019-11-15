package creators;

import deserializers.Deserializer;
import deserializers.XMLDeserializer;
import serializers.Serializer;
import serializers.XMLSerializer;

public class XMLCreator implements Creator{
    public Serializer CreateSerializer() {
        return new XMLSerializer();
    }

    public Deserializer CreateDeserializer() {
        return new XMLDeserializer();
    }
}
