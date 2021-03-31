package service;

import api.Article;
import config.Config;
import io.restassured.response.ValidatableResponse;
import lombok.extern.log4j.Log4j2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static context.RunContext.RUN_CONTEXT;
import static io.restassured.RestAssured.given;

@Log4j2
public class ArticleServiceImpl implements ArticleService {

    Config config = new Config();


    @Override
    public List<Article> getArticles(String url) {
        String URL = config.getURL() + url;
        List<Article> articles = new ArrayList<>();

        ValidatableResponse response = given().log().everything()
                .get(URL)
                .then().log().ifError();
        RUN_CONTEXT.put("response",response);
        try{
            articles = response.extract().jsonPath().getList("articles", Article.class);
        }catch (Exception e){
            log.error("Articles request exception: " + Arrays.toString(e.getStackTrace()));
        }

        return articles;
    }

}
