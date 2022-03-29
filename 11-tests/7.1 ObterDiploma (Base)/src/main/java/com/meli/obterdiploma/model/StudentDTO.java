package com.meli.obterdiploma.model;

import lombok.Getter;
import lombok.Setter;
import org.jetbrains.annotations.NotNull;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.util.List;

@Getter @Setter

public class StudentDTO {
    @NotNull
    @Pattern(regexp = "^[A-Z][a-z]*", message = "O nome do aluno deve começar com letra maiúscula")
    @NotBlank(message = "O nome do aluno não pode ficar vazio")
    @Size(max = 50)
    String studentName;
    String message;
    Double averageScore;
    @NotEmpty(message = "A lista não pode estar vazia")
    List<SubjectDTO> subjects;
}
