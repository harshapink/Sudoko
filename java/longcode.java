import java.util.*;
class Person
{
	String name="",mname="",dept="";
	int age=0,id=0;
	void setname(String name)
	{
		this.name=name;
	}
	String  getname()
	{
		return this.name;
    }
	void setage(int age)
	{
		this.age=age;
	}
	int  getage()
	{
		return this.age;
    }
	void setid(int id)
	{
		this.id=id;
	}
	int  getid()
	{
		return this.id;
    }
	void setdept(String dept)
	{
		this.dept=dept;
	}
	String  getdept()
	{
		return this.dept;
    }
	void setmname(String mname)
	{
		this.mname=mname;
	}
	String  getmname()
	{
		return this.mname;
    }
	
}
class Manager{
	
}
class Emp1{
	static void display(Person p)
	{
		System.out.println(p.getname()+""+p.getage()+""+p.getmname()+""+p.getdept());
		
	}
	static void searchBeginswith(Person p,String s)
	{
		if(p.getname().startsWith(s))
		{
		System.out.println(p.getname()+""+p.getage()+""+p.getmname()+""+p.getdept());
		}
	}
	static void searchEndswith(Person p,String s)
	{
		if(p.getname().endsWith(s))
		{
		System.out.println(p.getname()+""+p.getage()+""+p.getmname()+""+p.getdept());
		}
	}
	
 public static void main(String args[])
  {
  HashMap<Integer,Person> map=new HashMap<Integer,Person>();
 // s.forEach((x)->System.out.println(x));
String name="",mname="",dept="";
int age=0,id=0;
Scanner s=new Scanner(System.in);
 for(int i=0;i<2;i++)
 {
	  Person p1=new Person();
	  id=s.nextInt();
	  name=s.next();
	  age=s.nextInt();
	  mname=s.next();
	  dept=s.next();
	  p1.setname(name);
	  p1.setage(age);
	  p1.setmname(mname);
	  p1.setdept(dept);
	  p1.setid(id);
	  map.put(p1.getid(),p1);
 }

  for(Map.Entry<Integer,Person> pp:map.entrySet())
  {
	  //System.out.print(pp.getKey());
	 // display(pp.getValue());
  searchBeginswith(pp.getValue(),"aji");
  searchEndswith(pp.getValue(),"sha");
  }
  
  //Person p2=(Person)map.get(1);
  //System.out.println(p2.getname());
  /*ArrayList<Object> s=new ArrayList<Object>();
  s.add(p1);
  for(Object oo: s)
  {
	  Person dp=(Person)oo;
	  System.out.println(dp.getname());
  }*/
  }
}
 
