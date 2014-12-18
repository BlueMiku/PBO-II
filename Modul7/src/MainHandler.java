
public class MainHandler {
    public static void main(String[] args) {
        DataHandler hd = new DataHandler();
        hd.getDBConnection();
        hd.closeConnection();
    }
}
