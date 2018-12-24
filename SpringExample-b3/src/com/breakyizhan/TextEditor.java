package com.breakyizhan;

import javax.annotation.Resource;

public class TextEditor 
{
   private SpellChecker spellChecker;
   private String name;
   
   @Resource(name = "spellChecker")
 
   public void setSpellChecker( SpellChecker spellChecker)
   {
      this.spellChecker = spellChecker;
   }
   public SpellChecker getSpellChecker() 
   {
      return spellChecker;
   }
   public void setName(String name) 
   {
      this.name = name;
   }
   public String getName() 
   {
      return name;
   }
   public void spellCheck() 
   {
      spellChecker.checkSpelling();
   }
}