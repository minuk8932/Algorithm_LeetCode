public class Default {
	public static void main(String[] args) throws Exception {
		String digit = String.valueOf(78);
		int digitLen = digit.length();
		int sum = 0;
		
		while(true){	
			for(char a : digit.toCharArray()){
				sum += a - '0';
			}
			
			String tmp = String.valueOf(sum);
			
			digit = tmp;
			digitLen = tmp.length();
			
			if(digitLen <= 1){
				break;
			}
		}
		
		System.out.println(sum);
	}
}
