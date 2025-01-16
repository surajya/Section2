package com.EasyBytes.account.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;

@Getter @Setter @ToString @MappedSuperclass
public class BaseEntities {
    @Column(updatable = false)
    private String createdBy;

    @Column(updatable = false)
    private LocalDateTime createdAt;

   @Column(insertable = false)
    private String updatedBy;

    @Column(insertable = false)
    private LocalDateTime updatedAt;

}