package com.example.project.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class region_waste {

    @Id
    private Long id;
    private String continent_eng_nm;
    private String sfty_notice_id;
}

