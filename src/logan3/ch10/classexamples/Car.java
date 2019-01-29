package logan3.ch10.classexamples;

public class Car
{

	String color = "blue";
	int year = 2019;
	//Engine myengine = new Engine();
	
	
	
	void start(){
	     
		System.out.println("your car has started");
	   }
	void stop(){
		
		System.out.println("your car has stopped");
	   }
	
	
	public static void main(String[] args) {
		Car car1 = new Car();
		Car car2 = new Car();
		car1.color = null;
		
		System.out.println(car1.color);
		System.out.println(car2.color);
		car1.start();
		car2.start();
		car1.stop();
		car2.stop();
	}
}
