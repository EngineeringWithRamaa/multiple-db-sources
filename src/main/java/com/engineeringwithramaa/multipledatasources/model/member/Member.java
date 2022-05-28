package com.engineeringwithramaa.multipledatasources.model.member;

import javax.persistence.*;

@Entity
@Table(name = "member", schema = "memberdb")
public class Member {
    @Id
    private Long id;
    private String name;
    private String memberId;

    public Member() {
    }

    public Member(Long id, String name, String memberId) {
        this.id = id;
        this.name = name;
        this.memberId = memberId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    @Override
    public String toString() {
        return "Member{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", memberId='" + memberId + '\'' +
                '}';
    }
}