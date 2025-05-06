package com.varver.hom12;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class FilmsController {

    @RequestMapping(value = "/films", method = RequestMethod.GET)

    public List<Films>getFilms() {
        List<Films> films = new ArrayList<Films>();
        films.add(new Films("Сверхъестественное (Supernatural)", "Эрик Крипке", 2005, "Джаред Падалеки, Дженсен Эклс"));
        films.add(new Films("Острые козырьки (Peaky Blinders)", "Стивен Найт (создатель), реж. Отто Батхерст и др.", 2013, "Киллиан Мёрфи, Пол Андерсон, Том Харди"));
        films.add(new Films("911: Служба спасения (9-1-1)", "Райан Мерфи, Бред Фэлчак, Тим Минеар", 2018, "Анджела Бассетт, Питер Краузе, Дженніфер Лав Х'юїтт"));

        return films;
    }


}
