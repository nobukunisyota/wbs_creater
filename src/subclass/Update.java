package subclass;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Update extends Base {
    public void print_call_method() {
        System.out.println("Updating Mode");
    }

    public boolean is_file_exist(String file_name) {
        Path path = Paths.get("test.json");
        return Files.exists(path);
    }

    public boolean insert_method() {
        System.out.println("Inserting");
        return false;
    }

    public boolean update_method() {
        System.out.println("Updating");
        return true;
    }

    public boolean delete_method() {
        System.out.println("Deleting");
        return false;
    }

    public void print_function_end() {
        System.out.println("Update function end");
    }
}
