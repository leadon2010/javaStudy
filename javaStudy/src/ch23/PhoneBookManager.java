package ch23;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class PhoneBookManager {
	Set set;

	public PhoneBookManager(Set set) {
		this.set = set;
	}

	public PhoneBookManager() {
		set = new HashSet();
	}

	public void add(Collection c) {
		set.addAll(c);
	}

	public void add(PhoneBook pb) {
		set.add(pb);
	}

	public Set getSet() {
		return set;
	}

	public Set getPhoneBooksByName(String name) {
		Set s = new HashSet();
		Iterator<PhoneBook> itr = set.iterator();
		while (itr.hasNext()) {
			PhoneBook pb = itr.next();
			if (name.equals(pb.getName())) {
				s.add(pb);
			}
		}
		return s;
	}// end of getPhoneBooksByName

}
