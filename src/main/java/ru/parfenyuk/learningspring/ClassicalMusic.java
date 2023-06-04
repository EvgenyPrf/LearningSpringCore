package ru.parfenyuk.learningspring;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ClassicalMusic implements Music{
    List<String> classicalSongs = new ArrayList<>();
    {
        classicalSongs.add("Hungarian Rhapsody");
        classicalSongs.add("Classical song two");
        classicalSongs.add("Classical song three");
    }

    @Override
    public  List<String> getSong() {
        return classicalSongs;
    }
}
