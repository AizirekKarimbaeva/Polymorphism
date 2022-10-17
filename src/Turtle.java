public class Turtle extends Anymal{
    public Turtle(String type) {
        super(type);
    }
    public void swim(){
        System.out.println("Turtle is swimming");
    }

    @Override
    public void eat() {
        System.out.println("Turtle eat");
    }

    @Override
    public String toString() {
        return "Turtle";
    }
}
