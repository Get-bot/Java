package object_oriented_type;

    public class Caltest {
       //필드
      int num1;
      int num2;
      int select;
       //생성자 함수
       Caltest() {
       }
       //set메서드
        void setNum1(int data) {num1 =data;}   
        void setNum2(int data) {num2 =data;}
        void setselect(int data) {select = data;}
       //get메서드
        int getNum1() {return num1;}
        int getNum2() {return num2;}
        int getselect() {return select;}
       //연산자 메서드
        int pls( ) {return num1+num2;}
        int min( ) {return num1-num2;}
        int mul( ) {return num1*num2;}
        int div( ) {return num1/num2;}
        
    }