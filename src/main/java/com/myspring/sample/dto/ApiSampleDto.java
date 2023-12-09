package com.myspring.sample.dto;

import lombok.*;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
//@Builder
public class ApiSampleDto {
    private Long sampleId;
    private String email;
    private String password;
}
