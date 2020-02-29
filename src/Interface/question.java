package Interface;

public abstract class question {

    int num1;
    int num2;
    String operator;
    int answer;
    boolean calculated;
    String questionType="Unknown";


    public abstract void Calculate();

    public question(String operator, String questionType) {
        this.operator = operator;
        this.questionType = questionType;
    }

    @Override
    public String toString() {
        return " questionType='" + questionType+","+num1+operator+num2+"=";
    }
}
