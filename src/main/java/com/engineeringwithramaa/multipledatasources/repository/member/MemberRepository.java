package com.engineeringwithramaa.multipledatasources.repository.member;

import com.engineeringwithramaa.multipledatasources.model.member.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {
}
