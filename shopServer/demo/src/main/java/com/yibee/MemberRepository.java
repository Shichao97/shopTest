package com.yibee;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yibee.entity.Member;

public interface MemberRepository  extends JpaRepository<Member,Integer>{

}
