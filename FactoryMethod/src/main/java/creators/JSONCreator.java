package creators;

import serializers.JSONSerializer;
import serializers.Serializer;

public class JSONCreator implements Creator {
    public Serializer CreateSerializer() {
        return new JSONSerializer();
    }
}
