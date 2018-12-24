package com.breakyizhan;
import org.springframework.context.annotation.*;

@Configuration
@Import(ConfigA.class)
public class ConfigB {
   @Bean
   public B a() {
      return new A(); 
   }
}