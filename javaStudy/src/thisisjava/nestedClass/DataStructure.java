package thisisjava.nestedClass;

public class DataStructure {
	private final static int SIZE = 15;
	private int[] arrayOfInts = new int[SIZE];

	public DataStructure() {
		for (int i = 0; i < SIZE; i++) {
			arrayOfInts[i] = i;
		}
	}

	public void printEven() {
		DataStructureIterator iterator = this.new EvenIterator();
	}

	interface DataStructureIterator extends java.util.Iterator<Integer> {

	}

	private class EvenIterator implements DataStructureIterator {
		private int nextIndex = 0;

		@Override
		public boolean hasNext() {
			return (nextIndex <= SIZE - 1);
		}

		@Override
		public Integer next() {
			Integer retValue = Integer.valueOf(arrayOfInts[nextIndex]);
			nextIndex += 2;
			return retValue;
		}

	}
}
