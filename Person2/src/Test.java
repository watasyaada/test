
public class Test {

	public static void main(String[] args) {
		Person2 jiro = new Person2();
		jiro.name="木村次郎";
		jiro.age=180;
		System.out.println(jiro.name);
		System.out.println(jiro.age);
		
		Person2 aaa = new Person2();
		aaa.name="鈴木花子";
		aaa.age=20;
		aaa.phoneNumber=1111111110;
		aaa.address="aaaaaaethaaaaaa";
		
		System.out.println(aaa.name);
		System.out.println(aaa.age);
		System.out.println(aaa.phoneNumber);
		System.out.println(aaa.address);
		aaa.talk();
		aaa.walk();
		aaa.run();
		
		
		Robot aibo = new Robot();
		aibo.name="aibo";
		aibo.talk();
		aibo.walk();
		aibo.run();
		
		Robot asimo = new Robot();
		aibo.name="aisimo";
		aibo.talk();
		aibo.walk();
		aibo.run();
		
		Robot pepper = new Robot();
		aibo.name="pepper";
		aibo.talk();
		aibo.walk();
		aibo.run();
		
		Robot doraemon = new Robot();
		aibo.name="doraemon";
		aibo.talk();
		aibo.walk();
		aibo.run();

	}

}
