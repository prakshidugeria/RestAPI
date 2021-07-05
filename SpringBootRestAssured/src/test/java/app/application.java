package app;

import org.junit.runner.RunWith;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootContextLoader;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootApplication
@ContextConfiguration(classes = application.class, loader = SpringBootContextLoader.class)
@ComponentScan(basePackages = {"RestAssuredSpringExample.StepDefinition", "RestAssuredSpringExample.StepDefinitionHelper",
        "RestAssuredSpringExample"})
public abstract class application {

    public static void main(String[] args) {
        SpringApplication.run(application.class, args);
    }

}
