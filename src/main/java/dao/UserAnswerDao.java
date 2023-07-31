package dao;

import java.util.ArrayList;
import java.util.List;

public class UserAnswerDao implements Dao<Integer>{

    private List<Integer> userAnswerList = new ArrayList<>();

    @Override
    public List<Integer> getAll() {
        return userAnswerList;
    }

    @Override
    public void save(Integer userAnswer) {
        userAnswerList.add(userAnswer);
    }

}
