package creators;

import deserializers.CSVDeserializer;
import deserializers.Deserializer;
import serializers.CSVSerializer;
import serializers.Serializer;

public class CSVCreator implements Creator {
    public Serializer CreateSerializer() {
        return new CSVSerializer();
    }

    public Deserializer CreateDeserializer() {
        return new CSVDeserializer();
    }
}
