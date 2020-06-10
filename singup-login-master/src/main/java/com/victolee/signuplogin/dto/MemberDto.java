package com.victolee.signuplogin.dto;

import com.victolee.signuplogin.domain.entity.MemberEntity;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class MemberDto {
    private Long id;
    private String email;
    private String password;
    private String carnumber;
    private Long phonenumber;
    private LocalDateTime createdDate;
    private LocalDateTime modifiedDate;

    public MemberEntity toEntity(){
        return MemberEntity.builder()
                .id(id)
                .email(email)
                .password(password)
                .carnumber(carnumber)
                .phonenumber(phonenumber)
                .build();
    }

    @Builder
    public MemberDto(Long id, String email, String password, String carnumber, Long phonenumber) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.carnumber = carnumber;
        this.phonenumber = phonenumber;
    }
}
