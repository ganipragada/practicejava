package methods;

public class PassingAnArray {
	String name;
	int age;
	float per;

	public PassingAnArray(String name, int age, float per) {
		this.name = name;
		this.age = age;
		this.per = per;
	}
	public static void main(String[] args) {
		PassingAnArray par[] = new PassingAnArray[3];
		par[0] = new PassingAnArray("gani", 29,60.5f);
		par[1] = new PassingAnArray("raja", 25, 76.9f);
		par[2] = new PassingAnArray("suresh", 27, 88.9f);
		details(par);
	}
	
	public static void details(PassingAnArray array[]) {
		System.out.println("Name age percentage");
		for (PassingAnArray ar : array) {
			System.out.println(ar.name+" "+ar.age+" "+ ar.per);
			
		}
	}
}
