	//Given the list below, please find the sorted unique values, using the set interface
	//(‘A’,’F’,’A’,’D’, ‘F’,’C’, ‘B’)

	package homework7;

	import java.util.HashSet;
import java.util.SortedSet;
	import java.util.TreeSet;

	public class Question1 {
	
	public static void main(String[] args) {
		SortedSet<Character>AZ = new TreeSet<>();
			
			AZ.add('A');
			AZ.add('F');
			AZ.add('A');
			AZ.add('D');
			AZ.add('F');
			AZ.add('C');
			AZ.add('B');
			
			System.out.println(AZ);
	}

}
