package string_handle;

public class RomanToInteger_13 {
	public int romanToInt(String s) {
		char[] roms = s.toCharArray();
		int[] nums = new int[roms.length];
		int[] cals = {1, 5, 10, 50, 100, 500, 1000};
        int res = 0;
		
		String words = "IVXLCDM";
		int leng = words.length();
		
		for(int i = 0; i < roms.length; i++){
			for(int j = 0; j < leng; j++){
				if(roms[i] == words.charAt(j)){
					nums[i] = cals[j];
				}
			}
		}
		
		for(int i=0;i<nums.length-1;i++){
        	if(nums[i]<nums[i+1]){
            	res-=nums[i];
            }
            else{
            	res+=nums[i];
            }
        }
        
        return res+nums[nums.length-1];
	}
}
