	//Given the list below a.Try to remove the even elements using normal for loopb.
	//Remove even elements using iterators.List<Integer> myList = new ArrayList<>();
	
	package homework7;


import java.util.*;

public class Question3 {

	public static void main(String[] args) {
			
		List<Integer> myList = new ArrayList<>();
		
		myList.add(4);
		myList.add(1);
		myList.add(2);
		myList.add(5);
		myList.add(4);
		myList.add(5);
		
		for(int i = 0; i < myList.size() ; i++) {
			
			int evenNumber = myList.get(i)% 2;
			 
			if(evenNumber == 0) {
				myList.remove(i);
			}
		}
		System.out.println(myList);
		
		
		Iterator <Integer> i = myList.iterator();
		while(i.hasNext()) {
			if(i.next()%2==0) {
				i.remove();
			}
		}
		
		System.out.println(myList);
	}

}
