package Interface;

public class Addition extends question {


    public Addition(int num1, int num2) {
        super("+","addition");
        this.num1=num1;
        this.num2=num2;
    }

@Override
    public  void Calculate(){
      answer=num1+num2;
      this.calculated=true;
}

@Override
    public String toString(){
        if (calculated==true){
            return num1+operator+num2+"="+answer;
        }
        else {
          return super.toString();
        }

}












}
