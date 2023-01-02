package classMethod.human;

public class Human04 {
	static public int humancount = 0;
	public String name;
	
	public static final String GREETING = "こんにちは";
	
	public Human04(String name) {
		this.name = name;
		
		Human04.humancount++;
	}
	
	static public void staticMethodprint() {
		System.out.println("人の数は" + Human04.humancount);
	}
	
	public void instancemethodprint() {
		System.out.println("名前は" + name);
	}
}
