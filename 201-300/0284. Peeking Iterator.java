// Java Iterator interface reference:
// https://docs.oracle.com/javase/8/docs/api/java/util/Iterator.html

class PeekingIterator implements Iterator<Integer> {
    
    private List<Integer> list;
    
	public PeekingIterator(Iterator<Integer> iterator) {
	    // initialize any member here.
        list = new ArrayList<>();
        
        while(iterator.hasNext()){
            list.add(iterator.next());
        }
	    
	}
	
    // Returns the next element in the iteration without advancing the iterator.
	public Integer peek() {
        return list.get(0);
        
	}
	
	// hasNext() and next() should behave the same as in the Iterator interface.
	// Override them if needed.
	@Override
	public Integer next() {
	    Integer peekVal = list.get(0);
        list.remove(0);
        return peekVal;
	}
	
	@Override
	public boolean hasNext() {
	    return !list.isEmpty();
	}
}