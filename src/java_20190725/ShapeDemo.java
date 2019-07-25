package java_20190725;

public class ShapeDemo { //추상클래스의 다형성
	public static void run(Shape s) {
		s.draw();
	}
	public static void main(String[] args) {
		
		/*추상클래스는 객체를 생성할 수 없다.
		Shape s = new Shape();*/
		
		
		
		/*Rectangle r = new Rectangle();
		Shape s1 = new Rectangle();
		s1.draw();
		*/
		run(new Rectangle());
		
		
		/*Shape s2 = new Circle();
		s2.draw();
		*/
		run(new Circle());
	}
}
