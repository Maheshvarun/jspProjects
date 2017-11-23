package com.customtags.test;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.DynamicAttributes;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class DynamicAttributesDemo extends SimpleTagSupport implements DynamicAttributes
{
   HashMap<String,String> m=new HashMap();
 
   public void setDynamicAttribute(String arg0, String name, Object val) throws JspException 
   {
		m.put(name,(String)val);
   }
   public void doTag()throws JspException,IOException
   {
	   getJspBody().getJspContext().getOut().println("<h1>"+m+"</h1>");
	   getJspContext().getOut().println("<h1>"+m+"</h1>");
	   
   }
}
