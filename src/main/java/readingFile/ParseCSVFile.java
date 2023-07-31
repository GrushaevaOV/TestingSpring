package readingFile;

import object.QuestionAnswer;

import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ParseCSVFile implements Parser {

    public String filePath;

    public ParseCSVFile(String filePath) {
        this.filePath = filePath;
    }

    public ParseCSVFile() {
    }

    public List<QuestionAnswer> parseFile() {
        List <QuestionAnswer> questionAnswerList = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(Paths.get(filePath).toFile()))) {
            String line;
            Scanner scanner;
            int index = 0;
            while ((line = reader.readLine()) != null) {
                QuestionAnswer answerQuestion = new QuestionAnswer();
                scanner = new Scanner(line);
                scanner.useDelimiter(",");
                while (scanner.hasNext()) {
                    String data = scanner.next();
                    switch (index) {
                        case 0 -> answerQuestion.setNumber(Integer.parseInt(data));
                        case 1 -> answerQuestion.setQuestion(data);
                        case 2 -> answerQuestion.setEnumAnswer(data);
                        case 3 -> answerQuestion.setRigthAnswer(Integer.parseInt(data));
                        default -> System.out.println("Некорректные данные::" + data);
                    }
                    index++;
                }
                index = 0;
                questionAnswerList.add(answerQuestion);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return questionAnswerList;
    }
}
