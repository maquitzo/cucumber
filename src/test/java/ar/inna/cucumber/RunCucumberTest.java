package ar.inna.cucumber;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"classpath:features/BeerCan.feature"},
        glue = {"ar.inna.cucumber"})

public class RunCucumberTest {

}