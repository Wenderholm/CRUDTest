package wsb.edu.demo;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@Getter
@Setter
public class Person {
    @Id
    @GeneratedValue
    Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String email;

    public Person(String name, String email) {
        this.name = name;
        this.email = email;
    }


}
