import java.util.TreeSet;

public class UniqueSequence {
    public static void main(String[] args) {
        int xMax = 20; // Максимальное значение x для генерации значений y и z
        TreeSet<Integer> sequence = createSequence(xMax);
        System.out.println("Ряд чисел u без дубликатов: " + sequence);
    }

    private static TreeSet<Integer> createSequence(int xMax) {
        TreeSet<Integer> sequence = new TreeSet<>();

        sequence.add(1); // u(0) = 1
        for (int x = 0; x <= xMax; x++) {
            int y = 2 * x + 1;
            int z = 3 * x + 1;

            sequence.add(y);
            sequence.add(z);
        }

        return sequence;
    }
}