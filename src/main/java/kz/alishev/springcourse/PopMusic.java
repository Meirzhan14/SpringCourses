package kz.alishev.springcourse;

import org.springframework.stereotype.Component;

@Component
public class PopMusic implements Music {

    @Override
    public String getSong() {
        return "Pop music is cool";
    }
}
