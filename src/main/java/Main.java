import activ.Testing;
import object.QuestionAnswer;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
       ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );
        Testing testing=context.getBean("testingBean", Testing.class);
        testing.showQuestionEnumAnswer();
        System.out.println(testing.result());

        context.close();

    }
}
