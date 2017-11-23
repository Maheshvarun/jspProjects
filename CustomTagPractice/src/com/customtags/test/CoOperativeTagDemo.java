package com.customtags.test;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.Tag;
import javax.servlet.jsp.tagext.TagSupport;

public class CoOperativeTagDemo extends TagSupport 
{
  public int doStartTag()throws JspException
  {
	  System.out.println("doStart Method called");
	  int level=0;
	  Tag t=getParent();
	  while(t!=null)
	  {
		  level++;
		  t=getParent();
	  }
	  JspWriter out=pageContext.getOut();
	  try {
		  System.out.println("nested level is  :"+level);
		out.print("nested level is  :"+level);
	} catch (IOException e) 
	  {
		e.printStackTrace();
   	  }
	  return EVAL_BODY_INCLUDE;
  }
}
