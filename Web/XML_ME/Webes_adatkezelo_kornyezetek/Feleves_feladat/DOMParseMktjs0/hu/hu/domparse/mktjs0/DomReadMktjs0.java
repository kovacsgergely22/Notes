package hu.domparse.mktjs0;

import org.w3c.dom.*;
import javax.xml.parsers.*;
import java.io.File;
import java.io.FileWriter;

public class DomReadMktjs0 {
    public static void main(String[] args) {
        try {
            // Létrehoz egy DocumentBuilderFactory példányt
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            
            // Létrehoz egy DocumentBuilder példányt
            DocumentBuilder builder = factory.newDocumentBuilder();
            
            // Beolvassa az XML fájlt
            Document document = builder.parse(new File("Web\\XML_ME\\Webes_adatkezelo_kornyezetek\\Feleves_feladat\\XMLmktjs0.xml"));
            
            // Normalizálja az XML dokumentumot
            document.getDocumentElement().normalize();
            
            // Kiírja a gyökérelem nevét
            System.out.println("Root element: " + document.getDocumentElement().getNodeName());
            
            // Létrehoz egy FileWriter példányt a fájlba íráshoz
            FileWriter writer = new FileWriter("output.txt");
            
            // Beolvassa az összes elem nevét és értékét
            NodeList nodeList = document.getElementsByTagName("*");
            for (int i = 0; i < nodeList.getLength(); i++) {
                Node node = nodeList.item(i);
                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    Element element = (Element) node;
                    String output = "Element: " + element.getNodeName() + ", Value: " + element.getTextContent();
                    
                    // Kiírja az adatokat a konzolra
                    System.out.println(output);
                    
                    // Kiírja az adatokat a fájlba
                    writer.write(output + "\n");
                }
            }
            
            // Bezárja a FileWriter példányt
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}