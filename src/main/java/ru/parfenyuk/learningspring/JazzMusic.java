package ru.parfenyuk.learningspring;

import org.springframework.stereotype.Component;

@Component
public class JazzMusic implements Music{
    @Override
    public String getSong() {
        return "My Friend of Mystery";
    }
}
