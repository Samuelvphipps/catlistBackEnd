package catlistReact.catlistReact.catlist;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;


//notes: https://spring.io/guides/gs/accessing-data-jpa/

//The Customer class is annotated with @Entity, indicating that it is a JPA entity.
// (Because no @Table annotation exists, it is assumed that this entity
// is mapped to a table Cat.)


@Entity
public class Cat {

    private @Id
    @GeneratedValue Long id;

    private String name;

    private String breed;

    private int age;

    //this constructor exists simply for JPA
    protected Cat() {};

    public Cat(String name, String breed, int age) {
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

    //methods

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public int getAge() {
        return age;
    }

}
