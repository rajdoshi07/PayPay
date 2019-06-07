package com.paypay.test.immutable;

import java.util.LinkedList;
import java.util.List;
import com.paypay.test.interfaces.Queue;

public class ImmutableQueue<T> implements Queue<T> {

	
	private final List<T> defaultQueueItems;
	
	
    public ImmutableQueue(List<T> defaultQueueItems)
    {
    	this.defaultQueueItems = new LinkedList<T>(defaultQueueItems);
    }
    
    public ImmutableQueue()
    {
    	this.defaultQueueItems = new LinkedList<T>();
    }
        
	@Override
	public Queue<T> enQueue(T t) {
		List<T> elementList = new LinkedList<T>(defaultQueueItems);
		elementList.add(t);
		return new ImmutableQueue<>(elementList);
	}
	
	@Override
	public Queue<T> deQueue() {
		List<T> elementList = new LinkedList<T>(defaultQueueItems);
		elementList.remove(0);
		return new ImmutableQueue<>(elementList);
	}

	@Override
	public T head() {
			return this.defaultQueueItems.get(0);
	}

	@Override
	public boolean isEmpty() {
		return this.defaultQueueItems.isEmpty();
	}


	@Override
	public String toString() {
		return "ImmutableQueue [items =" + defaultQueueItems.toString() + "]";
	}

	
}
