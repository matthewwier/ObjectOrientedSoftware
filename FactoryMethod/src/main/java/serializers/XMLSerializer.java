package serializers;

import objects.ObjToSerialize;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class XMLSerializer implements Serializer {

    public void serialize(ObjToSerialize object) {

        StringBuffer xml = new StringBuffer("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
        xml.append("<ObjToSerialize>");
        xml.append("<name>");
        xml.append(object.getName());
        xml.append("</name>");
        xml.append("<colour>");
        xml.append(object.getColour());
        xml.append("</colour>");
        xml.append("<sizes>");
        for(Double size : object.getSizes()){
            xml.append("<size>");
            xml.append(size);
            xml.append("</size>");
        }
        xml.append("</sizes>");
        xml.append("</ObjToSerialize>");

        System.out.println("XML:");
        System.out.println(xml.toString());
        System.out.println("Object:");

        BufferedWriter writer = null;
        try {
            writer = new BufferedWriter(new FileWriter("serializedObject"));
            writer.write(xml.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
