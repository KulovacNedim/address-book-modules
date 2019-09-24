package packt.addressbook;

import packt.addressbook.model.Contac;
import packt.addressbook.util.ContactUtil;
import packt.addressbook.util.SortUtil;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        ContactUtil contactUtil = new ContactUtil();
        SortUtil sortUtil = new SortUtil();
        List<Contac> contacts = contactUtil.getContacts();
        sortUtil.sortList(contacts);
        System.out.println(contacts);
    }
}

