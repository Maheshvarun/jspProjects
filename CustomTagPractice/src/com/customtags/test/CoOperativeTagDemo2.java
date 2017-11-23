package com.customtags.test;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.TagSupport;

public class CoOperativeTagDemo2 extends TagSupport 
{
  private String item;
  
  
public void setItem(String item) {
	this.item = item;
}
public int doStartTag()throws JspException
  {
	CoOperativeTagDemo1 parent=(CoOperativeTagDemo1)getParent();
	parent.addMenuItem(item);
	  return SKIP_BODY;
  }
}
