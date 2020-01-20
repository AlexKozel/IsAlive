import java.util.ArrayList;
import java.util.List;

public class CreateTable {
    List<String> list;
    Integer x;
    Integer y;
    Integer cycles;
    char [][] table;

    ArrayList<Character> all = new ArrayList<>();

    CreateTable(ArrayList<String> list) {
        this.list = list;

        String[] strMas = list.get(0).split("[ ]");

        /**
         * horizontal
         */
        this.x = Integer.parseInt(strMas[0]);

        /**
         * vertical
         */
        this.y = Integer.parseInt(strMas[1]);

        /**
         * Life cycles
         */
        this.cycles = Integer.parseInt(strMas[2]);

        int[] i = new int[x * y];
        System.out.println(i.length);


        this.table = new char[y][x];

        for (int j = 1; j < list.size(); j++) {
            char[] chars = list.get(j).toCharArray();

            for (char ch : chars) {
                all.add(ch);
            }
        }

        for (int a = 0; a < y; a++) {
            for (int b = 0; b < x; b++) {
//                table[a][b] = all.get((a*x)+b);
                int random =(int) (Math.random()*2);
                if (random == 1) {
                table[a][b] = 42;
            } else table[a][b] = 46;
            }
        }


        System.out.println("hi");

    }

}
