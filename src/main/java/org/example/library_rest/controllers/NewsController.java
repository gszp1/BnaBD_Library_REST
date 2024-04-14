package org.example.library_rest.controllers;

import org.example.library_rest.model.News;
import org.example.library_rest.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/api/news")
public class NewsController {

    private final NewsService newsService;

    @Autowired
    public NewsController(NewsService newsService) {
        this.newsService = newsService;
    }

    @GetMapping("/all")
    public List<News> getNews() {
        return newsService.getAllNews();
    }

    @GetMapping("/{id}")
    public News getNewsById(@PathVariable("id") Long id) {
        Optional<News> news = newsService.getNewsById(id);
        return news.orElse(null);
    }

    @PostMapping("/add")
    public News createNews(@RequestBody News news) {
        return newsService.saveNews(news);
    }

    @PutMapping("/update")
    public News updateNews(@RequestBody News news) {
        return newsService.updateNews(news);
    }

    @DeleteMapping("/delete")
    public void deleteNews(@RequestParam("id") Long id) {
        newsService.deleteNews(id);
    }
}
