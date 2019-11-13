package serializers;

import objects.ObjToSerialize;

public interface Serializer {
    String serialize(ObjToSerialize object);
}
