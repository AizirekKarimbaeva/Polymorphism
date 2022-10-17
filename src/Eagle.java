public class Eagle extends Anymal{
    public Eagle(String type) {
        super(type);
    }
    public void fly(){
        System.out.println("Eagle is flying");
    }

    @Override
    public void eat() {
        System.out.println("Eagle eat");
    }

    @Override
    public String toString() {
        return "Eagle";
    }
}
