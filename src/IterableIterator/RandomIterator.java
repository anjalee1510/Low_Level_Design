package IterableIterator;

import java.util.Iterator;

public class RandomIterator implements Iterator<Integer> {
	int index;
	Numbers numbers;
	RandomIterator(Numbers numbers){
		index=0;
		this.numbers=numbers;
	}
	//checks if there is any next element to be traversed
	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		while(index<numbers.list.size()) {
			if(numbers.list.get(index)%5==0) {
				return true;
			}
			index++;
		}
		return index!=numbers.list.size();
	}

	//returns the next element
	@Override
	public Integer next() {
		// TODO Auto-generated method stub
		return numbers.list.get(index++);
	}

}
