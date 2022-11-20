package com.stackroute.newz.controller;

import com.stackroute.newz.model.News;
import com.stackroute.newz.repository.NewsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;
import java.util.*;
import java.time.LocalDateTime;

/*
 * Annotate the class with @Controller annotation. @Controller annotation is used to mark
 * any java class as a controller so that Spring can recognize this class as a Controller
 */
@Controller
public class NewsController {
    @Autowired
    private NewsRepository repository;


    @GetMapping("/")
    public ModelAndView home() {
        List<News> list = repository.getNewsList();
        return new ModelAndView("index", "newsList",list );
    }

    @GetMapping("/deleteNews")
    public RedirectView deleteNews(@RequestParam int newsId ){
       repository.deleteNews(newsId);
       return new RedirectView("/");
    }

    @GetMapping("/addnews")
    public ModelAndView addNews() {
        return new ModelAndView("addnews", "news", new News());
    }


    @PostMapping("/saveData")
    public RedirectView saveNews(@ModelAttribute("news") News news) {
        repository.addNews(news);
        return new RedirectView("/");
    }

    /*
     * From the problem statement, we can understand that the application
     * requires us to implement the following functionalities.
     *
     * 1. display the list of existing news from the collection. Each news object
     *    should contain News Id, title, author, description, content and created date.
     * 2. Add a new news which should contain the News Id, title, author, description, content.
     * 3. Delete an existing news.
     */

    /*
     * Get the application context from resources/beans.xml file using ClassPathXmlApplicationContext() class.
     * Retrieve the News object from the context.
     * Retrieve the NewsRepository object from the context.
     *
     */



    /*Define a handler method to read the existing news by calling the getNewsList() method
     * of the NewsRepository class and add it to the ModelMap which is an implementation of Map
     * for use when building model data for use with views. it should map to the default URL i.e. "/" */



    /*Define a handler method which will read the News data from request parameters and
     * save the news by calling the addNews() method of NewsRepository class. Please note
     * that the createdAt field should always be auto populated with system time and should not be accepted
     * from the user. Also, after saving the news, it should show the same along with existing
     * news elements. Hence, reading news has to be done here again.
     * This handler method should map to the URL "/saveNews".
     */



    /* Define a handler method to delete an existing news by calling the deleteNews() method
     * of the NewsRepository class
     * This handler method should map to the URL "/deleteNews"
     */


}