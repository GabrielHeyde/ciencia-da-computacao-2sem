import java.util.HashSet;
import java.util.Set;

public class Exercício1 {

    public static void main(String[] args) {

        Set<Integer> conjunto1 = new HashSet<>();
        Set<Integer> conjunto2 = new HashSet<>();

        for (int i = 0; i < 15; i++) {
            int x = (int) (Math.random() * 30);
            int y = (int) (Math.random() * 30);
            conjunto1.add(x);
            conjunto2.add(y);
        }

        System.out.print("Conjunto 1 = " + conjunto1 + "\n");
        System.out.print("Conjunto 2 = " + conjunto2 + "\n");

        conjunto1.retainAll(conjunto2);

        System.out.print("Intersecção do Conjunto = " + conjunto1 + "\n");

    }
}