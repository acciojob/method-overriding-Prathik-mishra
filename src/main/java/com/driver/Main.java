package com.driver;
class A{
  public string meth(){
    return "Invoking method from class A";
  } 
}
class B extnds A{
  public string meth(){
    return "Method is overridden in Extended class B";
  } 
}
public class Main {
  B obj = new A();
  obj.meth();
  
  B obj2 = new B();
  obj2.meth();
}
