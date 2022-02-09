import java.util.Date;
// import java.sql.Date; will cause name collision

public class NamingConflict {
    public static void main(String[] args) {
        Date date;
        java.sql.Date sqlDate;
    }
}
