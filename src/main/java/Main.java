import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;


import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {



        //writeToXMLusingJDOM(hodlist,"src/main/resources/List.xml");
        parse();


    }

//    // метод записи в XML файл с помощью JDOM
//    private static void writeToXMLusingJDOM(List<Hod> students, String fileName) throws IOException {
//        Document doc = new Document();
//        // создаем корневой элемент с пространством имен
//        doc.setRootElement(new Element("Students",
//                Namespace.getNamespace("")));
//        // формируем JDOM документ из объектов Student
//        for (Hod student : students) {
//            Element studentElement = new Element("Student",
//                    Namespace.getNamespace(""));
//            studentElement.setAttribute("id", String.valueOf(student.getId()));
//            studentElement.addContent(new Element("hod",
//                    Namespace.getNamespace("")).setText("" + student.getPos()));
//            studentElement.addContent(new Element("name",
//                    Namespace.getNamespace("")).setText(student.getName()));
//            doc.getRootElement().addContent(studentElement);
//        }
//        // Документ JDOM сформирован и готов к записи в файл
//        XMLOutputter xmlWriter = new XMLOutputter(Format.getPrettyFormat());
//        // сохнаряем в файл
//        xmlWriter.output(doc, new FileOutputStream(fileName));
//    }

    private static Map<String, String> parse() {
        List<String> lA = new ArrayList<>();
        List<String> lN = new ArrayList<>();
        Map<String, String> mapH = new HashMap<>();
        try {
            int cnt = 0;
            DocumentBuilder documentBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
            Document document = documentBuilder.parse("src/main/resources/List.xml");
            Node root = document.getDocumentElement();
            NodeList hod = root.getChildNodes();
            for (int i = 0; i < hod.getLength(); i++) {
                Node book = hod.item(i);
                if (book.getNodeType() != Node.TEXT_NODE) {
                    NodeList hodProps = book.getChildNodes();
                    for (int j = 0; j < hodProps.getLength(); j++) {
                        Node hodProp = hodProps.item(j);
                        if (hodProp.getNodeType() != Node.TEXT_NODE) {
                            System.out.println(hodProp.getNodeName() + ":" + hodProp.getChildNodes().item(0).getTextContent());
                            if (hodProp.getNodeName().toString().equals("hod")) {
                                lA.add(hodProp.getChildNodes().item(0).getTextContent());
                            }
                            if (hodProp.getNodeName().toString().equals("name")) {
                                lN.add(cnt, hodProp.getChildNodes().item(0).getTextContent());
                                cnt++;
                            }
                        }
                    }
                    System.out.println("===========>>>>");
                }
            }
        } catch (ParserConfigurationException | IOException | SAXException ex) {
            ex.printStackTrace(System.out);
        }

        for (int i = 0; i < lA.size(); i++) {
            mapH.put(lA.get(i), lN.get(i));
        }
        return mapH;
    }


}


//    private static void parse(){
//        List<String> lA = null;
//        List<String> lN = null;
//        try {char board[] = {'1', '2', '3', '4', '5', '6', '7', '8', '9'};
//
//            DocumentBuilder documentBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
//            Document document =  documentBuilder.parse("src/main/resources/List.xml");
//            Node root = document.getDocumentElement();
//            // Просматриваем все подэлементы корневого - т.е. книги
//            NodeList hod = root.getChildNodes();
//            for (int i = 0; i < hod.getLength(); i++) {
//                Node book = hod.item(i);
//                if (book.getNodeType() != Node.TEXT_NODE) {
//                    NodeList hodProps = book.getChildNodes();
//                    for(int j = 0; j < hodProps.getLength(); j++) {
//                        Node hodProp = hodProps.item(j);
//                        if (hodProp.getNodeType() != Node.TEXT_NODE) {
//                            System.out.println(hodProp.getChildNodes().item(0).getTextContent() + ":" + hodProp.getChildNodes().item(0).getTextContent());
//                            if (hodProp.getNodeName().toString().equals("age")){
//                                lA.add(i,hodProp.getChildNodes().item(0).getTextContent());
//                            }
//                            if (hodProp.getNodeName().toString().equals("name")){
//                                lN.add(i,hodProp.getChildNodes().item(0).getTextContent());
//                            }
//                        }
//                    }
//                    System.out.println("===========>>>>");
//                }
//            }
//        } catch (ParserConfigurationException ex) {
//            ex.printStackTrace(System.out);
//        } catch (SAXException ex) {
//            ex.printStackTrace(System.out);
//        } catch (IOException ex) {
//            ex.printStackTrace(System.out);
//        }
//
//        lA.forEach(System.out::println);
//        System.out.println();
//        lN.forEach(System.out::println);
//    }
//
//
//
//
//}
