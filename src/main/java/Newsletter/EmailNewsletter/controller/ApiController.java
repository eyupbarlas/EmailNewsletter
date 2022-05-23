package Newsletter.EmailNewsletter.controller;

import Newsletter.EmailNewsletter.entity.Subscription;
import Newsletter.EmailNewsletter.service.SubService;
import Newsletter.EmailNewsletter.utilities.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.endpoint.annotation.DeleteOperation;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    //TODO-> Task: get the id from url entry, go to that specified id
    @GetMapping("/api/read")
    @ReadOperation
    public Subscription read(@RequestParam("id") Long id ) {
//        subService.save(subscription);

        Subscription subscription =  subService.get(id);

        return subscription;
    }

    @GetMapping("/api/readAll")
    public List<Subscription> readAll() {
//        subService.save(subscription);
        return subService.getAll();
    }

    @DeleteOperation
    @ResponseBody
    @DeleteMapping("/api/delete")
    public Response delete(@RequestBody Subscription subscription) {
//        subService.save(subscription);

        subService.delete(subscription);

        return new Response("success" , "DELETED");
    }

    @ResponseBody
    @PutMapping("/api/update")
    public Response update(@RequestBody Subscription subscription) {
//        subService.save(subscription);

        subService.update(subscription);

        return new Response("success" , "Updated");
    }
}
