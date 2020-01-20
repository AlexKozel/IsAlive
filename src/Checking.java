import java.util.ArrayList;

public class Checking {
    char[][] list;
    Integer x;
    Integer y;
    Integer cycles;
    int alive;

    public Checking(char[][] list, Integer x, Integer y, Integer cycles) {
        this.list = list;
        this.x = x;
        this.y = y;
        this.cycles = cycles;


    }

    void print() {
        for (int a = 0; a < y; a++) {
            System.out.println("");
            for (int b = 0; b < x; b++) {
                System.out.print(list[a][b]);
            }
        }

        System.out.println("");
    }

    void firstStep() {
        for (int a = 0; a < y; a++) {
            for (int b = 0; b < x; b++) {
                if (list[a][b] == (46)) {//если клетка мертвая считаем живые вокруг
                    checking(a, b);
                    if (alive == 3) {
                        list[a][b] = ((char) 43);
                    }
                } alive = 0;
            }
        }
    }

    void secondStep() {
        for (int a = 0; a < y; a++) {
            for (int b = 0; b < x; b++) {
                if (list[a][b] == (42)) {//если клетка alive считаем живые вокруг
                    checking(a, b);
                    if (alive > 3 | alive < 2) {
                        list[a][b] = ((char) 46);
                        alive = 0;
                    }
                }
            }
        }

        for (int a = 0; a < y; a++) {
            for (int b = 0; b < x; b++) {
                if (list[a][b] == (43)) {
                    list[a][b] = ((char) 42);
                }

            }

        }
    }

    void checking(int a, int b) {

        for (int y = a - 1; y <= a + 1;y++) {
            for (int x = b - 1; x <= b + 1; x++) {
                try {
                    if (list[y][x] == (42)) { // если проверяемая клетка есть и существует, то
                        alive = alive + 1;
                    }
                } catch (IndexOutOfBoundsException ex) {
                    System.out.print("");
                }
            }
        }
    }

}
