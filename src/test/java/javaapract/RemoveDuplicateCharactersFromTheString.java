package javaapract;

public class RemoveDuplicateCharactersFromTheString 
{
	public static void main(String[] args) 
	{
		String s="Moonday";

		for (int i = 0; i < s.length(); i++) 
		{
			int count =0;
			for (int j = i+1; j < s.length(); j++)
			{
				if (s.charAt(i)==s.charAt(j))
				{
					count++;
				}	
			}

			if(count<=0)
			{ 
				System.out.println(s.charAt(i));	
			}
		}

	}
}
