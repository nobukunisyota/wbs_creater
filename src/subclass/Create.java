package subclass;

public class Create {
    // Create common instance
    Common_func common = new Common_func();

    public boolean create_method() {
        common.import_csv("input.csv");
        return true;
    }
}
