package subclass;

public class Update {
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
}
