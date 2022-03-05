package InnerClass_AnonymousClass;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class S {
	class s implements Consumer<Integer>{  //Inner Class
		public void accept(Integer i) {
			System.out.println(i);
		}
		
	}

	public static void main(String[] args) {
		List<Integer> values =Arrays.asList(1,2,3,4,5);
		S obj =new S(); 
		S.s s1 =obj.new s();
		
		Consumer<Integer> ci = new Consumer<Integer>() {//this is anonymous class 
			public void accept(Integer i) {
				System.out.println(i);
		}			
	};
	
	// Using For Each
	System.out.println("This is Anonymous Class result :");
	values.forEach(ci);	
	System.out.println(" This is an Inner Class result :");
	values.forEach(s1);	
	
	}


}