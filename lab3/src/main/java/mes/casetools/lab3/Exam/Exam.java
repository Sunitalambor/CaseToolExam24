package mes.casetools.lab3.Exam;

import org.springframework.stereotype.Service;

@Service
public class Exam {
    /**
     * The functions take an integer number, and returns true if the number
     * is even and false if its odd.
     * @param num
     * @return 
     */
    public boolean isEven(int num) {
        return num % 2 == 0;
    }
}
