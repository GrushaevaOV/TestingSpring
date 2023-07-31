package dao;

import object.QuestionAnswer;

import java.util.ArrayList;
import java.util.List;

public class QuestionAnswerDAO implements Dao<QuestionAnswer>{

    private List<QuestionAnswer> questionAnswerList= new ArrayList<>();

    @Override
    public List<QuestionAnswer> getAll() {
        return questionAnswerList;
    }

    @Override
    public void save(QuestionAnswer questionAnswer) {
    questionAnswerList.add(questionAnswer);
    }

    public void saveAll(List<QuestionAnswer> questionAnswers) {
        questionAnswerList.addAll(questionAnswers);
    }

    public void show(QuestionAnswer questionAnswer){
        System.out.println(questionAnswer.getNumber()+questionAnswer.getQuestion());
        System.out.println("Enum question "+questionAnswer.getEnumAnswer());
    }

}
