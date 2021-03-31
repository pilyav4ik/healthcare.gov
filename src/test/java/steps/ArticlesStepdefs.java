package steps;

import api.Article;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.response.ValidatableResponse;
import org.junit.Assert;
import service.ArticleService;
import service.ArticleServiceImpl;

import javax.lang.model.element.VariableElement;
import java.util.List;

import static context.RunContext.RUN_CONTEXT;

public class ArticlesStepdefs {

    ArticleService articleService = new ArticleServiceImpl();


    @Given("get articles {string} request")
    public void getArticlesRequest(String url) {
        List<Article> articles = articleService.getArticles(url);
        System.out.println(articles);
    }

    @Then("response code is {string}")
    public void responseCodeIs(String status) {
        ValidatableResponse response = RUN_CONTEXT.get("response", ValidatableResponse.class);
        int actualStatus = response.extract().statusCode();
        int expectStatus = Integer.parseInt(status);

        Assert.assertEquals(actualStatus, expectStatus);
    }
}
