package com.customtags.test;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.Tag;

public class CustomDemo implements Tag 
{
	private int number;
	public int getNumber() 
	{
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	private PageContext pageContext;
	public int doEndTag() throws JspException 
	{
		return EVAL_PAGE;
	}
	public int doStartTag() throws JspException 
	{
		try
		{
		JspWriter out=pageContext.getOut();
		out.println("the double of "+number  +"  is  "+(2*number));
		}
		catch(Exception e)
		{
			
		}
		return EVAL_BODY_INCLUDE;
	}
	public Tag getParent() 
	{
		return null;
	}
	public void release() 
	{
		
	}
	public void setPageContext(PageContext pageContext) 
	{
		this.pageContext=pageContext;
	}
	public void setParent(Tag arg0) 
	{
		
	}
}
