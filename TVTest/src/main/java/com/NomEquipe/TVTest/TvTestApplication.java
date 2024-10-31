package com.NomEquipe.TVTest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class TvTestApplication {

    public static void main(String[] args) {
		SpringApplication.run(TvTestApplication.class, args);
	  }
	  @GetMapping("/TVTest")
	  public String hello(@RequestParam(value = "name", defaultValue = "TV Test") String name) {
		return String.format("Welcome %s !", name);
	  }

}
