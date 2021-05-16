	//Write a java program that has a Polygon class with a property Sides and color. 
	
	//	#2	Modify your code from question 1 by adding a constructor for the Polygon class and user should pass
			//	the values for Sides and color during the initialization.
	package homework5;

	public class Polygon {
		public String color;
		public int side;
		public Polygon(String color, int side)
		{
			super();
			this.color = color;
			this.side = side;
		}
		
		public String getColor() {
			return color;
		}
		public void setColor(String color) {
			this.color = color;
		}
		public int getSide() {
			return side;
		}
		public void setSide(int side) {
			this.side = side;
		}
		public String colorCode(String color) {
			System.out.println("color "+ color);
			return color;
			
		}
		public int sideCode(int side) {
			System.out.println("side "+ side);
			return side;
					}
}
