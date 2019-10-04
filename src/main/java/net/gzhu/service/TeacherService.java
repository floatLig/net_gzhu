package net.gzhu.service;

import net.gzhu.bean.Teacher;
import net.gzhu.dao.TeacherDao;

/**
 * -zzl.
 *
 * @author : zzl
 * @version : 1.0
 */
public class TeacherService {
    /**
     * 联系上一层的TeacherDao层
     */
    TeacherDao teacherDao = new TeacherDao();

    /**
     * TeacherServlet层的teacherLogin,
     * @param teacherId 应为form表单的teacher_id
     * @param password 应为form表单的password
     * @return Teacher
     */
    public Teacher teacherLogin(String teacherId, String password){
        return teacherDao.teacherLogin(teacherId,password);
    }
}
