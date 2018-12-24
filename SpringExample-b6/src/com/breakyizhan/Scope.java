package com.breakyizhan;

	@Configuration
	public class AppConfig {
	   @Bean
	   @Scope("prototype")
	   public Foo foo() {
	      return new Foo();
	   }
	}
}
