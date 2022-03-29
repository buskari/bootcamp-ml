package com.meli.obterdiploma.model;

import lombok.Getter;
import lombok.Setter;
import org.jetbrains.annotations.NotNull;

import javax.validation.constraints.*;

@Getter @Setter
public class SubjectDTO {
    @NotNull
    @NotEmpty(message = "A matéria não pode ficar vazia")
    @Size(max = 30)
    String name;
    @NotEmpty(message = "A nota não pode estar vazia")
    @Min(value = 0, message = "A nota mínima é 0,0")
    @Max(value = 10, message = "A nota máxima é 10,0")
    Double score;
}
