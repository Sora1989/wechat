package com.zhiyong.wechat.dao;

import com.zhiyong.wechat.bean.Teacher;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeacherDao extends CrudRepository<Teacher,Long>{
}
