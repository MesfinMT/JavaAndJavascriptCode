import java.math.BigInteger;
import java.util.Arrays;

public class Launcher {
	public static void main(String[] args) {
		
		long[] las= {1213200012171979L,54544666,95,1213141516171819L,120520,231};

		int[][] lcmInput= {{5, 4, 6, 46, 54, 12, 13, 17},{46, 54, 466, 544},{1, 2, 3, 4, 5, 6, 7, 8, 9, 10},{13, 6, 17, 18, 19, 20, 37}};
		
		System.out.println("-------------------------------------------------------------------------");
		System.out.println("Least Common Multiple (LCM)");
		System.out.println("-------------------------------------------------------------------------");

		for(int i=0;i<lcmInput.length;i++) {
			System.out.println(leastCommonMultiple(lcmInput[i]));
		}
		
		System.out.println("-------------------------------------------------------------------------");
		System.out.println("lookAndSay");
		System.out.println("-------------------------------------------------------------------------");
		
		for(int i=0;i<las.length;i++) {
			System.out.println(lookAndSay(las[i]));			
		}
	}
	private static BigInteger lookAndSay(long input) {
		StringBuilder lasStringBuilder=new StringBuilder();
		String s=String.valueOf(input);
		BigInteger x = new BigInteger("-1");
		if(s.length()%2!=0) {
			return x;
		}else {
			for(int i=0;i<s.length();i++) {
				
				for(int j=0;j<Character.getNumericValue(s.charAt(i));j++) {
					lasStringBuilder.append(s.charAt(i+1));
				}
				i++;
			}
			String result=lasStringBuilder.toString();
			return new BigInteger(result);
		}
	}
	
	private static int leastCommonMultiple(int[] lcmOfArray) {
		Arrays.sort(lcmOfArray);
	       int count=1;
	       int lmc=lcmOfArray[lcmOfArray.length-1];
	 while (count<lcmOfArray.length) {
		 count=1;
	    for (int i = 0; i < lcmOfArray.length; i++) {
	    	if(lmc%lcmOfArray[i]!=0) {
	    		lmc+=lcmOfArray[lcmOfArray.length-1];
	    		break;
		    }else {
	    		count++;
		    }	    	
	    }
  }
		return lmc;
	}
}
