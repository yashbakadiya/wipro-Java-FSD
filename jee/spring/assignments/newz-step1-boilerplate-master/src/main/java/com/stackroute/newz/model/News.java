package com.stackroute.newz.model;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.Objects;

/* 
 * Annotate the class with @Component annotation. 
 * @Component annotation is used to crete singleton instance of of the class
 *
 */


/*
 * The class "News" will be acting as the data model for the News data in the ArrayList.
 */

public class News {

	
	/*
	 * This class should have five fields (newsId, title, author,
	 * description, content and publishedAt). This class should also contain the getters and
	 * setters for the fields. The value of publishedAt should not be accepted from
	 * the user but should be always initialized with the system date
	 */
    private int newsId;
    private String title;
    private String author;
    private String description;
    private String content;
    private LocalDateTime publishedAt;


    public News() {
        /* default constructor */
    }


    /* All the getters/setters definition should be implemented here */

    public int getNewsId() {
        return newsId;
    }

    public void setNewsId(int newsId) {
        this.newsId = newsId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public LocalDateTime getPublishedAt() {
        return publishedAt;
    }

    public void setPublishedAt(LocalDateTime publishedAt) {
        this.publishedAt = publishedAt;
    }

    @Override
    public String toString() {
        return "News{" +
                "newsId=" + newsId +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", description='" + description + '\'' +
                ", content='" + content + '\'' +
                ", publishedAt=" + publishedAt +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        News news = (News) o;
        return newsId == news.newsId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(newsId);
    }
}
