package Newsletter.EmailNewsletter.controller;

import Newsletter.EmailNewsletter.entity.Subscription;
import Newsletter.EmailNewsletter.service.SubService;
import Newsletter.EmailNewsletter.utilities.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {
    @Autowired
    private SubService subService;
    @ResponseBody
    @PostMapping("/api/add")
    public Response add(@RequestBody Subscription subscription) {
        subService.save(subscription);

        return new Response("success", "danks");
    }
}
