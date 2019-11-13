package creators;

import serializers.CSVSerializer;
import serializers.Serializer;

public class CSVCreator implements Creator {
    public Serializer CreateSerializer() {
        return new CSVSerializer();
    }
}
