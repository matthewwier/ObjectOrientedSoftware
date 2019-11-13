package creators;

import serializers.Serializer;

public interface Creator {
    Serializer CreateSerializer();
}
