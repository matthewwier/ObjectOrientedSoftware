package creators;

import serializers.Serializer;
import serializers.XMLSerializer;

public class XMLCreator implements Creator{
    public Serializer CreateSerializer() {
        return new XMLSerializer();
    }
}
