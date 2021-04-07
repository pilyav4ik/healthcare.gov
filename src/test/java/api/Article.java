
package api;

import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Article {

    private List<String> categories;
    private String content;
    private String date;
    private String lang;
    private String layout;
    private List<Object> tags;
    private String title;
    private String url;

    public Article() {
    }

    public Article(List<String> categories, String content, String date, String lang, String layout, List<Object> tags, String title, String url) {
        this.categories = categories;
        this.content = content;
        this.date = date;
        this.lang = lang;
        this.layout = layout;
        this.tags = tags;
        this.title = title;
        this.url = url;
    }

    public List<String> getCategories() {
        return categories;
    }

    public void setCategories(List<String> categories) {
        this.categories = categories;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public String getLayout() {
        return layout;
    }

    public void setLayout(String layout) {
        this.layout = layout;
    }

    public List<Object> getTags() {
        return tags;
    }

    public void setTags(List<Object> tags) {
        this.tags = tags;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Article article = (Article) o;
        return Objects.equals(categories, article.categories) &&
                Objects.equals(content, article.content) &&
                Objects.equals(date, article.date) &&
                Objects.equals(lang, article.lang) &&
                Objects.equals(layout, article.layout) &&
                Objects.equals(tags, article.tags) &&
                Objects.equals(title, article.title) &&
                Objects.equals(url, article.url);
    }

    @Override
    public int hashCode() {
        return Objects.hash(categories, content, date, lang, layout, tags, title, url);
    }

    @Override
    public String toString() {
        return "Article{" +
                "categories=" + categories +
                ", content='" + content + '\'' +
                ", date='" + date + '\'' +
                ", lang='" + lang + '\'' +
                ", layout='" + layout + '\'' +
                ", tags=" + tags +
                ", title='" + title + '\'' +
                ", url='" + url + '\'' +
                '}';
    }
}
