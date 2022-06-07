package pkg;

public class CVMath {		
	public static int findMid(int one, int two, int three)
	{
		return (one + two + three - Math.min(one,Math.min(two,three)) - Math.max(one,Math.max(two,three)));
	}
	
	public static int[] specialSquare(int n) {
		int[] special = new int[n];
		int sum = 0;
		int amog = 0;
		int os = 2;

		for(int c = 0; c<special.length; os++){
			sum = 0;
			amog = os * os;
			
			for(int c2 = 1; sum<amog; c2++){
				sum = sum + c2;
			}

			if(sum==amog){
				special[c]=amog;
				c++;
			}
		}

		return special;

	}
}
