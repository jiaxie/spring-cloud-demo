package hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@RestController
public class PersonController {

    @RequestMapping("/person")
    public Person get(@RequestParam(value = "name", defaultValue = "Yingying") String name,
                      @RequestParam(value = "sex", defaultValue = "Female") String sex) {
        return new Person(name, sex);
    }
}
