package basicPrograms;

public class SetterAndGetterMethods {

	private String name ;
	private String village;
	private int age;
	private long phno;
	public String getName() {
		if (name== "ganendra") {
			System.out.println("your name "+name+" is curret please go hed");
			return name;
		} else {
			System.out.println("your name "+name+" is nor curret please chek once");
			return name;
		}
			
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getVillage() {
		if (village== "donkada") {
			System.out.println("your name "+village+" is curret please go hed");
			return village;
		} else {
			System.out.println("your name "+village+" is nor curret please chek once");
			return village;
		}
	}
	public void setVillage(String village) {
		this.village = village;
	}
	public int getAge() {
		if (age== 29) {
			System.out.println("your name "+age+" is curret please go hed");
			return age;
		} else {
			System.out.println("your name "+age+" is nor curret please chek once");
			return age;
		}
	}
	public void setAge(int age) {
		this.age = age;
	}
	public long getPhno() {
		if (phno== 798197334) {
			System.out.println("your name "+phno+" is curret please go hed");
			return phno;
		} else {
			System.out.println("your name "+phno+" is nor curret please chek once");
			return phno;
		}
	}
	public void setPhno(long phno) {
		this.phno = phno;
	}
	
	
}
