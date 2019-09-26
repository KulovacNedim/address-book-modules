package packt.addressbook;

import packt.contact.model.Contact;
import packt.contact.util.ContactLoader;
import packt.contact.util.ContactLoadException;
import packt.util.SortUtil;
import java.util.ArrayList;
import java.util.logging.Logger;

import java.util.List;

public class Main {
	private static final Logger logger = Logger.getLogger(Main.class.getName());
	
	public static void main(String[] args) {
		logger.info("Address book viewer application: Started");
		
		List<Contact> contacts = new ArrayList<>();
		ContactLoader contactLoader = new ContactLoader();
		SortUtil sortUtil = new SortUtil();
		try {
			contacts = contactLoader.loadContacts("assets/input.xml");
		} catch (ContactLoadException e) {
			logger.severe(e.getMessage());
			System.exit(0);
		}
		sortUtil.sortList(contacts);
		
		System.out.println(contacts);
		
		logger.info("Address book viewer application: Completed");
	}
}

