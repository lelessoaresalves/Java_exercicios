public class ex_020M
{
	public int getDecimal(String str)
	{
		int result = -1;
		int len = str.length();
		if(len <= 9)
		{
			int[] nu = new int[9];
			int decimal = 0;
			String c = "";
			
			for (int j = 0; j < len; j++)
			{
				c = str.substring(j,j+1);
				
				nu[(len-1)-j] = Integer.parseInt(c);		
			}
			
			decimal = 		(nu[8] *  256 ) 
						+ 	(nu[7] *  128 ) 
						+ 	(nu[6] *  64  ) 
						+ 	(nu[5] *  32  ) 
						+ 	(nu[4] *  16  ) 
						+ 	(nu[3] *  8   ) 
						+ 	(nu[2] *  4   ) 
						+ 	(nu[1] *  2   ) 
						+ 	(nu[0] *  1   );
						
			result = decimal;			
		}
		
		return result;
	}
	
	public String getBin(int num)
	{
		String result = "";
		int[] nb = new int[9];
		int vaux, vb, i = 0;
		String c = "";
		
		vaux = num;
		
		while(true)
		{			
			vb = vaux%2;			
			
			vaux = vaux/2;
			
			nb [8-i] = vb;
			
			if (vaux == 0)
				break;
			i++;
		}
		
		for (i = 0; i < 9; i++)c += Integer.toString(nb[i]);
		
		result = c;
		
		return result;
	}	
	
	public String getHex(int num)
	{
		String result = "";
		char[] conjunto = new char[6];
		conjunto[0] = 'A'; conjunto[1] = 'B'; conjunto[2] = 'C';
		conjunto[3] = 'D'; conjunto[4] = 'E'; conjunto[5] = 'F';
		
		char[] nh = new char[9];
		int vaux, vh, i = 0;
		String c = "";
		
		vaux = num;
		
		while(true)
		{			
			vh = vaux%16;			
			
			vaux = vaux/16;
			
			nh [8-i] = vh > 9 ? conjunto[vh-10] : (char)(vh);
			
			if (vaux == 0)
				break;
			i++;
		}
		
		for (i = 0; i < 9; i++)c += (nh[i]);
		result = c;
		
		return result;
	}	
}