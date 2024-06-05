package com.example.demo;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @Autowired
    private OmdbService omdbService;

    @GetMapping("/")
    public String getMovie(@RequestParam("titolo")  String title) {
        return omdbService.getMovieDetails(title);
    }
}

