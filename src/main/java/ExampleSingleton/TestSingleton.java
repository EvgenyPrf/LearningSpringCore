package ExampleSingleton;

public class TestSingleton {
    public static void main(String[] args) {
        LessonSingleton lessonSingleton1 = LessonSingleton.getInstance("Hello!");
        LessonSingleton lessonSingleton2 = LessonSingleton.getInstance("Bye");

        System.out.println(lessonSingleton1 == lessonSingleton2);
        System.out.println(lessonSingleton1.getValue());
        System.out.println(lessonSingleton2.getValue());
    }
}
