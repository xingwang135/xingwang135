//import java.sql.*;
//
//public class sqlconnection {
//    String driver = "com.mysql.cj.jdbc.Driver";
//    String url = "jdbc:mysql://39.103.182:3306/student";
//    String user = "root";
//    String password = "123";
//
//    public static void main(String[] args) {
//
//        new sqlconnection().insert();
//        new sqlconnection().select();
//    }
//
//    public void select(){
//        try {
//            Class.forName(driver);
//            Connection con = DriverManager.getConnection(url, user, password);
//            if (!con.isClosed())
//                System.out.println("Succeeded connecting to the Database!");
//            Statement statement = con.createStatement();
//            String sql = "select * from baseinformation";
//            ResultSet rs = statement.executeQuery(sql);
//            String name = null;
//            String id = null;
//            while (rs.next()) {
//                name = rs.getString("name");
//                id = rs.getString("id");
//                System.out.println(id + "\t" + name);
//            }
//            rs.close();
//            con.close();
//        } catch (ClassNotFoundException e) {
//            System.out.println("Sorry,can`t find the Driver!");
//            e.printStackTrace();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        } catch (Exception e) {
//            // TODO: handle exception
//            e.printStackTrace();
//        } finally {
//            System.out.println("数据库数据成功获取！！");
//        }
//    }
//
//    public void insert(){
//        try {
//            Class.forName(driver);
//            Connection con = DriverManager.getConnection(url, user, password);
//            if (!con.isClosed())
//                System.out.println("Succeeded connecting to the Database!");
//            Statement statement = con.createStatement();
//            String sql = "insert into baseinformation value(?,?)";
//            PreparedStatement ps=null;
//            ps=con.prepareStatement(sql);
//            ps.setString(1,"18031133");
//            ps.setString(2,"111");
//            ps.executeUpdate();
//            ps.close();
//            statement.close();
//            con.close();
//        }catch(SQLException se){
//            // 处理 JDBC 错误
//            se.printStackTrace();
//        }catch(Exception e){
//            // 处理 Class.forName 错误
//            e.printStackTrace();
//        }finally{
//            System.out.println("数据添加成功");
//        }
//
//    }
//
//}