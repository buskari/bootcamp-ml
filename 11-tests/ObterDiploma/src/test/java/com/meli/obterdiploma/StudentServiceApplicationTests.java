package com.meli.obterdiploma;

import com.meli.obterdiploma.model.StudentDTO;
import com.meli.obterdiploma.model.SubjectDTO;
import com.meli.obterdiploma.repository.IStudentDAO;
import com.meli.obterdiploma.repository.IStudentRepository;
import com.meli.obterdiploma.service.StudentService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.mockito.ArgumentMatchers.*;
import static org.mockito.Mockito.verify;

@SpringBootTest
@ExtendWith(MockitoExtension.class)
public class StudentServiceApplicationTests {

    @Mock
    private IStudentRepository studentRepository;

    @Mock
    private IStudentDAO studentDAO;

    @InjectMocks
    private StudentService studentService;

    @Test
    void shouldSaveStudent() {
        studentService.create(mockStudentDTO());
        verify(studentDAO).save(any(StudentDTO.class));
    }

    @Test
    void shouldReadStudent() {
        studentService.read(Mockito.anyLong());
        verify(studentDAO).findById(Mockito.anyLong());
    }

    @Test
    void shouldDeleteStudent() {
        studentService.delete(anyLong());
        verify(studentDAO).delete(anyLong());
    }

    @Test
    void shouldGetAllStudents() {
        studentService.getAll();
        verify(studentRepository).findAll();
    }

    private List<SubjectDTO> mockListSubjectDTO() {
        return new ArrayList<>(
            Arrays.asList(
                new SubjectDTO(
                    "any_subject",
                    9.0
                ),
                new SubjectDTO(
                    "any_subject",
                    9.0
                ),
                new SubjectDTO(
                    "any_subject",
                    9.0
                ),
                new SubjectDTO(
                    "any_subject",
                    9.0
                ),
                new SubjectDTO(
                    "any_subject",
                    9.0
                )
            )
        );
    }

    private StudentDTO mockStudentDTO() {
        return new StudentDTO(
            100000000000L,
            "any_name",
            "any_message",
            9.0,
            mockListSubjectDTO()
        );
    }
}
