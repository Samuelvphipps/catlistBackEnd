package catlistReact.catlistReact.catlist;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CatController {

    CatController(CatRepository repository);
    @GetMapping("/employees")
    List<Cat> all() { return repository.findAll(); };
}
