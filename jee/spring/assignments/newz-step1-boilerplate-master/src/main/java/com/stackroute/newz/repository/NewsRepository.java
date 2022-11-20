package com.stackroute.newz.repository;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import com.stackroute.newz.model.News;
import org.springframework.stereotype.Repository;


/*
 * Annotate the class with @Repository annotation. 
 * This class contains the code for data storage interactions and methods 
 * of this class will be used by other parts of the applications such
 * as Controllers and Test Cases
 * */
@Repository
public class NewsRepository {
	
	/* Declare a variable called "newsList" to store all the news. */
    private List<News> newsList;

    public NewsRepository() {
    	/* Initialize the variable using proper data type */
        newsList=new ArrayList<>();
    }

    /* This method should return all the news in the list */
    public List<News> getNewsList() {
        return newsList;
    }

    /* This method should set the list variable with new list of news */
    public void setNewsList(List<News> newsList) {
        newsList.addAll(newsList);
    }

    /*
	 * This method should News object as argument and add the new news object into
	 * list
	 */
    public  void addNews(News news) {
        news.setPublishedAt(LocalDateTime.now());
        newsList.add(news);

    }

    /* This method should return the list of news */
    public List<News> getAllNews() {
        return newsList;
    }

    /* This method should delete a specified news from the list */
    public boolean deleteNews(int newsId) {
       int index=0;
        for(News news:newsList){
            if(news.getNewsId()==newsId){
                index=newsList.indexOf(news);
                break;
            }
        }
        newsList.remove(index);
        return false;


    }

}
