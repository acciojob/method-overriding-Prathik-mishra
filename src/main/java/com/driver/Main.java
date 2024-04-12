package com.driver;
class A{
    A(){

    }
    public String meth(){
      return "Invoking method from class A";
    }
}
class B extends A {
    B(){

    }
    @Override
    public String meth(){
      return "Method is overridden in Extended class B";
    }
}
public class Main {
    Main(){

    }
    public static void main(String[] args) {
      A obj = new B();
      obj.meth();
      obj.meth();
    }
}
