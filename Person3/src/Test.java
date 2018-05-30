
public class Test {
  public static void main(String[]args){
	  Person3 p = new Person3();
	  
	  Person3 taro = new Person3();
	  taro.name = "taro";
	  taro.age = 18;
	  System.out.println(taro.name);
	  System.out.println(taro.age);
	  
	  Person3 jiro = new Person3("jiro", 20);
	  System.out.println(jiro.name);
	  System.out.println(jiro.age);
	  
	  Person3 saburo = new Person3("saburo");
	  System.out.println(saburo.name);
	  System.out.println(saburo.age);
	  
	  Person3 aaa = new Person3(25);
	  System.out.println(aaa.name);
	  System.out.println(aaa.age);
	  
	  Person3 hanako = new Person3("hanako",17);
	  System.out.println(hanako.name);
	  System.out.println(hanako.age);
  }
}
