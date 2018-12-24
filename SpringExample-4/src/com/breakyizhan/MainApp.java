package com.breakyizhan;
 
import org.springframework.context.support.AbstractApplicationContext;//Abstract≥ÈœÛ”¶”√£ª
import org.springframework.context.support.ClassPathXmlApplicationContext;
 
public class MainApp 
{
   public static void main(String[] args) 
   {
      AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
      com.breakyizhan.HelloWorld obj = (com.breakyizhan.HelloWorld) context.getBean("helloWorld");
      obj.getMessage();
      context.registerShutdownHook();
   }
}