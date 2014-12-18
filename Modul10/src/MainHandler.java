public class MainHandler {
    public static void main(String[] args)  {
        DataHandler datahandler= new DataHandler();
        datahandler.getDBConnection();
        datahandler.close();
        
    }
}