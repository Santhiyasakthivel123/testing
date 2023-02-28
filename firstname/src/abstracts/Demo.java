package abstracts;
abstract class signal{
	abstract void colour();
}
class go extends signal{
	void green() {
		System.out.println("you can go now");
	}
}
class stop extends signal{
	void red() {
		System.out.println("stop the vehicle");
	}
}
class slow extends signal{
	void yellow() {
		System.out.print("go slow");
	}
}

public class Demo {
	

	public static void main(String[] args) {
		go ab=new go();
		ab.green();
		stop a=new stop();
		a.red();
		slow b=new slow();
		b.yellow();
		
	}

}
