package com.EasyBytes.account.entities;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;

@Getter @Setter @ToString @MappedSuperclass
public class BaseEntities {
    @Column(insertable = false)
    private String created_by;
    @Column(updatable = false)
    private LocalDateTime created_at;
    @Column(insertable = false, updatable = false)
    private String updated_by;
    @Column(insertable = false)
    private LocalDateTime updated_at;

}