package deserializers;

import objects.ObjToSerialize;

public interface Deserializer {
    ObjToSerialize deserialize(String serializedObject);
}
