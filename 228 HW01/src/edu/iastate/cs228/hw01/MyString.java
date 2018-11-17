package edu.iastate.cs228.hw01;

/**
 * @author = Sam Shifflett
 *
 */
public class MyString
{
	private char[] chars;

	public MyString(char[] chars)
	{
		if(chars == null || chars.length == 0) throw new IllegalArgumentException();
		
		//TODO
		this.chars = chars;
	}

	//https://docs.oracle.com/javase/8/docs/api/java/lang/String.html#length--
	public int length()
	{
		//TODO
		int count = 0;
		
		for(int i = 0; i < chars.length;i++)
		{
			count++;
		}
		return count;
	}
	
	//https://docs.oracle.com/javase/8/docs/api/java/lang/String.html#charAt-int-
	public char charAt(int index)
	{
		//TODO
		return chars[index];
	}

	// https://docs.oracle.com/javase/8/docs/api/java/lang/String.html#substring-int-int-
	public MyString substring(int begin, int end)
	{
		//TODO
		char[] charsTemp = new char[end - begin];
		int j = 0;
		
		for(int i = begin; i < end; i++)
		{
			charsTemp[j] = chars[i];
			j++;
		}
		return new MyString(charsTemp);
	}

	//It is ok to use
	//https://docs.oracle.com/javase/8/docs/api/java/lang/Character.html#toLowerCase-char-
	public MyString toLowerCase()
	{
		//TODO
		char[] charsTemp = new char[chars.length];
		int j = 0;
		
		for(int i = 0; i < chars.length; i++)
		{
			charsTemp[j] = Character.toLowerCase(chars[i]);
			j++;
		}
		return new MyString(charsTemp);
	}

	
	//You can assume only positive values.
	//https://docs.oracle.com/javase/8/docs/api/java/lang/String.html#valueOf-int-
	public static MyString valueOf(int i)
	{
		//TODO
		int count = 0; 
		int num = i;
		int rem;
		char[] tempChars;

        while(num != 0)
        {
            // num = num/10
            num /= 10;
            ++count;
        }
        
        tempChars = new char[count];
        
        if(i > 10)
        {
        	while(i > 0)
        	{
        		rem = i % 10;
            	i /= 10;
            	tempChars[count - 1] = (char)(rem + '0');
            	count--;
        	}
        }
        else
        {
        	tempChars = new char[0];
        	rem = i % 10;
        	i /= 10;
        	tempChars[0] = (char)rem;
        }
        
        return new MyString(tempChars);
	}

	public char[] toCharArray()
	{
		return chars;
	}
}