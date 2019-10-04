package net.gzhu.dao;

import net.gzhu.bean.Teacher;
import net.gzhu.utils.JdbcUtils;

import java.lang.annotation.Target;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * -zzl.
 *
 * @author : zzl
 * @version : 1.0
 * @date : 2019-10-03 23:44
 */
public class TeacherDao {
    /**
     * 教师登录--> 条件查询
     * @param name 应为form表单的name属性值
     * @param password 应为form表单的password属性值
     * @return 返回的是bean的Teacher对象
     */
    public Teacher teacherLogin(String teacherId,String password){
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        Teacher teacher = new Teacher();
        try {
            con = JdbcUtils.getCon();

            String sql = "select * from teacher where teacher_id = ? and password = ?";
            ps = con.prepareStatement(sql);
            ps.setString(1,teacherId);
            ps.setString(2,password);

            rs = ps.executeQuery();
            while (rs.next()){
                //设置teacher信息，并判断该teacher是否为空，从而判断账号密码是否正确
                teacher.setTeacherId(rs.getString("teacher_id"));
                teacher.setPassword(rs.getString("password"));
            }

            //判断查询，若rs.getTeacher为null,则数据库中没有该信息，代表账号/密码错误
            if (teacher.getTeacherId() == null) {
                return null;
            }
            //若查询的到
            return teacher;
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JdbcUtils.close(rs,ps,con);
        }
        return null;
    }
}
