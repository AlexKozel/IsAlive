import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class WorkWithFile {
    static ArrayList<String> list;

    public void letsWork() {
        String fileName = "src/input.txt";
        try {

            Stream<String> stream = Files.lines(Paths.get(fileName));
            list = (ArrayList<String>) stream.collect(Collectors.toList());
        } catch (IOException e) {
            System.out.println("no file");
        }

        CreateTable table = new CreateTable(list);
        Checking checking = new Checking(table.table, table.x, table.y, table.cycles);

        for (int i = 0; i < table.cycles; i++) {
            System.out.println("cycle " + i);
            checking.print();
            checking.firstStep();
//            checking.print();
            checking.secondStep();
        }

    }
}
