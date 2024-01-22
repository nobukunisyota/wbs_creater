package subclass;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Common_func {

    public void print_call_method(String function_name) {
        System.out.println(function_name + " is called");
    }

    public boolean is_file_exist(String file_name) {
        Path path = Paths.get(file_name);
        return Files.exists(path);
    }

    public void import_csv(String file_name) {
        String csvFile = file_name;
        String line = "";
        String csvSplitBy = ",";

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            while ((line = br.readLine()) != null) {
                String[] data = line.split(csvSplitBy);
                for (String value : data) {
                    System.out.print(value + " ");
                }
                System.out.println();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void print_function_end(String function_name) {
        System.out.println(function_name + " is end");
    }
}
