package com.breakyizhan;
import org.springframework.context.annotation.*;

@Configuration
public class ConfigA 
{
   @Bean
   public A a() {
      return new A(); 
   }
}