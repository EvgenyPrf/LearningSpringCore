package ru.parfenyuk.learningspring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


/**
* Аннотация @Component указывает на то, что на основе данного класса необходимо создать бин.
* */
@Component
public class MusicPlayer {
    private ClassicalMusic classicalMusic;
    private RockMusic rockMusic;

    /** Аннотация @Autowired указывает на то, что в конструктор нужно внедрить зависимость на основе бина.
     * Аннотация Autowired может указываться над приватным полем, даже если нет сеттера.
     * Она в любом случае внедрит зависимость через механизм рефлексии.
     **/

    @Autowired
    public MusicPlayer(ClassicalMusic classicalMusic, RockMusic rockMusic) {
        this.classicalMusic = classicalMusic;
        this.rockMusic = rockMusic;
    }


    public String playMusic(){
        return "Playing: " + classicalMusic.getSong() + "\n" + "Playing: " + rockMusic.getSong();
    }
}
