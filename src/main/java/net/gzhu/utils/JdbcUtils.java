package net.gzhu.utils;

import java.sql.*;

/**
 * -zzl.
 *
 * @author : zzl
 * @version : 1.0
 */
public class JdbcUtils {
    //私有成员、方法都是静态的；只有静态才可以被直接调用
    private static String driver = "com.mysql.jdbc.Driver";

    private static String url = "jdbc:mysql://49.235.245.75:3306/school?serverTimezone=UTC";
    private static String user = "root";
    private static String password = "uber";


    /**
     * 封装连接信息
     * @return 连接后的对象Connection
     */
    public static Connection getCon() throws ClassNotFoundException, SQLException {
        //加载驱动
        Class.forName(driver);
        //建立连接
        Connection con = DriverManager.getConnection(url,user,password);
        return con;
    }

    /**
     * 封装关闭的方法
     * @param rs ResultSet,将被关闭
     * @param stm Statement,将被关闭
     * @param con Connection,将被关闭
     */
    public static void close(ResultSet rs, Statement stm, Connection con){
        if (rs != null) {
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (stm != null) {
            try {
                stm.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (con != null) {
            try {
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
