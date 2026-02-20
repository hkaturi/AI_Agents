public class UserService {
    public String getUser(int id) {
        // TODO: add null check
        return database.findUser(id).getName();  // potential NullPointerException line 42
    }
    
    public void connectDB() {
        // TODO: add timeout handling
        database.connect();  // potential timeout line 88
    }
}
