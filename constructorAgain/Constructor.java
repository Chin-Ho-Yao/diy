package constructorAgain;

import javax.swing.JCheckBox;

import org.omg.PortableInterceptor.ServerRequestInfo;

class Some{
	Some(){
		System.out.println("呼叫some()");
	}
	Some(int i){
		System.out.println("呼叫some(int i)");
	}
}
class Other extends Some {
	Other(){
		super(10);
		System.out.println("呼叫Other()");
	}
}
public class Constructor {
	public static void main(String[] args) {
	Some s1 = new Other();
	Other o1 = new Other();
	}
}
