package example;

import java.io.File;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GoodWinRedirect
{
    public static void main(String args[]) throws IOException
    {
	    String regex = ".*?\\s*(\\d*).*?(NO1(\\d{4})(\\d{2})\\.SOD)";
	    Pattern p = Pattern.compile(regex,Pattern.CASE_INSENSITIVE);
	    Matcher m = null;
	    
	    File[] listOfFiles = new File("/Users/yue.lian/Documents/SGW/tcatfile").listFiles();
	
	        for (File file : listOfFiles) {
	          m = p.matcher(file.getName());
	          if (file.isFile()) {
	        	  System.out.println("File " + file.getName());
	        	  if(m.matches()){	        		 
		              System.out.println("Group 0:"+ m.group(0));
		              System.out.println("Group 1:"+m.group(1)); 
		              System.out.println("Group 2:"+m.group(2));
	        	  }	            
	          } 
	        }
    	  
    	   // TODO Auto-generated method stub  
//    	   String str = "Hello,World! in Java.";  
//    	   Pattern pattern = Pattern.compile("^.*W(or)(ld!)");  
//    	   Matcher matcher = pattern.matcher(str);  
//    	   while(matcher.find()){  
//    	    System.out.println("Group 0:"+matcher.group(0));//得到第0组——整个匹配  
//    	    System.out.println("Group 1:"+matcher.group(1));//得到第一组匹配——与(or)匹配的  
//    	    System.out.println("Group 2:"+matcher.group(2));//得到第二组匹配——与(ld!)匹配的，组也就是子表达式  
//    	    System.out.println("Start 0:"+matcher.start(0)+" End 0:"+matcher.end(0));//总匹配的索引  
//    	    System.out.println("Start 1:"+matcher.start(1)+" End 1:"+matcher.end(1));//第一组匹配的索引  
//    	    System.out.println("Start 2:"+matcher.start(2)+" End 2:"+matcher.end(2));//第二组匹配的索引  
//    	    System.out.println(str.substring(matcher.start(0),matcher.end(1)));//从总匹配开始索引到第1组匹配的结束索引之间子串——Wor  
//    	   }  
    	}  
    }

