package javaPracitce;

		import java.util.Scanner;
		 
		public class Bank {
		    int money = 0;
		    
		    public void printMenu()
		    {
		        System.out.println("-------------------------------------");
		        System.out.println("1.입금 | 2.출금 | 3.잔고 | 4.종료");
		        System.out.println("-------------------------------------");
		        System.out.print("선택 > ");
		    }
		    
		    public void deposit()
		    {
		        Scanner scan = new Scanner(System.in);
		        int temp = 0;
		        System.out.print("예금액 > ");
		        temp = scan.nextInt();
		        money += temp;
		    }
		    
		    public void withdrawal()
		    {
		        Scanner scan = new Scanner(System.in);
		        int temp = 0;
		        System.out.print("출금액 > ");
		        temp = scan.nextInt();
		        if(temp>money)
		        {
		            System.out.println("잔액이 부족합니다.");
		        }
		        else
		        {
		            money -= temp;
		        }
		    }
		    
		    public void balance()
		    {
		        System.out.print("잔고 > ");
		        System.out.println(money);
		    }
		 
		    public void choiceMenu()
		    {
		        int selection = 0;
		        do
		        {
		            Scanner scan = new Scanner(System.in);
		            printMenu();
		            selection = scan.nextInt();
		            switch(selection)
		            {
		            case 1:
		            {
		                deposit();
		            }
		            break;
		            case 2:
		            {
		                withdrawal();
		            }
		            break;
		            case 3:
		            {
		                balance();
		            }
		            break;
		            case 4:
		            {
		                System.out.println("종료합니다.");
		            }
		            break;
		            default :
		            {
		                System.out.println("잘못 입력하셨습니다.");
		            }
		            break;
		            }
		        } while(selection != 4);
		    }
		 
		    public static void main(String args[])
		    {
		        Bank bank = new Bank();
		        bank.choiceMenu();
		    }
		}