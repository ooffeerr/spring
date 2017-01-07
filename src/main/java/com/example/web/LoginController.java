package com.example.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import javax.validation.Valid;


@Controller
public class LoginController extends WebMvcConfigurerAdapter {

    @Autowired
    CustomerRepository customerRepository;

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/results").setViewName("results");
    }

    @GetMapping("/login123")
    public String showForm(LoginForm personForm) {
        System.out.print("Doing get!");
        return "form";
    }

    @PostMapping("/login123")
    public String checkLoginInfo(@Valid LoginForm loginForm, BindingResult bindingResult) {

        if (bindingResult.hasErrors()) {
            return "form";
        }


        User user = new User(loginForm.username, loginForm.password);
        System.out.println("saving new user :" + user);
        customerRepository.save(user);

        return "redirect:/results";
    }
}
