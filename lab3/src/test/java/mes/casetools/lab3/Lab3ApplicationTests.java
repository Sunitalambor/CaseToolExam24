package mes.casetools.lab3;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import mes.casetools.lab3.Exam.Exam;



@SpringBootTest
class Lab3ApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	void assertAdd(){
		Exam exam = new Exam();
		assertEquals(true, exam.isEven(4));
	}

}
