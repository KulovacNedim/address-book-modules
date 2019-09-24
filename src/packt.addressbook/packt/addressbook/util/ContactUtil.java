package packt.addressbook.util;


import packt.addressbook.model.Contac;
import java.util.Arrays;
import java.util.List;

public class ContactUtil {
	
    public List<Contac> getContacts() {
        List<Contac> contacts = Arrays.asList(
                new Contac("1", "Edsger", "Dijkstra","345-678-9012"),
                new Contac("2", "Alan", "Turing", "456-789-0123"),
                new Contac("3", "Ada", "Lovelace", "234-567-8901"),
                new Contac("4", "Charles", "Babbage", "123-456-7890"),
                new Contac("5", "Tim", "Berners-Lee", "456-789-0123")
        );
        return contacts;
    }
}