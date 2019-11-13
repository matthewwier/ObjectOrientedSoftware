package serializers;

import com.google.gson.Gson;
import objects.ObjToSerialize;

public class JSONSerializer implements Serializer {

    public String serialize(ObjToSerialize object) {
        Gson gson = new Gson();
        return gson.toJson(object);
    }
}
