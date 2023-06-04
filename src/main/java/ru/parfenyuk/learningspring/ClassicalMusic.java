package ru.parfenyuk.learningspring;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
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

    @PostConstruct
    public void doMyInit(){
        System.out.println("Do my init");
    }
    @PreDestroy
    public void doMyDestroy(){
        System.out.println("Do my destroy");
    }

    @Override
    public  List<String> getSong() {
        return classicalSongs;
    }
}
