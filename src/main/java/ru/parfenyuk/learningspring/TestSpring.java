package ru.parfenyuk.learningspring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        //данный класс читает файл applicationContext.xml и помещает бины в application context
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );
        //получение бина с внедрением зависимости через AppCont
//        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//        MusicPlayer musicPlayer1 = context.getBean("musicPlayer", MusicPlayer.class);
//        musicPlayer1.setVolume(30);
//        System.out.println(musicPlayer.getVolume());
//        System.out.println(musicPlayer1.getVolume());

        ClassicalMusic classicalMusic = context.getBean("classicalMusicBean", ClassicalMusic.class);
        System.out.println(classicalMusic.getSong());
        context.close();
    }
}