package ru.parfenyuk.learningspring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Random;


/**
* Аннотация @Component указывает на то, что на основе данного класса необходимо создать бин.
* */
@Component
public class MusicPlayer {
    private Music music1;
    private Music music2;
    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.volume}")
    private int volume;


    /** Аннотация @Autowired указывает на то, что в конструктор нужно внедрить зависимость на основе бина.
     * Аннотация Autowired может указываться над приватным полем, даже если нет сеттера.
     * Она в любом случае внедрит зависимость через механизм рефлексии.
     *
     * Аннотация @Qualifier уточняет, какой бин необходимо внедрить
     **/

    @Autowired
    public MusicPlayer(@Qualifier("classicalMusic") Music music1, @Qualifier("rockMusic") Music music2) {
        this.music1 = music1;
        this.music2 = music2;
    }



    public String playMusic(Genre genre){
        Random random = new Random();
        switch (genre){
            case CLASSICAL:
                return music1.getSong().get(random.nextInt(music1.getSong().size()));
            case ROCK:
                return music2.getSong().get(random.nextInt(music2.getSong().size()));
            default:
                return "none";
        }
    }

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }
}
