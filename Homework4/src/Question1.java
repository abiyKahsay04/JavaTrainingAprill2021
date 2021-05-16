
public class Question1 {

	public static void main(String[] args) {
		int [] num = {1,4,6,7,8,9};
		double a=0;
		
		for(int i=0; i<num.length; i++){
			
			a=a+num[i];
			
		}
		double avg=a/num.length;
		System.out.println(avg);
	}

}
