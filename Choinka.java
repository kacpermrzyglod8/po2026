public class Choinka {
    public static void main(String[] args) { //ustawiony argument 10
        int count = Integer.parseInt(args[0]);

        for (int i = 1; i <= count; i++) {
            for (int j = 1; j <= count - i; j++) {
                System.out.print(" ");
            }
            for (int z = 1; z <= 2 * i - 1; z++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
