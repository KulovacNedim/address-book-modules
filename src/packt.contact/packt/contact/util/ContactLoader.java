package packt.contact.util;

import java.util.List;
import java.util.ArrayList;
import packt.contact.model.Contact;
import packt.contact.internal.XmlUtil;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import javax.xml.parsers.ParserConfigurationException;
import org.xml.sax.SAXException;
import java.io.IOException;

public class ContactLoader {
	public List<Contact> loadContacts(String fileName) throws ContactLoadException{
		
		List<Contact> contacts = new ArrayList<>();
		
		XmlUtil xmlUtil = new XmlUtil();
		Document doc;
		try {
			doc = xmlUtil.loadXmlFile(fileName);
			
			NodeList nList = doc.getElementsByTagName("contact");
			for (int temp = 0; temp < nList.getLength(); temp++) {
				Node node = nList.item(temp);
				if (node.getNodeType() == Node.ELEMENT_NODE) {
				Element eElement = (Element) node;
				Contact contact = new Contact("id", eElement.getElementsByTagName("firstname").item(0).getTextContent(), eElement.getElementsByTagName("lastname").item(0).getTextContent(), "000-000-000");
				contacts.add(contact);
			 }
		  }
		  return contacts;
		} catch (ParserConfigurationException | SAXException | IOException e) {
			throw new ContactLoadException("Unable to load Contact file");
		}
	}
}