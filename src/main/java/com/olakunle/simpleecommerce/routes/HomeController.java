package com.olakunle.simpleecommerce.routes;

import jakarta.servlet.http.HttpServletResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public void gotoSwagger(HttpServletResponse response) {
        response.sendRedirect("/swagger-ui.html");
    }
}
