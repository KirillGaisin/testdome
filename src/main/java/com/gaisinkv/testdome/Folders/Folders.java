package com.gaisinkv.testdome.Folders;

import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

//40min
public class Folders {
    public static Collection<String> folderNames(String xml, char startingLetter) throws Exception {

        DocumentBuilder db = DocumentBuilderFactory
                .newInstance()
                .newDocumentBuilder();
        InputSource is = new InputSource(new StringReader(xml));

        List<String> folders = new ArrayList<>();
        NodeList nl = db.parse(is).getElementsByTagName("folder");
        for (int i = 0; i < nl.getLength(); i++) {
            Node folder = nl.item(i);
            String folderName = folder.getAttributes().getNamedItem("name").toString();
            folderName = folderName.substring(6, folderName.length()-1);
            if(folderName.charAt(0) == startingLetter)
                folders.add(folderName);
        }
        return folders;
    }

    public static void main(String[] args) throws Exception {
        String xml =
                "<?xml version=\"1.0\" encoding=\"UTF-8\"?>" +
                        "<folder name=\"c\">" +
                        "<folder name=\"program files\">" +
                        "<folder name=\"uninstall information\" />" +
                        "</folder>" +
                        "<folder name=\"users\" />" +
                        "</folder>";

        Collection<String> names = folderNames(xml, 'u');
        for(String name: names)
            System.out.println(name);
    }
}
