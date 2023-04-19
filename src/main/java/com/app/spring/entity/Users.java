package com.app.spring.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

@Data
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Users {

    private Integer rut;
    private String dv;
    private String nombre;
    private String apellido;
    private String email;

}
