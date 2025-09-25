package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertEquals;

public class SumarEntersSteps {
    private Integer b;
    private Integer a;
    private Integer resultat;

    @Given("els nombres {int} i {int}")
    public void els_nombres_i(Integer num1, Integer num2) {
        this.a = num1;
        this.b = num2;
    }
    @When("els sumo")
    public void els_sumo() {
        resultat = a + b;
    }
    @Then("el resultat hauria de ser {int}")
    public void el_resultat_hauria_de_ser(Integer expected) {
        assertEquals(expected, resultat);
    }
}
