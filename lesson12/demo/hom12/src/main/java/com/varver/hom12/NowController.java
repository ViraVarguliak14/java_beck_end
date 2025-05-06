package com.varver.hom12;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.LocalTime;

@RestController
public class NowController {

    @RequestMapping(value = "/now",method = RequestMethod.GET)
    public Now getNow() {
        return new Now(
                LocalDate.now(),
                LocalTime.now().withNano(0)
        );
    }

}
