package com.zhoushiya.bootlaunch.jpa.testdb2;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageRepository extends JpaRepository<Message,Long> {

}