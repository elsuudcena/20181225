package com.breakyizhan;
 
public class TextEditor {
   private A a;
 
   public TextEditor(A a){
      System.out.println("Inside TextEditor constructor." );
      this.a = a;
   }
   public void spellCheck(){
      a.checkSpelling();
   }
}