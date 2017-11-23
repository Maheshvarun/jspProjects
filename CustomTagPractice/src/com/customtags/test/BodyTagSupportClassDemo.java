package com.customtags.test;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.BodyTagSupport;

public class BodyTagSupportClassDemo extends BodyTagSupport 
{
	private static final long serialVersionUID = 1L;

    public int doAfterBody()throws JspException
     {
	  try
	  {
		  String str=bodyContent.getString();
		  str=str.toUpperCase();
		  JspWriter out1=bodyContent.getEnclosingWriter();
		  JspWriter out2= getPreviousOut();
		  JspWriter out= pageContext.getOut();
		  System.out.println(out);
		  System.out.println(out1);
		  System.out.println(out2);
		  System.out.println("This is from pageContext out  "+out.hashCode()+" and class name is "+out.getClass().getName());
		  System.out.println("This is from BodyContent class method  "+out1.hashCode()+" and class name is "+out1.getClass().getName());
		  System.out.println("This is from BodyTagSupport class method  "+out2.hashCode()+" and class name is "+out2.getClass().getName());
		  //System.out.println(out2);
		  out1.println(str+" bodycontent");
		  //out2.println(str+" Previous method");
		  out.println("pagecontext");
	  }
	  catch(Exception e)
	  {
		e.printStackTrace();  
	  }
	  return SKIP_BODY;
  } 
}
