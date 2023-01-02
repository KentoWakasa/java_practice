package classMethod.human;

public class ClassMethod04 {
	public static void main(String[] args) {
		Human04 yamada = new Human04("山田");
		
		Human04.staticMethodprint();
		
		System.out.println(Human04.GREETING);
		
		yamada.instancemethodprint();
	}
}
