package com.raj.junit;

public class RemovingA {

	public String eliminate(String string) {
		// TODO Auto-generated method stub
		if(string=="")
		{
			return "";
		}
		char firstChar=string.charAt(0);
		if(string.length()<2)
		{
			if(firstChar=='A')
			{
			return "";
			}
			if(firstChar=='B')
			{
				return string;
			}
		}
		
		char secondChar=string.charAt(1);
		String sub="";
		if(firstChar=='A' && secondChar!='A')
		{ 
			sub=string.substring(1);
		}
		else if(firstChar!='A' && secondChar=='A')
			{
			sub=firstChar+string.substring(2);
			}
		else if(firstChar=='A' && secondChar=='A')
		{
			sub=string.substring(2);
		}
		else
		{
			sub=string;
		}
		return sub;
	}

}
