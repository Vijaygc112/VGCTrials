package com.basic;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

public class xmlParserTrial {


    public static void main(String[] args) throws Exception {

        try {

            File smallfile = new File("TestFile/testXML.xml");

            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document doc = builder.parse(smallfile);

            doc.getDocumentElement().normalize(); // necessary to remove redundancies (like 12 /n 34 will be converted to 1234)
            doc.getDocumentElement().getNodeName(); // gets the root element
            System.out.println(doc.getDocumentElement().getNodeName());

            NodeList list = doc.getElementsByTagName("Employee"); // nodeList is not iterable

            for (int i = 0; i < list.getLength(); i++) {            // so we use for loop to iterate
                Node n = list.item(i);
                System.out.println("Current element " + n.getNodeName());

                if (n.getNodeType() == Node.ELEMENT_NODE) {

                    Element e = (Element) n;
                    System.out.println("Attribute name is " + e.getAttribute("name"));
                    System.out.println("Student Name is : " + e.getElementsByTagName("name").item(0).getTextContent());
                    System.out.println("Student EMP ID is : " + e.getElementsByTagName("empid").item(0).getTextContent());
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
