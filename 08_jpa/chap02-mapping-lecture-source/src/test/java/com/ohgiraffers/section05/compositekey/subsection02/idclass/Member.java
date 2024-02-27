package com.ohgiraffers.section05.compositekey.subsection02.idclass;

import jakarta.persistence.*;

@Entity(name = "member_section05_subsection02")
@Table(name = "tbl_member_section05_subsection02")
@IdClass(MemberPK.class)
public class Member {

    @Id
    @Column(name = "member_no")
    private int memberNo;

    @Id
    @Column(name = "member_id")
    private String memberId;

    @Column(name = "phone")
    private String phone;

    @Column(name = "address")
    private String address;


}
