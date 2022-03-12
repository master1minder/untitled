package lESSON2.entity;

import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.Namespace;
import org.jdom2.output.Format;
import org.jdom2.output.XMLOutputter;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Hod {
    private int id;
    private int pos;
    private int playerId;

    public Hod() {
    }

    public Hod(int id, int pos, int playerId) {
        this.id = id;
        this.pos = pos;
        this.playerId = playerId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPos() {
        return pos;
    }

    public void setPos(int pos) {
        this.pos = pos;
    }

    public int getName() {
        return playerId;
    }

    public void setName(int playerId) {
        this.playerId = playerId;
    }

    @Override
    public String toString() {
        return "Hod{" +
                "pos=" + pos +
                ", name='" + playerId + '\'' +
                '}';
    }

    // метод записи в XML файл с помощью JDOM
    public static void write(List<Player> players, List<Hod> hods) throws IOException {
        Document doc = new Document();
        // создаем корневой элемент с пространством имен
        doc.setRootElement(new Element("Gameplay",
                Namespace.getNamespace("")));
        for(Player player : players){
            Element plElement = new Element("Player",
                    Namespace.getNamespace("")).
                    setAttribute("id", String.valueOf(player.getId())).
                    setAttribute("name", String.valueOf(player.getName())).
                    setAttribute("symbol", String.valueOf(player.getSymbol()));
            doc.getRootElement().addContent(plElement);
        }

        // формируем JDOM документ из объектов hod
        Element gameElement = new Element("Game");
        for (Hod hod : hods) {
            gameElement.addContent(new Element("Step",
                    Namespace.getNamespace("")).
                    setAttribute("num", String.valueOf(hod.getId()))
                    .setAttribute("playerId", String.valueOf(hod.getName())).setText("" + hod.getPos()));


        }doc.getRootElement().addContent(gameElement);

        //последний игрок в коллекции победитель
        Player winner = players.get(players.size()-1);

        Element gameResult = new Element("GameResult");
        gameResult.addContent(new Element("Player")
                .setAttribute("id",String.valueOf(winner.getId()))
                .setAttribute("name", String.valueOf(winner.getName()))
                .setAttribute("symbol", String.valueOf(winner.getSymbol())));

        doc.getRootElement().addContent(gameResult);
        // Документ JDOM сформирован и готов к записи в файл
        XMLOutputter xmlWriter = new XMLOutputter(Format.getPrettyFormat());
        // сохнаряем в файл
        xmlWriter.output(doc, new FileOutputStream("src/main/resources/List.xml"));
    }


}
