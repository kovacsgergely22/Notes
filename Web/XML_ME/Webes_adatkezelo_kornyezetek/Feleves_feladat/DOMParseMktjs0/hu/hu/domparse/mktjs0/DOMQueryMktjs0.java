package hu.domparse.mktjs0;

import org.w3c.dom.*;
import javax.xml.parsers.*;
import java.io.File;

public class DOMQueryMktjs0 {

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
            
            // 1. Lekérdezés: Az összes oktató neve
            NodeList oktatoList = document.getElementsByTagName("oktato");
            System.out.println("Oktatók nevei:");
            for (int i = 0; i < oktatoList.getLength(); i++) {
                Element oktato = (Element) oktatoList.item(i);
                String nev = oktato.getElementsByTagName("nev").item(0).getTextContent();
                System.out.println(" - " + nev);
            }
            
            // 2. Lekérdezés: Az összes nyelv neve
            NodeList nyelvList = document.getElementsByTagName("nyelv");
            System.out.println("Nyelvek nevei:");
            for (int i = 0; i < nyelvList.getLength(); i++) {
                Element nyelv = (Element) nyelvList.item(i);
                String nev = nyelv.getElementsByTagName("nev").item(0).getTextContent();
                System.out.println(" - " + nev);
            }

            // 3. Lekérdezés: Az első oktató email címe
            if (oktatoList.getLength() > 0) {
                Element oktato = (Element) oktatoList.item(0);
                String email = oktato.getElementsByTagName("email").item(0).getTextContent();
                System.out.println("Az első oktató email címe: " + email);
            }
            
            // 4. Lekérdezés: Az összes oktató ID-ja
            System.out.println("Oktatók ID-jai:");
            for (int i = 0; i < oktatoList.getLength(); i++) {
                Element oktato = (Element) oktatoList.item(i);
                String oktID = oktato.getAttribute("oktID");
                System.out.println(" - " + oktID);
            }
            
            // 5. Lekérdezés: Az összes nyelv ID-ja
            System.out.println("Nyelvek ID-jai:");
            for (int i = 0; i < nyelvList.getLength(); i++) {
                Element nyelv = (Element) nyelvList.item(i);
                String nyID = nyelv.getAttribute("nyID");
                System.out.println(" - " + nyID);
            }

             // 6. Lekérdezés: Az összes könyv címe
             NodeList konyvList = document.getElementsByTagName("konyv");
             System.out.println("Könyvek címei:");
             for (int i = 0; i < konyvList.getLength(); i++) {
                 Element konyv = (Element) konyvList.item(i);
                 String cim = konyv.getElementsByTagName("cim").item(0).getTextContent();
                 System.out.println(" - " + cim);
             }

             // 7. Lekérdezés: Az összes tanuló neve
            NodeList tanuloList = document.getElementsByTagName("tanulo");
            System.out.println("Tanulók nevei:");
            for (int i = 0; i < tanuloList.getLength(); i++) {
                Element tanulo = (Element) tanuloList.item(i);
                String nev = tanulo.getElementsByTagName("nev").item(0).getTextContent();
                System.out.println(" - " + nev);
            }

            // 8. Lekérdezés: Az első könyv szerzője
            if (konyvList.getLength() > 0) {
                Element konyv = (Element) konyvList.item(0);
                String szerzo = konyv.getElementsByTagName("szerzo").item(0).getTextContent();
                System.out.println("Az első könyv szerzője: " + szerzo);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
