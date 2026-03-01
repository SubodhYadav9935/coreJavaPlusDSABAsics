import java.sql.*;
public class DEmoJDBC {
    public static void main(String[] args) {
        /*import package
        * load and register
        * create connection
        * create statement
        * execute statement
        * process the results
        * close
        */

        String url="jdbc:postgresql://localhost:5432/JavaJDBC";
        String uname="postgres";
        String pass="Subodh@2507";

        String sql = "SELECT * from \"Students\" ";
        try{
            Class.forName("org.postgresql.Driver");// it is optional
            Connection con = DriverManager.getConnection(url,uname,pass);
            System.out.println("connect to database successfully");
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql); //execute query isused when we want to get some or read the data only in that case we use it
//            System.out.println(rs.next());
//            String s = rs.getString("Sname"); //fetching the single record from the table
//            System.out.println("Name of the Student is "+s);
            while(rs.next()){ // fetching the multiple record from the table
                System.out.println(rs.getInt(1)+" - " + rs.getInt(2)+" - "+ rs.getString(3));
            }
//            boolean status = st.execute(sql);
//            System.out.println(status);

            con.close();
            System.out.println("DB connection closed");


        } catch (Exception e) {
            throw new RuntimeException("something went wrong"+e);
        }

    }
}
class ConnectToDatabaseBYPreParedStatement{
    static int SId = 9;
    static int Marks = 399;
    static String Sname ="Mohit";

    static String url="jdbc:postgresql://localhost:5432/JavaJDBC";
    static String uname="postgres";
    static String pass="Subodh@2507";
    static String sql = "insert into \"Students\" values(?,?,?)";

    public ConnectToDatabaseBYPreParedStatement(int s ,int a ,String n) {
        this.SId = s;
        this.Marks= a;
        this.Sname=n;
    }

    public static void main(String[] args) {
        try{
            Connection con = DriverManager.getConnection(url,uname,pass);
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1,SId);
            ps.setInt(2,Marks);
            ps.setString(3,Sname);
            ps.execute();
            System.out.println("worked success");
            con.close();
        } catch (Exception e) {
            System.out.println("Something went wrong");

        }

    }
}
