import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        try (Connection cn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/po_2211", "root", "");
             Statement st = cn.createStatement()){
           String query = "INSERT INTO staff (name, age, department, project) VALUE ('employee11', 27, 5, 3)";
            st.execute(query);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
///•−−• •− −•• −•− •−•• ••−− −−−• ••−•• −• −• • −••• •− −−•• −•−− −•• •− −•• −−•• • −• −•−− ••••
