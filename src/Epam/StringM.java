package Epam;

public class StringM {
	String Epam1(String s)
	{
		@SuppressWarnings("unused")
		   int len;
	      len = s.length();
	      String s2="";
	      String s1 ="";
	      s1 = s.substring(0,2);
	      s2 = s.substring(2,len);
	      if(s1.contains("A"))
	      s1 = s1.replace("A","");
	      return s1+s2;
		
	}

}
