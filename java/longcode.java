import java.util.*;
import java.io.*;

class A
{
  String name="",gender="";
  int age=0;
  void set(String name,String gender,int age)
  {
  this.name=name;
  this.gender=gender;
  this.age=age;
  }
  String getname()
  {
  return this.name;
  }
  String getgender()
  {
  return this.gender;
  }
  int getage()
  {
  return this.age;
  }
  
   public String toString() 
    { 
        return name + " "+gender+" " + age ; 
    }
  }
  
 
class Manager extends A
{
 int id;
 void setid(int id)
 {
	 this.id=id;
	 
 }
 int getid()
 {
	 return id;
 }

}

 class Emp extends A
 {
 int empid;
 void setempid(int empid)
 {
	 this.empid=empid;
 }
 int getempid()
 {
	 return empid;
 }
  
 }
 
 class Person
{
 static int id=1,empid=1;
 
 public static void main(String args[])
  { 
  int  i=1;
  HashMap<String,Integer> m = new HashMap<String,Integer>();
  HashMap<Integer,Object> e = new HashMap<Integer,Object>();
  Emp a=new Emp();
  a.set("harsha","female",21);
  a.setempid(empid++);
  e.put(a.getempid(),a);
  a.set("hemanth","male",21);
  a.setempid(empid++);
  e.put(a.getempid(),a);
  a.set("sid","female",21);
  a.setempid(empid++);
  e.put(a.getempid(),a);
  String val=e.get(a.getempid()).toString();
  System.out.print(val);
  
  Manager b=new Manager();
  b.set("ajithkannan","male",22);
  b.setid(id++);
  m.put(b.getname(),b.getid());
  b.set("harshavarthini","female",22);
  b.setid(id++);
  m.put(b.getname(),b.getid());
System.out.print(m);
  }
}
