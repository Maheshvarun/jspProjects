package mypack;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
public class DataAcessDemo 
{
   public int limit;
   public int offse;
   public int getLimit() 
   {
     return limit;
   }
	public void setLimit(int limit) 
	
	{
		this.limit = limit;
		System.out.println("set limit"+limit);
	}
	public int getOffse() {
		return offse;
	}
	public void setOffse(int offse) {
		this.offse = offse;
		System.out.println("set offset"+offse);
	}
	 public Employee emp;
     public ResultSet rs=null;
     public ArrayList<Employee> al=null;
     
	public ArrayList<Employee> getAl() throws ClassNotFoundException, SQLException {
		System.out.println(limit);
		System.out.println(offse);
	 Connection con=utility.getConnection();
	 PreparedStatement pst=con.prepareStatement("SELECT * FROM pagenationdemo limit ?,?");//SELECT * FROM `table` LIMIT [row to start on], [how many to include] .
	 pst.setInt(1,limit);//select * from(select ename,esal,rno from(select ename,esal,rownum as rno from employee)where rno>(select count(*) from employee)-2)where rno<=(select count(*)from employee)
	 pst.setInt(2,offse);
	 al=new ArrayList<Employee>();
	 rs=pst.executeQuery();
	 while(rs.next())
	 {
		 System.out.println(rs.getRow());
		 emp=new Employee();
		 emp.setEname(rs.getString("ename"));
		 emp.setEaddr(rs.getString("eaddr"));
		 emp.setEtype(rs.getString("etype"));
		 emp.setEdomain(rs.getString("edomain"));
		 al.add(emp);
	 }
	 return al;
}
}
