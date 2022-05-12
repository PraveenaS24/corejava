package com.chainsys.Collecions;
import java.util.ArrayDeque;
import java.util.Iterator;
public class ArrayDequeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    ArrayDeque<String>arraydeque=new ArrayDeque<String>();
    //use an ArrayDeque like a stack
    arraydeque.push("A");
    arraydeque.push("B");
    arraydeque.push("X");
    arraydeque.push("Z");
    arraydeque.push("D");
    arraydeque.push("X");//duplicate value
    arraydeque.push("Z");//duplicate value
    arraydeque.push("E");
    arraydeque.push("P");
    //System.out.println("Before popping the stack:"+arraydeque.size());
    //while(arraydeque.peek() !=null)
    	//System.out.println(arraydeque.pop()+" ");
    //System.out.println("After popping the stack:"+arraydeque.size());
	 Iterator<String> iterator=arraydeque.iterator();
	 while(iterator.hasNext())
	 {
		 System.out.println("\t"+iterator.next());
	 }
	 System.out.println("descending");
	Iterator<String> striterator=arraydeque.descendingIterator();
	while(striterator.hasNext())
	{
		System.out.println("\t"+striterator.next());
	}
	arraydeque.addFirst("B");
	arraydeque.addLast("I");
	iterator=arraydeque.iterator();
	while(iterator.hasNext())
	{
		System.out.println("\t"+iterator.next());
	  }
	  //---
	//pollFirst
	//Retrieves and removes the first element of this deque, or
	//returns null if the deque is empty
	System.out.println("************pollFirst:"+arraydeque.pollFirst());
	System.out.println(arraydeque);
	System.out.println("************pollLast:"+arraydeque.pollLast());
	System.out.println(arraydeque);
	//---
	//removeFirst
	//retrieve and remove the first element of this deque
	//this method differs from pollfirst only in that it throws an exception
	//if this deque is empty
	System.out.println("************removeFirst:"+arraydeque.removeFirst());
	System.out.println(arraydeque);
	System.out.println("************removeLast:"+arraydeque.removeLast());
	System.out.println(arraydeque);
	//---
	System.out.println("removeFirstOccurence: X"+arraydeque.removeFirst());
	System.out.println(arraydeque);
	System.out.println("removeFirstOccurence: X"+arraydeque.removeFirst());
	System.out.println(arraydeque);
	} 
  }
	