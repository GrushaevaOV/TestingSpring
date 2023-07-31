package object;

public class QuestionAnswer {

    private int number;
    private String question;
    private String enumAnswer;
    private int rigthAnswer;

    public QuestionAnswer() {
    }

    public QuestionAnswer(int number, String question, String enumAnswer, int rigthAnswer) {
        this.number = number;
        this.question = question;
        this.enumAnswer = enumAnswer;
        this.rigthAnswer = rigthAnswer;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getEnumAnswer() {
        return enumAnswer;
    }

    public void setEnumAnswer(String enumAnswer) {
        this.enumAnswer = enumAnswer;
    }

    public int getRigthAnswer() {
        return rigthAnswer;
    }

    public void setRigthAnswer(int rigthAnswer) {
        this.rigthAnswer = rigthAnswer;
    }

    @Override
    public String toString() {
        return  number  + question+ "/n" +"Enum answer "+ enumAnswer ;
    }
}
