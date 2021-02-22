package by.liukevich.springcourse;

public class ClassicalMusic implements Music{
    private ClassicalMusic () {}

    public static ClassicalMusic getClassicalMusic () {
        return new ClassicalMusic();
    }
    @Override
    public String getSong() {
        return "Hungarian Rapsody";
    }
    public void doMyInit () {
        System.out.println("Doing my initialisation");
    }
    public void doMyDestroy () {
        System.out.println("Doing my destroying");
    }
}
