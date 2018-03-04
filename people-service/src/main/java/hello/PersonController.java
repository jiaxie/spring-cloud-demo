package hello;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

//@Slf4j
@EnableEurekaClient
@RestController
public class PersonController {

    @Value("${user.role}")
    private String role;

    @RequestMapping("/person")
    public Person get(@RequestParam(value = "name", defaultValue = "Yotta") String name,
                      @RequestParam(value = "sex", defaultValue = "Female") String sex) {
//        log.info("Have a person: {}, {}", name, sex);
        return new Person(name, sex, role);
    }
}
