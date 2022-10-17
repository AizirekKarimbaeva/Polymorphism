public class Anymal {
    private String type;
    public Anymal(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void eat(){
        System.out.println("Animal eats ");
    }

    @Override
    public String toString() {
        return "Anymal: " +
                "type: " + type + '\'' +
                '}';
    }
}
