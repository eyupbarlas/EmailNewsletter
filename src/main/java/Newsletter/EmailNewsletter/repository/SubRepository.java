package Newsletter.EmailNewsletter.repository;

import Newsletter.EmailNewsletter.entity.Subscription;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubRepository extends JpaRepository<Subscription, Long> {

}
