package catlist;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Cat {

    private @Id
    @GeneratedValue Long id;

    private String name;

    private String breed;

    private int age;

    //this constructor exists simply for JPA
    Cat() {};

    Cat (String name, String breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
    };

    @Override
    public String toString() {
        return String.format(
                "Cat[id=%d, name='%s', breed='%s', age='%d]",
                id, name, breed, age);
    }

}
