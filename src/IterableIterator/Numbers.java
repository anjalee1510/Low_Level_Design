package IterableIterator;

import java.util.Iterator;
import java.util.List;

public class Numbers implements Iterable<Integer> {
	List<Integer> list;

	@Override
	public Iterator<Integer> iterator() {
		// TODO Auto-generated method stub
		return new RandomIterator(this);
	}
}
