package ru.parfenyuk.learningspring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestSpring {
    public static void main(String[] args) {
        //данный класс читает файл applicationContext.xml и помещает бины в application context
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        MusicPlayer musicPlayer = context.getBean(MusicPlayer.class);
        List<Music> musicList = new ArrayList<>();
        musicList.add(context.getBean(ClassicalMusic.class));
        musicList.add(context.getBean(JazzMusic.class));
        musicList.add(context.getBean(RockMusic.class));
        musicPlayer.setMusicList(musicList);
        musicPlayer.playMusic();

        context.close();
    }
}