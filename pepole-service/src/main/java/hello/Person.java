package hello;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public class Person {

    @Getter
    private String name;

    @Getter
    private String sex;

}
