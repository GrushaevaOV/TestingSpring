package activ;

import dao.QuestionAnswerDAO;
import dao.UserAnswerDao;
import object.QuestionAnswer;
import readingFile.Parser;

import java.util.Scanner;

public class Testing {

    private final QuestionAnswerDAO questionAnswerDAO;
    private final UserAnswerDao userAnswerDao;
    private Parser parser;

    public Testing(QuestionAnswerDAO questionAnswerDAO, UserAnswerDao userAnswerDao, Parser parser) {
        this.questionAnswerDAO = questionAnswerDAO;
        this.userAnswerDao = userAnswerDao;
        this.parser = parser;
    }

    public void addQuestionAnswer() {
        questionAnswerDAO.saveAll(parser.parseFile());
    }

    public void showQuestionEnumAnswer() {
        addQuestionAnswer();
        for (QuestionAnswer questionAnswer : questionAnswerDAO.getAll()) {
            questionAnswerDAO.show(questionAnswer);
            Scanner scanner = new Scanner(System.in);
            int userAnswer = scanner.nextInt();
            saveAnswerUser(userAnswer);
        }
    }

    public void saveAnswerUser(int userAnswer) {
        userAnswerDao.save(userAnswer);
    }

    public String result() {
        int result = 0;
        for (int i = 0; i < questionAnswerDAO.getAll().size(); i++) {
            if (userAnswerDao.getAll().get(i).equals(questionAnswerDAO.getAll().get(i).getRigthAnswer())) {
                result++;
            }
        }
        return "Your result " + 100 * result / questionAnswerDAO.getAll().size() + "%";
    }
}
