package Com.itBulls.kunal;


import java.util.Arrays;






public class helloWorld {
		public static void main(String[] args) {
		
			Account accountFrom = new Account(1);
			Account accountTo = new Account(2);

			
			accountFrom.sendMoneyToAccount(accountTo, 100);
			accountTo.withdrawMoney(1000);
			
			System.out.println(Arrays.toString(accountFrom.getTransactions())    );
			System.out.println(Arrays.toString(accountTo.getTransactions()));
		
		
		
		}
}
		

