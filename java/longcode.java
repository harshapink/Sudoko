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
		  display(p);
		}
	}
	static void searchEndswith(Person p,String s)
	{
		if(p.getname().endsWith(s))
		{
		display(p);
		}
	}
	static void contain(Person p,String s)
	{
		if(p.getname().equals(s))
		{
			display(p);
		}
	}
	static void containage(Person p,int a)
	{
		if(p.getage()< a)
		{
			display(p);
		}
	}
	static void search(Person p,int n)
	{
		switch(n)
		{
			case 1:searchBeginswith(p,"aji");break;
			case 2:searchEndswith(p,"sha");break;
			case 3:contain(p,"harshavarthini");break;
			case 4:containage(p,25);break;
		}
		
	}
	
 public static void main(String args[])
  {
  HashMap<Integer,Person> map=new HashMap<Integer,Person>();
 // s.forEach((x)->System.out.println(x));
String name="",mname="",dept="";
int age=0,id=0,n=0,n1=0;
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
	 System.out.println("1.Display");
	 System.out.println("2.Search");
	  n=s.nextInt();
	 switch(n)
	 {
		 case 1: display(pp.getValue());
		          break;
		 case 2: System.out.println("1.BeginsWith");
		         System.out.println("2.EndsWith");
		         System.out.println("3.contains");
		         System.out.println("4.AgeLesser");
				 n1=s.nextInt();
		        search(pp.getValue(),n1);break;
	 }
  
  }
  }
}
 
