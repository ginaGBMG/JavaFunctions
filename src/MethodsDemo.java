
public class MethodsDemo {
public static void main(String[] args) { //nombre del metodo - SUMA
		int c = suma(159, 753);//valores a sumar
		System.out.println(c);
		c= suma(159,753,468);
		System.out.println(c);
	}//main
	
	//privado el metodo
	//private static int suma(int a, int b) {
	public static int suma(int a, int b) {
		//static - forma de llamar un metodo
		return (a+b);
		
		public static int suma(int a, int b, int c) {
			return (a+b+c);	
	}//suma
}//class MethodsDemo
