package packt.contact.internal;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import java.io.IOException;
import java.io.File;
import org.xml.sax.SAXException;

public class XmlUtil {
	
	public Document loadXmlFile(String fileName) throws ParserConfigurationException, SAXException, IOException {
		File inputFile = new File(fileName);
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
		Document doc = dBuilder.parse(inputFile);
		doc.getDocumentElement().normalize();
		return doc;
	}
	
	public String getElement(Node nNode, String tagName) {
		if (nNode.getNodeType() == Node.ELEMENT_NODE) {
		Element eElement = (Element) nNode;
		return eElement.getElementsByTagName(tagName).item(0).getTextContent();
		}
		return "";
	}
}