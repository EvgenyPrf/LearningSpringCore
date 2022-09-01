package ExampleSingleton;

public class LessonSingleton {
    private String value;
    private static LessonSingleton instance;

    private LessonSingleton(String value) {
        this.value = value;
    }

    public static LessonSingleton getInstance(String value){
        if(instance == null){
            instance = new LessonSingleton(value);
        }
        return instance;
    }

    public String getValue() {
        return value;
    }
}
