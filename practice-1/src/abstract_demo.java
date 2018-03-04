abstract class car{
	abstract void turnon();
	abstract void start();
	abstract void reach();
	abstract void turnoff();
	
}
class car1 extends car{
	void turnon(){
		System.out.println("car1 engine started");
	}
	void start(){
		System.out.println("car1 started");
	}
	void reach(){
		System.out.println("car1 reached");
	}
	void turnoff(){
		System.out.println("engine1 stopped");
	}
}
class car2 extends car{
	void turnon(){
		System.out.println("car2 engine started");
	}
	void start(){
		System.out.println("car2 started");
}
	void reach(){
		System.out.println("car2 stopped");
	}
	void turnoff(){
		System.out.println("engine2 stopped");
	}
}
class abstract_demo{
public static void main(String args[])
{	
	int i =1;
	car car;
	
	switch(i)
	{
	case 0:
		car = new car1();
		break;
	default:
		car = new car2();
		break;
	}
		
	car.turnon();
	car.start();
	car.reach();
	car.turnoff();
			}
}
