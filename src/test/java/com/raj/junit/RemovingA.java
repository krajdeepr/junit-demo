package com.raj.junit;

public class RemovingA {
public String eliminate(String string) {
		if(string=="")
		  return "";
		char firstChar=string.charAt(0);
		if(string.length()<2)
		{
			if(firstChar=='A')
			  return "";
			if(firstChar!='A')
			  return string;
		}
		char secondChar=string.charAt(1);
		if(firstChar=='A'&&secondChar!='A')
		  return string.substring(1);
		else if(firstChar!='A'&&secondChar=='A')
		  return firstChar+string.substring(2);
		else if(firstChar=='A'&&secondChar=='A')
		  return string.substring(2);
		else
		  return string;
	}
}
