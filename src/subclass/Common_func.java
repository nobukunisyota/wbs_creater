package subclass;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Common_func {

    public void print_call_method(String function_name) {
        System.out.println(function_name + " is called");
    }

    public boolean is_file_exist(String file_name) {
        Path path = Paths.get("test.json");
        return Files.exists(path);
    }

    public void print_function_end(String function_name) {
        System.out.println(function_name + " is end");
    }
}
