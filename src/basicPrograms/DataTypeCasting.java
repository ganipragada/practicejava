package basicPrograms;

public class DataTypeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//widening casting
     byte b=10;
     short s = b;
     int i= s;
     long l = i;
     float f = l;
     double d = f;
     System.out.println(d);
	//narrowing casting 
     long lo=87585787984735l;
     byte by = (byte) lo;
     System.out.println(by);
	
	}

}
