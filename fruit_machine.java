import java.util.*;

class bf1{

		// Gurcharn Singh : 2899330
	
	public static void main(String[] args)
	{
			// declaring two integer variables credit and choice to get input from user for showing menu.
		int credit,choice;
		
			// giving inital value of 10 to start the game with 10 credits for every new play.
		credit=10;
			
		Scanner in = new Scanner(System.in);
		Random r = new Random();
		
						// Game menu for users.
			System.out.println("\n     {============================================}");	
			System.out.println("    { ||**************  WELCOME  ***************|| }");
			System.out.println("   {  ||     Griffith College Fruit Machine     ||  }");
			System.out.println("  {   ||                                        ||   }");
			System.out.println(" {    ||               GAME MENU                ||    }");
			System.out.println("{  $  ||      -----------------------------     ||  $  }");
			System.out.println(" {    ||   Press 1. Display Remaining Credits   ||    }");
			System.out.println("  {   ||   Press 2. Play GAME                   ||   }");
			System.out.println("   {  ||   Press 3. Exit GAME                   ||  }");
			System.out.println("    { ||                                        || }");
			System.out.println("     {============================================}");
		
			// for getting input from user to enter into menu options.
		System.out.print("\n\tEnter Your Choice Number from Game menu : ");
		choice=in.nextInt();
		
		
		
		
					// loop for playing game again and again till user says to exit or if they have enough credit to play game again.
		while(choice==1 || choice==2 || ((choice != 1) && (choice != 2) && (choice != 3))) 
		{
			while(choice==1)  // if the user press 1 to check for remaining credits.
			{
				System.out.println("\n\tYour Remaining Credits are : "+credit+'\n'); // to show user's remaining credit.

												// to display game menu after showing user's remaining credit.
								System.out.println("\n     {============================================}");	
								System.out.println("    { ||**************  WELCOME  ***************|| }");
								System.out.println("   {  ||     Griffith College Fruit Machine     ||  }");
								System.out.println("  {   ||                                        ||   }");
								System.out.println(" {    ||               GAME MENU                ||    }");
								System.out.println("{  $  ||      -----------------------------     ||  $  }");
								System.out.println(" {    ||   Press 1. Display Remaining Credits   ||    }");
								System.out.println("  {   ||   Press 2. Play GAME                   ||   }");
								System.out.println("   {  ||   Press 3. Exit GAME                   ||  }");
								System.out.println("    { ||                                        || }");
								System.out.println("     {============================================}");
				
						// if statement, as per game policy to give 10 credits after getting two matching even numbers.
				System.out.print("\n\tEnter Your Choice Number from Game menu : ");
				choice=in.nextInt();
									// to divide screen from old play to new play.
				System.out.println("----------------------------------------------------------------------------");
				
			}
		
			while(choice==2) // if user press 2 to play game and this loop will work till user have credits more than zero.
			{
				
				credit--;  // to deduct 1 credit on each play of game.
				
				int x = r.nextInt(7) +1;	// integer x is declared to generate a random number between 1 to 7 on SPIN wheel 1.
				int y = r.nextInt(7) +1;	// integer y is declared to generate a random number between 1 to 7 on SPIN wheel 2.
				int z = r.nextInt(7) +1;	// integer z is declared to generate a random number between 1 to 7 on SPIN wheel 3.
				
							// to display game screen with three randomly generated integers on SPIN wheel 1,2 and 3.
				System.out.println("\n     {============================================}");		
				System.out.println("    { ||     Griffith College Fruit Machine     || }");
				System.out.println("   {  ||      _____________________________     ||  }");
				System.out.println("  {   ||     |  SPIN   |  SPIN   |  SPIN   |    ||   }");
				System.out.println(" {    ||     | Wheel 1 | Wheel 2 | wheel 3 |    ||    }");
				System.out.println("{  $  ||      ---------|---------|---------     ||  $  }");
				System.out.println(" {    ||     |    "+x+"    |    "+y+"    |    "+z+"    |    ||    }");
				System.out.println("  {   ||      _____________________________     ||   }");
				System.out.println("   {  ||                                        ||  }");
				System.out.println("    { ||                                        || }");
				System.out.println("     {============================================}");
				
							// to display three randomly generated numbers again to make it more understandable while playing game.
				System.out.println("\tNUMBERS  =>  "+x+" - "+y+" - "+z);  
				
				
						// if statement, as per game policy to add 150 credits for getting three 7.
				if(x==7 && y==7 && z==7)
				{
					credit=credit+150;
					System.out.println("\n\tYou got three 7.");
					System.out.println("\tHURRAY... You won 150 crdits.");
				}
				
						// if statement, as per game policy to add 80 credits for getting three matching numbers other than 7-7-7.
				else if(x==y && y==z && z==x && x!=7 && y!=7 && z!=7)
				{
					credit=credit+80;
					System.out.println("\n\tYou got 3 matching numbers(other than 7-7-7).");
					System.out.println("\tHURRAY... You won 80 crdits.");
				}
				
						// if statement, as per game policy to add 40 credits for getting 3 in a row sequential numbers.
				else if(y==x+1 && z==y+1)
				{
					credit=credit+40;
					System.out.println("\n\tYou got 3 in a row sequential order numbers.");
					System.out.println("\tHURRAY... You won 40 crdits.");
				}
				
						// if statement, as per game policy to add 25 credits for getting 3 in a row non-sequential order numbers.
				else if( (x==y+1 && z==x+1) || (z==y+1 && x==z+1) || (x==z+1 && y==x+1) || (y==z+1 && x==y+1) || (z==x+1 && y==z+1) ) 
				{
					credit=credit+25;
					System.out.println("\n\tYou got 3 in a row non-sequential order numbers.");
					System.out.println("\tHURRAY... You win 25 credits.");
				}
				
						// if statement, as per game policy to add 10 credits for getting two matching even numbers.
				else if((x%2==0 && (y==x || z==x)) || (y%2==0 && (z==y || x==y)) || (z%2==0 && (x==z || y==z)))
				{
					credit=credit+10;
					System.out.println("\n\tYou got two matching even numbers.");
					System.out.println("\tHURRAY... You won 10 crdits.");
				}
				
						// if statement, as per game policy to add 05 credits for getting two matching odd numbers.
				else if((x%2!=0 && (y==x || z==x)) || (y%2!=0 && (z==y || x==y)) || (z%2!=0 && (x==z || y==z)))
				{
					credit=credit+5;
					System.out.println("\n\tYou got two matching odd numbers.");
					System.out.println("\tHURRAY... You won 05 crdits.");
				}
				
						// if statement, as per game policy to add 02 credits for getting one 7.
				else if(x==7 || y==7 || z==7)
				{
					credit=credit+2;
					System.out.println("\n\tYou got one '7'.");
					System.out.println("\tHURRAY... You won 02 credits.");
				}
				
						// else statement if numbers generated didn't match statement above and user lose the game.			
				else
				{
					System.out.println("\n\tSorry... YOU LOSE..");
					System.out.println("\tBetter Luck Next Time... ");
				}
				
				while(credit<=0)  // loop to exit gamewith a game over message, if credits are leass than or equal to zero.
				{
					System.out.println("\n\t*******  GAME OVER :(  *******");
					System.out.println("\n\tOOPS...!! You don't have enough credit to play game..."+'\n');
					System.out.println("\n\tYour have "+credit+" credits."+'\n');					
					System.out.println("\n\tThank You for playing Game..."+'\n');
					System.out.println("\tHope You WIN more next time..."+'\n');
					System.out.println("\tBYE... BYE...");
					System.exit(0);
				}
				
							// to display user's total credit after playing game.
				System.out.println("\n\tYour have total "+credit+" credits remaining."+'\n');
				
										// to display game menu again after each play.
								System.out.println("\n     {============================================}");	
								System.out.println("    { ||**************  WELCOME  ***************|| }");
								System.out.println("   {  ||     Griffith College Fruit Machine     ||  }");
								System.out.println("  {   ||                                        ||   }");
								System.out.println(" {    ||               GAME MENU                ||    }");
								System.out.println("{  $  ||      -----------------------------     ||  $  }");
								System.out.println(" {    ||   Press 1. Display Remaining Credits   ||    }");
								System.out.println("  {   ||   Press 2. Play GAME                   ||   }");
								System.out.println("   {  ||   Press 3. Exit GAME                   ||  }");
								System.out.println("    { ||                                        || }");
								System.out.println("     {============================================}");
				
						
							// for getting input from user to enter into menu options.
				System.out.print("\n\tEnter Your Choice Number from Game menu : ");
				choice=in.nextInt();
								// to divide game screen from old play to new play.
				System.out.println("----------------------------------------------------------------------------");
				
				
			}
			
			
			while((choice != 1) && (choice != 2) && (choice != 3))  // loop if user enters wrong whoice from menu.
			{
												// to display a message of wrong choice entered in game screen with menu to choose and enter again.
								System.out.println("\n     {======================================}");	
								System.out.println("    { ||  Griffith College Fruit Machine  || }");
								System.out.println("   {  ||----------------------------------||  }");
								System.out.println("  {   ||        Sorry Wrong Choice ...    ||   }");
								System.out.println(" {    ||   Please enter your choice from  ||    }");
								System.out.println("{  $  ||           1 , 2 or 3             ||  $  }");
								System.out.println(" {    ||----------------------------------||    }");
								System.out.println("  {   ||            GAME MENU             ||   }");
								System.out.println("   {  ||    1. Display Remaining Credits  ||  }");
								System.out.println("    { ||    2. Play GAME    3. Exit GAME  || }");
								System.out.println("     {======================================}");
								
								// to get a input again from user to enter into choosed option.
				System.out.print("Enter Your Choice Number from Game menu : ");
				choice=in.nextInt();
								// to divide screen from old play to new play.
				System.out.println("----------------------------------------------------------------------------");
			}
		
				
		}
		
		
			while(choice==3)  // loop to exit the game.
			{
				System.out.println("\n\t!!..Exit GAME....!!\n\tHope You Have Enjoyed Playing This Game...");
				System.out.println("\n\tYour have total "+credit+" credits remaining."+'\n');
				System.out.println("\n\tThank You for playing Game..."+'\n');
				System.out.println("\tHope You WIN more next time..."+'\n');
				System.out.println("\tBYE... BYE...");
				System.exit(0);
			}
		
		
		
		
	}


}
// copyright reserved : 2015.
// This Game is completely made and devloped by GURCHARN SINGH SIKKA , student no.2899330 .
// B.sc 1st year Computer Programming Assignment 1.



