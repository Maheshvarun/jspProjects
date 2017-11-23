package com.customtags.test;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.TagSupport;

public class TagSupportClassDemo extends TagSupport 
{
   private  int count;

public int getCount() {
	return count;
}
public void setCount(int count) {
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
}
