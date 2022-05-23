package Newsletter.EmailNewsletter.service;

import Newsletter.EmailNewsletter.entity.Subscription;
import Newsletter.EmailNewsletter.repository.SubRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SubService {
    @Autowired
    private SubRepository subRepository;

    public void save(Subscription subscription) {
        subRepository.save(subscription);
    }

    public Subscription get(Long id) {
        Optional<Subscription> optional = subRepository.findById(id);
        return optional.orElseGet(Subscription::new);
    }
    public void delete(Subscription subscription) {
        subRepository.delete(subscription);

    }

    public void update(Subscription subscription) {
        subRepository.save(subscription);
    }

    public List<Subscription> getAll() {
        return subRepository.findAll();
    }
}
