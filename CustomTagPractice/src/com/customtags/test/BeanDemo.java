package com.customtags.test;
public class BeanDemo 
{
	public BeanDemo()
	{
		System.out.println("This is inside constructor");
	}
  private String name;

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}
  
}
