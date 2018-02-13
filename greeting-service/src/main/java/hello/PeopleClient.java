package hello;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "people-service")
public interface PeopleClient {

    @RequestMapping("/person")
    Person get(@RequestParam(value = "name") String name,
                      @RequestParam(value = "sex") String sex);

}
