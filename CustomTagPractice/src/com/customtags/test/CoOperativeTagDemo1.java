package com.customtags.test;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class CoOperativeTagDemo1 extends TagSupport 
{
   private ArrayList l;
   public int doStartTag()throws JspException
   {
	   l=new ArrayList();
	   return EVAL_BODY_INCLUDE;
   }
   public void addMenuItem(String s)
   {
	   l.add(s);
   }
    public int doEndTag()
   {
    	JspWriter out=pageContext.getOut();
    	try {
			out.println("<h1><br>Menu items are   "+l+"</h1>");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	return 0;
	   
   }
}
