package com.itheima.domain;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

//lombok
//@Getter
//@Setter
@Data
public class Book {
    private Integer id;
    private String type;
    private String name;
    private String description;
}
