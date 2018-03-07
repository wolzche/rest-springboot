package com.example.demo.dao;

import com.example.demo.bean.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by wolzche on 2018/3/7.
 */
public interface  UserRepository extends JpaRepository<User, String> {

}
