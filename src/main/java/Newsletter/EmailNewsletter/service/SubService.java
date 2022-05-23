package Newsletter.EmailNewsletter.service;

import Newsletter.EmailNewsletter.entity.Subscription;
import Newsletter.EmailNewsletter.repository.SubRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SubService {
    @Autowired
    private SubRepository subRepository;

    public void save(Subscription subscription) {
        subRepository.save(subscription);
    }
}
