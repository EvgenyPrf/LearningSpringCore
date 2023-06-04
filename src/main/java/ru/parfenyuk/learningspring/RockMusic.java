package ru.parfenyuk.learningspring;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class RockMusic implements Music {
    List<String> rockSongs = new ArrayList<>();
    {
        rockSongs.add("Wind cries Mary");
        rockSongs.add("Rock song two");
        rockSongs.add("Rock song three");
    }

    @Override
    public List<String> getSong() {
        return rockSongs;
    }
}
