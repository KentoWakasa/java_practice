package extend.human;

public class Extend01 {
	public static void main(String[] args) {
		Human sugimoto = new Human("杉本",16);
		System.out.println("Humanクラスのメソッド:名前は、" + sugimoto.getName());
		
		Student sato = new Student("佐藤", 17, 70);
        System.out.println("Humanクラスのメソッド：名前は、" + sato.getName());
        System.out.println("Studentクラスのメソッド：プロフィールを紹介します。" + sato.getstudentprofile());

	    Human human = new Employee("田中", 28, "システム部");
        System.out.println("Humanクラスのメソッド：名前は、" + human.getName());

	    Employee tanaka = (Employee) human;
        System.out.println("Employeeクラスのメソッド：プロフィールを紹介します。" + tanaka.getEmployeeProfile());
        
        Extend01.printName(sugimoto);
        Extend01.printName(sato);
        Extend01.printName(tanaka);
	}
	
	public static void printName(Human human) {
		System.out.println("Humanクラスのメソッド:名前は、" + human.getName());
	}
}
