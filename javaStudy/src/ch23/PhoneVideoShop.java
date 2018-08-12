package ch23;

import java.util.Collection;
import java.util.Iterator;

public class PhoneVideoShop {
	public static void main(String[] args) {
		PhoneBookManager mgr = new PhoneBookManager();
		mgr.add(new PhoneBook("1131", "address1", "name1"));
		mgr.add(new PhoneBook("2122", "address2", "name2"));
		mgr.add(new PhoneBook("3313", "address3", "name3"));
		mgr.add(new PhoneBook("4441", "address4", "name4"));

		// Collection<?> c = mgr.getPhoneBooksByName("name1");
		// Collection<?> c = mgr.getPhoneBooksByAddress("add");
		Collection<?> c = mgr.getPhoneBooksByNumber("3");
		if (c.size() > 0) {
			for (Iterator<?> itr = c.iterator(); itr.hasNext();) {
				//PhoneBook pb = (PhoneBook) itr.next();
				System.out.println(itr.next());
			}
		} else
			System.out.println("no data found");

	}// end of main
}// end of class
