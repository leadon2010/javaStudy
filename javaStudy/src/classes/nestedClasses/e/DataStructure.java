package classes.nestedClasses.e;

import java.util.Iterator;

public class DataStructure {
	private final static int SIZE = 15;
	private int[] intAry = new int[SIZE];

	public DataStructure() {
		for (int i = 0; i < SIZE; i++) {
			intAry[i] = i;
		}
	}

	public void printEven() {
		DataStructureIterator iterator = this.new EvenIterator();
		while (iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
		}
		System.out.println();
	}

	// 중첩 인터페이스.
	interface DataStructureIterator extends Iterator {
	}

	private class EvenIterator implements DataStructureIterator {
		private int nextIndex = 0;

		@Override
		public boolean hasNext() {
			return (nextIndex <= SIZE - 1);
		}

		@Override
		public Object next() {
			Integer retValue = Integer.valueOf(intAry[nextIndex]);
			nextIndex += 2;
			return retValue;
		}

	}
}
