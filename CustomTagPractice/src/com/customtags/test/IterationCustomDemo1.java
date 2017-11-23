package com.customtags.test;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.IterationTag;
import javax.servlet.jsp.tagext.Tag;
public class IterationCustomDemo1 implements IterationTag 
{
	private int count;
	private PageContext pageContext;
	
	public int getCount()
	{
		return count;
	}
	public void setCount(int count) 
	{
		this.count = count;
	}
	public int doStartTag() throws JspException 
	{
	if(count>0)
	{
		return EVAL_BODY_INCLUDE;
	}
	else
	{
		return SKIP_BODY;
	}
	}
	public int doAfterBody() throws JspException 
	{
		if(--count>0)
		{
			return EVAL_BODY_AGAIN;
		}
		else
		{
			return SKIP_BODY;
		}
	}
	public int doEndTag() throws JspException 
	{
		return EVAL_PAGE;
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
