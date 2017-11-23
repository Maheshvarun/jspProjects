package com.customtags.test;

import java.io.IOException;

import javax.servlet.jsp.JspContext;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.SkipPageException;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class SimpleTagDemo extends SimpleTagSupport 
{
	private JspContext jspContext;
	
	 
   public void doTag()throws JspException,IOException
   {
	   JspWriter out=getJspContext().getOut();
	   System.out.println(getJspContext().hashCode());
	   System.out.println(jspContext.hashCode());
	   out.println("<h1>this is from simple tag handler</h1>");
	   getJspBody().invoke(null);
	   //throw new SkipPageException();
   }


/* (non-Javadoc)
 * @see javax.servlet.jsp.tagext.SimpleTagSupport#setJspContext(javax.servlet.jsp.JspContext)
 */
@Override
public void setJspContext(JspContext jspContext) {
	// TODO Auto-generated method stub
	System.out.println("setJspContext method called");
	super.setJspContext(jspContext);
}
	
}
