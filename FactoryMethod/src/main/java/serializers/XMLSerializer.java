package serializers;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;
import objects.ObjToSerialize;

public class XMLSerializer implements Serializer {

    public String serialize(ObjToSerialize object) {
        XStream xstream = new XStream(new DomDriver());
        return xstream.toXML(object);
    }
}
