import java.sql.*;

public class Main {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/topic4sql?serverTimezone=UTC&useSSL=false";
        String user = "root";
        String password = "1234";

        try {
            Connection conexion = DriverManager.getConnection(url, user, password);
            Statement statement = conexion.createStatement();
            String query="select tc.first_name as name, wkd.weekday, sct.start_time, sct.end_time, cs.name from teacher tc\n" +
                    "\tinner join course cs \n" +
                    "    on tc.idteacher=cs.teacher_idteacher\n" +
                    "    inner join schedule_time sct \n" +
                    "    on cs.idcourse = sct.course_idcourse\n" +
                    "    inner join weekday wkd\n" +
                    "    on wkd.idweekday=sct.weekday_idweekday\n" +
                    "    where tc.idteacher=1\n" +
                    "    order by wkd.idweekday, sct.start_time;";
            ResultSet resultSet = statement.executeQuery(query);

            System.out.println("Teacher name    "+"Weekday  "+"start hour   "+"end hour     "+"course name");

            while(resultSet.next()){
                System.out.println(resultSet.getString(1)+" "+resultSet.getString(2)+"   "+resultSet.getString(3)+"   "+resultSet.getString(4)+"       "+resultSet.getString(5));

            }


        }catch (SQLException e){
            System.out.println(e);
        }
    }
}
