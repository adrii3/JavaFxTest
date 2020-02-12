package control;


import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TabPane;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class SampleController {





    @FXML
    TabPane tabPane;


    public SampleController() throws IOException, ParserConfigurationException, SAXException {
        String pathURL = "http://gencat.cat/llengua/cinema/provacin.xml";
        URL url = new URL(pathURL);

        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
        Document doc = dBuilder.parse(new InputSource(url.openStream()));

        NodeList nodeList = doc.getElementsByTagName("FILM");

        List<Pelicula> filmList = new ArrayList<>();

        for (int i = 0; i < nodeList.getLength(); i++) {
            Node nNode = nodeList.item(i);

            if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                Element eElement = (Element) nNode;

                try{
                    String Prioritat = eElement.getElementsByTagName("PRIORITAT").item(0).getTextContent();
                    String Titol = eElement.getElementsByTagName("TITOL").item(0).getTextContent();
                    String Situacio = eElement.getElementsByTagName("SITUACIO").item(0).getTextContent();
                    String Cartell = eElement.getElementsByTagName("CARTELL").item(0).getTextContent();
                    String Original = eElement.getElementsByTagName("ORIGINAL").item(0).getTextContent();
                    String Direccio = eElement.getElementsByTagName("DIRECCIO").item(0).getTextContent();
                    String Interprets = eElement.getElementsByTagName("INTERPRETS").item(0).getTextContent();
                    String Sinopsi = eElement.getElementsByTagName("SINOPSI").item(0).getTextContent();
                    String Versio = eElement.getElementsByTagName("VERSIO").item(0).getTextContent();
                    String Idioma = eElement.getElementsByTagName("IDIOMA_x0020_ORIGINAL").item(0).getTextContent();
                    String Qualificacio = eElement.getElementsByTagName("QUALIFICACIO").item(0).getTextContent();
                    String Trailer = eElement.getElementsByTagName("TRAILER").item(0).getTextContent();
                    String Web = eElement.getElementsByTagName("WEB").item(0).getTextContent();
                    int ID = Integer.parseInt(eElement.getElementsByTagName("IDFILM").item(0).getTextContent());
                    int Any = Integer.parseInt(eElement.getElementsByTagName("ANY").item(0).getTextContent());
                    String Estrena = String.valueOf(eElement.getElementsByTagName("ESTRENA").item(0).getTextContent());


                    Pelicula pelicula = new Pelicula(Prioritat, Titol, Situacio, Cartell, Original, Direccio, Interprets, Sinopsi, Versio, Idioma, Qualificacio, Trailer, Web, ID, Any, Estrena);
                    filmList.add(pelicula);
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        }

        ObservableList<Pelicula> peliculaObservableList;

    }
}
