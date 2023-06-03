package old.stringrelated;

public class StringPractice {
	public static void main(String[] args) {
		
		String s0 = new String ("anand");
		String s1 = "anand";
		String s2 = new String("anand");
		StringBuffer sb1 = new StringBuffer("mannu");
		StringBuffer sb2 = sb1.append("pagal");
		StringBuffer sb3 = new StringBuffer("mannu");
		
		char[] charArray  = s1.toCharArray();
		for(char ca : charArray){
			System.out.println(ca + " " );
		}
		
	
			
		System.out.println(s0==s1);
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		System.out.println(sb1==sb2);
		System.out.println(sb1.equals(sb2));
		System.out.println(sb1==sb3);
		System.out.println(sb1.equals(sb3));
		
		long begintime = System.currentTimeMillis();
		String s = "apple";
		for (long i = 0; i <= 10; i++){
			s = s + "i";
			
		}
		long endtime = System.currentTimeMillis();
		System.out.println("total time taken by String = " + (endtime - begintime));
		
	}

}
