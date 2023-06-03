package old.stringrelated;

public class ReverseString {
	
	public static void ReverseStr(String inputStr){
		
		String[] words = inputStr.split(" ");
		
		String reverseStr = "";
		
		for(String c:words){
				System.out.println(c);
		}
		
		for(int i = 0; i < words.length; i++){
			
			String word = words[i];
			String reversedWord = "";
				
			for( int j = word.length()-1; j>=0; j--){
				reversedWord = reversedWord + word.charAt(j);
				
			}
			System.out.println(reversedWord);
			reverseStr = reverseStr + reversedWord + " ";
			System.out.println(reverseStr);
		}
		
		 
				
		
		
	}
	
	
	
	
	public static void main(String[] args) {
		
		ReverseStr("Reverse me");
		
		
	}

}
