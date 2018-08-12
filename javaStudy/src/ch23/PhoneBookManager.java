package ch23;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class PhoneBookManager {
	Set<PhoneBook> set;

	public PhoneBookManager(Set<PhoneBook> set) {
		this.set = set;
	}

	public PhoneBookManager() {
		set = new HashSet<PhoneBook>();
	}

	public void add(Collection<PhoneBook> c) {
		set.addAll(c);
	}

	public void add(PhoneBook pb) {
		set.add(pb);
	}

	public Set<PhoneBook> getSet() {
		return set;
	}

	public Set<PhoneBook> getPhoneBooksByName(String name) {
		Set<PhoneBook> s = new HashSet<PhoneBook>();
		Iterator<PhoneBook> itr = set.iterator();
		while (itr.hasNext()) {
			PhoneBook pb = itr.next();
			if (name.equals(pb.getName())) {
				s.add(pb);
			}
		}
		return s;
	}// end of getPhoneBooksByName

	public Set<PhoneBook> getPhoneBooksByAddress(String address) {
		Set<PhoneBook> s = new HashSet<PhoneBook>();
		Iterator<PhoneBook> itr = set.iterator();
		while (itr.hasNext()) {
			PhoneBook pb = itr.next();
			if (pb.getAddress().indexOf(address) != -1)
				s.add(pb);
		}
		return s;
	}// end of getPhoneBooksByAddress

	public Set<PhoneBook> getPhoneBooksByNumber(String number) {
		Set<PhoneBook> s = new HashSet<PhoneBook>();
		for (Iterator<PhoneBook> itr = set.iterator(); itr.hasNext();) {
			PhoneBook pb = itr.next();
			if (pb.getNumber().indexOf(number) != -1)
				s.add(pb);
		}
		return s;
	}// end of getPhoneBooksByNumber

	public int getPhoneBookSize() {
		return set.size();
	}

}// end of PhoneBookManager
