package creators;

import deserializers.Deserializer;
import serializers.Serializer;

public interface Creator {
    Serializer CreateSerializer();
    Deserializer CreateDeserializer();
}
