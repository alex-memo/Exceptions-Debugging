public class DebuggingExercise3 {
	private static int var1;
	private static MyObject obj1;
	
	private static void method1 (int var1) {
		var1 = 10;
	}
	
	private static void method2 (MyObject obj2) {
		MyObject obj1 = new MyObject("joe");
	
		if (obj1 == obj2)//false as it is not pointing to the same memory space, solve this by doing if(obj1.getName().equals(obj2getName()){var1=20;}else var1=-20
			var1 = 20;
		else var1 = -20;
		
		obj2 = new MyObject("john");
	}
	
	public static void main(String[] args) {
		var1 = 2;
		obj1 = new MyObject("joe");

		for (int i = 1; i < 2; ++i) {
			int var1 = i;
		}
		
		//i = 8;//the variable its outside the method
		
		method2(obj1);
		
		// What are the values of var1 and obj1.name?
		//var1=-20& obj1=joe
		method1(var1);
			
		// What are the values of var1 and obj1.name? 
		//var1=-20& obj1=joe
	}
}