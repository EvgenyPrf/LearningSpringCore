package ru.parfenyuk.learningspring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        //данный класс читает файл applicationContext.xml и помещает бины в application context
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );
        //достанем бин из application context
        Music music = context.getBean("musicBean", Music.class);
        //внедряем зависимость из вне вручную
        MusicPlayer musicPlayer = new MusicPlayer(music);
        musicPlayer.playMusic();
        context.close();
    }
}
