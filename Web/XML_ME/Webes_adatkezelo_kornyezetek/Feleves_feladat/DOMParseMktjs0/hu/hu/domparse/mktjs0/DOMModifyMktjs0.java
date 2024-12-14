package hu.domparse.mktjs0;

import org.w3c.dom.*;
import javax.xml.parsers.*;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;

public class DOMModifyMktjs0 {

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
            
            // 1. Módosítás: Egy oktató nevének megváltoztatása
            NodeList oktatoList = document.getElementsByTagName("oktato");
            if (oktatoList.getLength() > 0) {
                Element oktato = (Element) oktatoList.item(0);
                oktato.getElementsByTagName("nev").item(0).setTextContent("Dr. Kovács Gergely");
                System.out.println("Modified oktato nev to Dr. Kovács Gergely");
            }
            
            // 2. Módosítás: Egy nyelv nevének megváltoztatása
            NodeList nyelvList = document.getElementsByTagName("nyelv");
            if (nyelvList.getLength() > 0) {
                Element nyelv = (Element) nyelvList.item(0);
                nyelv.getElementsByTagName("nev").item(0).setTextContent("Spanyol");
                System.out.println("Modified nyelv nev to Spanyol");
            }
            
               // 3. Módosítás: Egy oktató email címének megváltoztatása
               if (oktatoList.getLength() > 1) {
                Element oktato = (Element) oktatoList.item(1);
                oktato.getElementsByTagName("email").item(0).setTextContent("kovacs.gergely@example.com");
                System.out.println("Modified oktato email to kovacs.gergely@example.com");
            }
            
            // 4. Módosítás: Egy nyelv hozzáadása
            Element newNyelv = document.createElement("nyelv");
            newNyelv.setAttribute("nyID", "NY0004");
            Element newNyelvNev = document.createElement("nev");
            newNyelvNev.setTextContent("Francia");
            newNyelv.appendChild(newNyelvNev);
            document.getDocumentElement().getElementsByTagName("nyelvek").item(0).appendChild(newNyelv);
            System.out.println("Added new nyelv with nev Francia");
            
            // 5. Módosítás: Egy oktató törlése
            if (oktatoList.getLength() > 2) {
                Node oktatoToRemove = oktatoList.item(2);
                oktatoToRemove.getParentNode().removeChild(oktatoToRemove);
                System.out.println("Removed oktato with oktID OKT0003");
            }
            
            // Az XML dokumentum mentése
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(document);
            StreamResult result = new StreamResult(new File("Web\\XML_ME\\Webes_adatkezelo_kornyezetek\\Feleves_feladat\\ModifiedXMLmktjs0.xml"));
            transformer.transform(source, result);
            
            System.out.println("XML módosítások mentve a ModifiedXMLmktjs0.xml fájlba.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
