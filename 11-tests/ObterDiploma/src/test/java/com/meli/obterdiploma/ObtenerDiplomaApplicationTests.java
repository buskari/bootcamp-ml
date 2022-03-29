package com.meli.obterdiploma;

import com.meli.obterdiploma.model.StudentDTO;
import com.meli.obterdiploma.model.SubjectDTO;
import com.meli.obterdiploma.repository.IStudentDAO;
import com.meli.obterdiploma.service.ObterDiplomaService;
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

import static org.mockito.Mockito.when;

@SpringBootTest
@ExtendWith(MockitoExtension.class)
class ObetenerDiplomaApplicationTests {

	@Mock
	private IStudentDAO studentDAO;

	@InjectMocks
	private ObterDiplomaService obterDiplomaService;

	@Test
	void shouldReturnStudentWhenAnalyzeScores() {
		when(studentDAO.findById(Mockito.anyLong())).thenReturn(mockStudentDTO());
		obterDiplomaService.analyzeScores(Mockito.anyLong());
	}

	private List<SubjectDTO> mockListSubjectDTO() {
		return new ArrayList<>(Arrays.asList(
				new SubjectDTO(
						"fake_subject_name",
						9.0
				),
				new SubjectDTO(
						"fake_subject_name",
						9.0
				),
				new SubjectDTO(
						"fake_subject_name",
						9.0
				),
				new SubjectDTO(
						"fake_subject_name",
						9.0
				),
				new SubjectDTO(
						"fake_subject_name",
						9.0
				)
		));
	}

	private StudentDTO mockStudentDTO() {
		return new StudentDTO(
				384934923L,
				"fake_student_name",
				"fake_message",
				7.0,
				mockListSubjectDTO()
		);
	}
}