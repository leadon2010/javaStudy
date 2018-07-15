package ch24;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

class CarComp implements Comparator<Car> {

	@Override
	public int compare(Car o1, Car o2) {
		return o1.disp - o2.disp;
	}

}

public class CarComparator {
	public static void main(String[] args) {
		List<Car> list = new ArrayList<>();
		list.add(new Car(1800));
		list.add(new Car(1200));
		list.add(new Car(3000));

		List<ECar> elist = new ArrayList<>();
		elist.add(new ECar(3000, 55));
		elist.add(new ECar(1800, 87));
		elist.add(new ECar(1200, 99));

		CarComp comp = new CarComp();

		Collections.sort(list, comp);
		Collections.sort(elist, comp);

		for (Iterator<Car> itr = list.iterator(); itr.hasNext();)
			System.out.println(itr.next() + "\t");

		for (Iterator<ECar> itr = elist.iterator(); itr.hasNext();)
			System.out.println(itr.next() + "\t");
	}
}
