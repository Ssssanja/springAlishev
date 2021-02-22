package by.liukevich.springcourse;

import org.springframework.stereotype.Component;

@Component
public class RapMusic implements Music{
    @Override
    public String getSong() {
        return "8 mile";
    }
}
