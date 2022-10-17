public class Shark extends Anymal{
    public Shark(String type) {
        super(type);
    }
    public void attack(){
        System.out.println("Shark is attacking");
    }

    @Override
    public void eat() {
        System.out.println("Shark eat");
    }

    @Override
    public String toString() {
        return "Shark";
    }
}
