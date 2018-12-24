package com.breakyizhan;

public class TextEditor 
{
   private SpellChecker spellChecker;
 
   public TextEditor(SpellChecker spellChecker) //dependency injectionע������;
   {
      System.out.println("Inside TextEditor constructor." );
      this.spellChecker = spellChecker;
   }
   public void spellCheck() 
   {
      spellChecker.checkSpelling();
   }
}