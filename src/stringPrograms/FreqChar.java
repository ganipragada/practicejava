package stringPrograms;

public class FreqChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "i am a java developer";
		System.out.println(s.length());
		String s1 = s.toUpperCase();
		System.out.println(s1);
		char[] ch = s1.toCharArray();
		int larg =0;
		char l =' ';
		for (char i = 'A'; i <= 'Z'; i++) {
			int count =0;
			
			for (int j = 0; j < ch.length; j++) {
				if (i==ch[j]) {
					count++;	
				}
			}
			if (larg<count) {
				larg=count;
				l=i;
			}
			if (count > 0) {
				System.out.println(i+" = "+count);
				
			}
		}
		System.out.println("the largest counting char is '"+l+"' = "+larg+" Times repeat");
	}

}
