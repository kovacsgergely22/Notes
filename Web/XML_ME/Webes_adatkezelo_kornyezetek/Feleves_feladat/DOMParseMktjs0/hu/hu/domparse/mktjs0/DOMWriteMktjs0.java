package hu.domparse.mktjs0;

import org.w3c.dom.*;
import javax.xml.parsers.*;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;

public class DOMWriteMktjs0 {

    public static void main(String[] args) {
        try {
            // Létrehoz egy DocumentBuilderFactory példányt
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();

            // Létrehoz egy DocumentBuilder példányt
            DocumentBuilder builder = factory.newDocumentBuilder();

            // Beolvassa az XML fájlt
            Document document = builder
                    .parse(new File("Web\\XML_ME\\Webes_adatkezelo_kornyezetek\\Feleves_feladat\\XMLmktjs0.xml"));

            // Normalizálja az XML dokumentumot
            document.getDocumentElement().normalize();

            // Kiírja a gyökérelem nevét
            System.out.println("Root element: " + document.getDocumentElement().getNodeName());

            // Fa struktúra kiírása a konzolra
            printNode(document.getDocumentElement(), 0);

            // Az XML dokumentum mentése egy új fájlba
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(document);
            StreamResult result = new StreamResult(
                    new File("Web\\XML_ME\\Webes_adatkezelo_kornyezetek\\Feleves_feladat\\XMLmktjs0_1.xml"));
            transformer.transform(source, result);

            System.out.println("XML dokumentum mentve a XMLmktjs0_1.xml fájlba.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Rekurzív függvény a fa struktúra kiírásához
    private static void printNode(Node node, int indent) {
        // Kiírja a behúzást
        for (int i = 0; i < indent; i++) {
            System.out.print("  ");
        }

        // Kiírja az aktuális node nevét és értékét
        System.out.print(node.getNodeName());
        if (node.getNodeType() == Node.ELEMENT_NODE) {
            NamedNodeMap attributes = node.getAttributes();
            for (int i = 0; i < attributes.getLength(); i++) {
                Node attr = attributes.item(i);
                System.out.print(" [" + attr.getNodeName() + "=" + attr.getNodeValue() + "]");
            }
        }
        if (node.getNodeType() == Node.TEXT_NODE) {
            System.out.print(" = " + node.getNodeValue().trim());
        }
        System.out.println();

        // Rekurzív hívás a gyerek node-ok kiírásához
        NodeList nodeList = node.getChildNodes();
        for (int i = 0; i < nodeList.getLength(); i++) {
            printNode(nodeList.item(i), indent + 1);
        }
    }
}
