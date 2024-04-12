package com.driver;
public class A{
    A(){

    }
    public String meth(){
      return "Invoking method from class A";
    }
}
public class B extends A {
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
