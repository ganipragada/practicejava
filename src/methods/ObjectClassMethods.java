package methods;

public class ObjectClassMethods {
	String name;
	int i;

	public ObjectClassMethods(String name, int i) {
		this.name = name;
		this.i = i;
	}

	public String toString() {
		return name;
	}

	public int hashcode() {
		return i;
	}

	public static void main(String[] args) {

		ObjectClassMethods ocm = new ObjectClassMethods("gani", 1010);
		System.out.println(ocm.toString());
		System.out.println(ocm.hashCode());
		ObjectClassMethods ocm1 = new ObjectClassMethods("raja", 2020);
		System.out.println(ocm1.toString());
		System.out.println(ocm1.hashCode());
		System.out.println(ocm.equals(ocm1));
		ObjectClassMethods ocm3 = ocm1;
		System.out.println(ocm3.equals(ocm1));
		
	}

}
