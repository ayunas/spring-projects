package com.luv2code;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration //1. annotate the class as a Spring Configuration
@ComponentScan("com.luv2code") //2. add component scanning support
public class SpringConfig {

}
