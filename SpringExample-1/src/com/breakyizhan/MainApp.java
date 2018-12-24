package com.breakyizhan;
 
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class MainApp 
{
   public static void main(String[] args) 
   {
      ApplicationContext context=new FileSystemXmlApplicationContext
    		  ("D:\\Users\\ncai\\eclipse-workspace\\SpringExample-1\\src\\Beans.xml");
      HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
      /* objA.setMessage("I'm object A");
      objA.getMessage();

      HelloWorld objB = (HelloWorld) context.getBean("helloWorld");*/
      obj.getMessage();
   }
}