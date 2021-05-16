package Question8;

public class Question8 {

	public static void main(String[] args) {
		public class Student {
		      private Integer id;
		      private String name;
		  
		    // create constructor for reference
		    public Student(Integer id, String name){
		this.id = id;
		this.name = name;
		    }
		  
		    public Integer getId(){
		        return id;
		    }
		  
		    public String getName(){
		        return name;
		    }
		}
		 
		public class ListToMap {
		    
		    public static void main(String[] args){
		  
		        List<Student> students = new ArrayList<Student>();
		 
		        students.add(new Student(1, "Equar"));
		        students.add(new Student(2, "Amanuel"));
		        students.add(new Student(3, "Hawaz"));
		  
		        // create Map object
		  
		        // put every list element to the Map using the IDs as keys and the names as values

	}

}
