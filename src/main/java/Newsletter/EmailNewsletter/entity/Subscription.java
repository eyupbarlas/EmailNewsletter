package Newsletter.EmailNewsletter.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

import static javax.persistence.GenerationType.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Subscription {
    @Id
    @GeneratedValue(strategy = AUTO)
//    @Column(
//            name = "id",
//            updatable = false
//    )
    private Long id;

//    @Column(
//            name = "email",
//            nullable = false,
//            columnDefinition = "TEXT"
//    )
    private String email;

    public Subscription(String email) {
        this.email = email;
    }
}
