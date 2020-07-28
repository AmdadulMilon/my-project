package emailApplication;

public class Main {
    public static void main(String[] args) {
        Email empOne = new Email("John", "smith");
        System.out.println(empOne.show());
        System.out.println("\n\n");

        Email empTwo = new Email("John","Doe");
        System.out.println(empTwo.show());
    }
}
