package people;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnect {
    public static void main(String[] args){
        String url = "jdbc:postgresql://localhost:5432/students";
        String user = "postgres";
        String password = "mupro";

        Connection conn = null;

        try{
            Class.forName("org.postgresql.Driver");

            conn = DriverManager.getConnection(url, user, password);
            if(conn != null){
                System.out.println("Connected to postgresql successfully");
            }else {
                System.out.println("Failed to connect to postgresql");
            }
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }catch (ClassNotFoundException e){
            System.out.println("Postgresql jdbc Driver not found");
        }finally {
            try{
                if(conn != null){
                    conn.close();
                }
            }catch (SQLException e){
                System.out.println(e.getMessage());
            }
        }
    }
}

