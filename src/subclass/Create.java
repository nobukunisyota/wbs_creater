package subclass;

public class Create {
    String filename;
    // Create common instance
    Common_func common = new Common_func();

    public Create(String filename) {
        this.filename = filename;
    }

    public boolean create_method() {
        common.import_csv(filename);
        return true;
    }
}
