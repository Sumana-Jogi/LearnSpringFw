package org.springcore.configfree;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
//@ComponentScan(basePackages = {"org.springcore.configfree"})
public class SampleConfig {
    @Bean
    public Chocolate choco(){
        Chocolate chocolate = new Chocolate();
        return chocolate;
    }
    @Bean(name = {"sumanStudent","akuStudent"})
    public Student studentBean(){
        Student student = new Student(choco());
        return student;
    }
}
