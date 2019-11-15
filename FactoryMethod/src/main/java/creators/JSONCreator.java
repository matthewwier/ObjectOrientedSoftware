package creators;

import deserializers.Deserializer;
import deserializers.JSONDeserializer;
import serializers.JSONSerializer;
import serializers.Serializer;

public class JSONCreator implements Creator {
    public Serializer CreateSerializer() {
        return new JSONSerializer();
    }

    public Deserializer CreateDeserializer() {
        return new JSONDeserializer();
    }
}
