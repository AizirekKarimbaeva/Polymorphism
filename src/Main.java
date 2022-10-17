public class Main {
    public static void main(String[] args) {
        Shark sh1 = new Shark("Great white shark");
        Shark sh2 = new Shark("Hammerhead shark");
        Shark sh3 = new Shark("Whale shark");
        System.out.println();
        Turtle tr4 = new Turtle("Chelydridae");
        Turtle tr5 = new Turtle("Cheloniidae");
        Turtle tr6 = new Turtle("Dermocheluidae");
        System.out.println();
        Eagle eg7 = new Eagle("Bald eagle");
        Eagle eg8 = new Eagle("Golden eagle");
        Eagle eg9 = new Eagle("South American harpy");
        Anymal[] anymals = {sh1, sh2, sh3, tr4, tr5, tr6, eg7, eg8, eg9};
        Shark[] sharks = {sh1, sh2, sh3};
        Turtle[] trutles = {tr4, tr5, tr6};
        Eagle[] eagles = {eg7, eg8, eg9};
        for (Anymal anymal : anymals) {
            (anymal).eat();
            if (anymal instanceof Shark) {
                ((Shark) anymal).attack();
            } else if (anymal instanceof Turtle) {
                ((Turtle) anymal).swim();
            } else if (anymal instanceof Eagle) {
                ((Eagle) anymal).fly();
            }
        }
    }
    }
