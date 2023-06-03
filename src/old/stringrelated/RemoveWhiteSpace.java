package old.stringrelated;

public class RemoveWhiteSpace {
	
	public static void main(String[] args) {
		

	//using Replace All
	String whitespace = "baba baba black sheep have you any wool";
	
	String nowhitespaces = whitespace.replaceAll("\\s", "");
	
	System.out.println(nowhitespaces);	
	
	StringBuffer nowhitespacesb = new StringBuffer();
	char[] whitespacechar = whitespace.toCharArray();
	
	for(int i = 0; i < whitespace.length(); i++){
		
		if((whitespacechar[i] != ' ') && (whitespacechar[i]!='\t')){
			
			nowhitespacesb.append(whitespacechar[i]);
			
			System.out.println(nowhitespacesb);
		}
	}
	
	}
}
