import java.util.*;
import java.lang.Math;

class Program {
    private static Random random = new Random();
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int n, i;

        System.out.println("Inerire il nuermo di macchine che hanno corso a monza: ");
        n = input.nextInt();
        String[] nomi = new String[n];
        int[] posizioni = new int[n];

        for (i = 0; i <= n - 1; i++) {
            System.out.println("Inserire il nome del " + (i + 1) + " pilota: ");
            nomi[i] = input.nextLine();
            posizioni[i] = random.nextInt(n) + 1;
        }
        sortingAuto(posizioni, n, nomi);
        for (i = 0; i <= n - 1; i++) {
            System.out.println("Con la posizione: " + posizioni[i] + " abbiamo: " + nomi[i]);
        }
    }
    
    public static void sortingAuto(int[] v, int n, String[] r) {
        int i, j, t;
        String ts;
        boolean scambio;

        scambio = true;
        i = 0;
        while (i < n && scambio == true) {
            j = 0;
            scambio = false;
            while (j < n - 1 - i) {
                if (v[j] > v[j + 1]) {
                    t = v[j];
                    v[j] = v[j + 1];
                    v[j + 1] = t;
                    ts = r[j];
                    r[j] = r[j + 1];
                    r[j + 1] = ts;
                    scambio = true;
                }
                j = j + 1;
            }
            i = i + 1;
        }
    }
}
