package object_oriented_type;

    public class Caltest {
       //�ʵ�
      int num1;
      int num2;
      int select;
       //������ �Լ�
       Caltest() {
       }
       //set�޼���
        void setNum1(int data) {num1 =data;}   
        void setNum2(int data) {num2 =data;}
        void setselect(int data) {select = data;}
       //get�޼���
        int getNum1() {return num1;}
        int getNum2() {return num2;}
        int getselect() {return select;}
       //������ �޼���
        int pls( ) {return num1+num2;}
        int min( ) {return num1-num2;}
        int mul( ) {return num1*num2;}
        int div( ) {return num1/num2;}
        
    }