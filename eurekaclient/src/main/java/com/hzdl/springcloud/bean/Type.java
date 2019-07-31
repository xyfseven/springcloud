package com.hzdl.springcloud.bean;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString(exclude = "id")
public class Type {
    private Integer id;
    private String name;
}
