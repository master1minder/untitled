package lESSON2;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import lESSON2.entity.Hod;
import lESSON2.entity.Player;
import org.jdom2.Element;
import org.jdom2.input.DOMBuilder;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;



public class XMLL {
    static List<Player> players;
    static List<Hod> hodList;
    public static List<String> reader() {
        final String fileName = "src/main/resources/List.xml";
        org.jdom2.Document jdomDoc;
        List<String> emp = new ArrayList<>();
        int i=0;
        try {
            jdomDoc = useDOMParser(fileName);
            Element root = jdomDoc.getRootElement();
            emp = new ArrayList<>();
            List<Element> empListElements = root.getChildren("Game");
            for (Element empElement : empListElements) {

                String s;
                s = empElement.getValue();
                emp.add(i,s);
                i++;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return emp;
    }

    private static org.jdom2.Document useDOMParser(String fileName)
            throws ParserConfigurationException, SAXException, IOException {
        //creating DOM Document
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder;
        dBuilder = dbFactory.newDocumentBuilder();
        Document doc = dBuilder.parse(new File(fileName));
        DOMBuilder domBuilder = new DOMBuilder();
        return domBuilder.build(doc);
    }

}