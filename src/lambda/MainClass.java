package lambda;

public class MainClass {

	public static void main(String[] args) {
		LambdaTest1 lt1 = (String s1,String s2,String s3) -> {System.out.println(s1 + "\n" + s2 + "\n" +s3);};
		lt1.method("Java", "Python", "C++");
		
		//x,y Data type equal
		LambdaTest2 lt2 = (x,y) -> {
			int res = x+y;
			return res;
			};
		System.out.println("lt2 res : "+ lt2.method(10, 20));
		
		
		lt2 = (x,y) -> {
			int res = x*y;
			return res;
			};
		System.out.println("lt2 res : "+ lt2.method(10, 20));
	}

}
