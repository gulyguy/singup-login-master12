package com.victolee.signuplogin.domain.entity;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Entity
@Table
public class MemberEntity {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Column(length = 20, nullable = false)
    private String email;

    @Column(length = 100, nullable = false)
    private String password;

    @Column(length = 20, nullable = false)
    private String carnumber;

    @Column(length = 20, nullable = false)
    private Long phonenumber;

    @Builder
    public MemberEntity(Long id, String email, String password, String carnumber, Long phonenumber ) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.carnumber = carnumber;
        this.phonenumber = phonenumber;
    }
}