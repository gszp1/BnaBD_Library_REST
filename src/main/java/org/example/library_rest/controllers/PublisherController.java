package org.example.library_rest.controllers;

import org.example.library_rest.model.Publisher;
import org.example.library_rest.service.PublisherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/api/publishers")
public class PublisherController {

    private final PublisherService publisherService;

    @Autowired
    public PublisherController(PublisherService publisherService) {
        this.publisherService = publisherService;
    }

    @GetMapping("/all")
    public List<Publisher> getAllPublishers() {
        return publisherService.getAllPublishers();
    }

    @GetMapping("/{id}")
    public Publisher getPublisherById(@PathVariable("id") Long id) {
        Optional<Publisher> publisher = publisherService.getPublisher(id);
        return publisher.orElse(null);
    }

    @PostMapping("/add")
    public Publisher savePublisher(@RequestBody Publisher publisher) {
        return publisherService.savePublisher(publisher);
    }

    @PutMapping("/update")
    public Publisher updatePublisher(@RequestBody Publisher publisher) {
        return publisherService.updatePublisher(publisher);
    }

    @DeleteMapping("/delete")
    public void deletePublisher(@RequestParam("id") Long id) {
        publisherService.deletePublisher(id);
    }
}
