package javaPracitce;

		import java.util.Scanner;
		 
		public class Bank {
		    int money = 0;
		    
		    public void printMenu()
		    {
		        System.out.println("-------------------------------------");
		        System.out.println("1.�Ա� | 2.��� | 3.�ܰ� | 4.����");
		        System.out.println("-------------------------------------");
		        System.out.print("���� > ");
		    }
		    
		    public void deposit()
		    {
		        Scanner scan = new Scanner(System.in);
		        int temp = 0;
		        System.out.print("���ݾ� > ");
		        temp = scan.nextInt();
		        money += temp;
		    }
		    
		    public void withdrawal()
		    {
		        Scanner scan = new Scanner(System.in);
		        int temp = 0;
		        System.out.print("��ݾ� > ");
		        temp = scan.nextInt();
		        if(temp>money)
		        {
		            System.out.println("�ܾ��� �����մϴ�.");
		        }
		        else
		        {
		            money -= temp;
		        }
		    }
		    
		    public void balance()
		    {
		        System.out.print("�ܰ� > ");
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
		                System.out.println("�����մϴ�.");
		            }
		            break;
		            default :
		            {
		                System.out.println("�߸� �Է��ϼ̽��ϴ�.");
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