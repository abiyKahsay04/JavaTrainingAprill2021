	package homework5;
	
	public class ThreeDimentionalShape extends Polygon {
		public int height;

		public ThreeDimentionalShape(String color, int side, int height) {
			super(color, side);
			this.height = height;
		}
		public int height (int height) {
			System.out.println("height"+ height);
			return height;
						
		}
		
}
