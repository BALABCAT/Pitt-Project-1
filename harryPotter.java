//Catherine balaban
//Pitt Program 1
//pd 8

import java.util.Scanner; //set up scanner class

public class harryPotter
{
   public static void main (String[] args)
   
   {
   int cCSingle = 10, cCBag = 55, cFrogs = 20, bBSmall = 50, bBLarge = 75; // prices for non DA members
   int xCCSingle = 10, xCCBag = 50, xCFrogs = 15, xBBSmall = 50, xBBLarge = 50; //prices for DA members
   int totalCakesSingle = 0, totalCakesBags = 0, totalFrogs = 0, totalBeerSmall = 0, totalBeerLarge = 0, chance = 1,cakes = 0, bags = 0; //total number of each product ordered
   int fCakesSingle = 0, fCakeBags = 0, fFrogs = 0, fBeerSmall = 0, fBeerLarge = 0, amountDue = 0, fDiscount = 0; //final prices
   double total = 0, discount = 0, totalKnuts = 0, totalSickles = 0, totalGalleons = 0, totalChange = 0, totalChangeSickles = 0, totalChangeDue = 0, knutSickles = 0, knutGalleons, knuts = 0, sickles = 0, galleons = 0;
   int answer = 0, time = 0; // to get customers answer
   String password;
   Scanner keyboard = new Scanner (System.in); //set up scanner 
   do
   {
   System.out.print ("Is there a customer waiting to be waited on? Put 1 for yes or 2 for No: "); // find out if there is a customer in line
   answer = keyboard.nextInt();
   
   if (answer == 1)
      {
      System.out.print ("Hello do you have a Dumbledoor's Army pasword? Put 1 for yes or 2 for no: "); // fimd out if the customer needs a discount
      answer = keyboard.nextInt();
               keyboard.nextLine();
         if (answer == 1)
            {
            System.out.print ("Okay please enter the correct password."); // have the user enter the password 
            password = keyboard.nextLine();                               //  find out if they recieve a discount
            chance++;
           
            if (password.equals("buckbeak"))
               {
                System.out.println ("That password is correct enjoy A bag of Cauldron Cakes for 50 knuts \n" +  //print ou the discounted prices
                                    "Chocolate Frogs for 15 knuts each \n" +
                                    "Both small and large Butterbeers for 50 knuts \n" +
                                    "and an overall discoutn of 10% if you spend 10 sickles (290 knuts) or more!");
               do 
                {
                System.out.println ("Please choose an option: "); // give user options to choose from 
                System.out.println ("   1) Update Cauldron Cake order");
                System.out.println ("   2) Update Chocolate Frogs order");
                System.out.println ("   3) Update Butterbeer order" );
                System.out.println ("   4) Check out" );    
                
                answer = keyboard.nextInt();
                
               if (answer == 1)
               {
                  System.out.println ("Please input how many Cauldron cakes you would like: "); //find out how many CC the customer wants
                  totalCakesSingle = keyboard.nextInt();
                 
                  if (totalCakesSingle >= 0)  // if someone enters a correct positive number 
                  {
                  System.out.println ("You have purchased " + totalCakesSingle + " Cauldron Cakes"); //list out how many CCs the customer has purchased
                  }
                 
                  else
                   {
                   System.out.println ("You have entered an invalid number Goodbye."); // if someone tries to enter a negative number
                   System.exit(0); //end program
                   }
                 }
                 
                 else if (answer == 2) //if they select Chocolate Frogs
                  {
                   System.out.println ("Please input how many Chocolate Frogs you would like: "); // find out how many CFs the customer wants
                   totalFrogs = keyboard.nextInt();
                   
                     if (totalFrogs >= 0) // if someone enters a correct positive number
                       {
                       System.out.println ("You have purchased " + totalFrogs + " chocolate frogs."); // list how many CFs the customer has ordered
                       }
                   
                     else 
                     {
                      System.out.println ("You have entered an invalid number Goodbye."); // if someone tried to enter a negative number 
                      System.exit(0); //end program
                     }
                  }
                   
                  else if (answer == 3) // if someone selects butterbeer
                   {
                   System.out.println ("Please select an option: "); //let them choose a large or small butterbeer
                   System.out.println (" 1) Large Butterbeer");
                   System.out.println (" 2) Small Butterbeer");
                   answer = keyboard.nextInt();
                   
                     if (answer == 1) //if the customer wants a large butterbeer
                     { 
                      System.out.println ("Please enter how many Large Butterbeers you would like: "); // to find out how many large BBs the customer wants
                      totalBeerLarge = keyboard.nextInt();
                    
                        if (totalBeerLarge >= 0) // if the customer enters a valid positive number
                        {
                        System.out.println ("You have purchased " + totalBeerLarge + " Large Butterbeers."); //list how many Large BBs the customer has ordered
                        }
                     
                         else 
                        {
                         System.out.println ("You have entered an inavlid number goodbye.");//if someone enters a negative number
                         System.exit(0); //end program
                        } 
                     }
                   
                     else if (answer == 2) //if the customer wants a small BB
                     {
                      System.out.println ("Please enter how many Small Butterbeers you would like: "); // Fine out how many small BBs customer wants
                      totalBeerSmall = keyboard.nextInt();
                      
                        if (totalBeerSmall >= 0) // if the customer enters a valid positive number
                        {
                        System.out.println ("You have purchased " + totalBeerSmall + " Small Butterbeers."); //list how many Large BBs the customer has ordered
                        }
                     
                         else 
                        {
                         System.out.println ("You have entered an inavlid number goodbye.");//if someone enters a negative number
                         System.exit(0); //end program
                        } 
                     
                     }
                     
                     else 
                     {
                        System.out.println ("You have entered an invalid number.  Goodbye.");
                        System.exit(0);
                     }
                    }
                   else if (answer == 4) // if user hits check out
                  {
                  // lots and lots of equations!!!!
                  totalCakesBags = totalCakesSingle/6;
                  totalCakesSingle = totalCakesSingle - (totalCakesBags * 6);
                  
                  fCakesSingle = xCCSingle * totalCakesSingle;
                  fCakeBags = xCCBag * totalCakesBags;
                  fFrogs = xCFrogs * totalFrogs;
                  fBeerSmall = xBBSmall * totalBeerSmall;
                  fBeerLarge = xBBLarge * totalBeerLarge;
                  total = fCakesSingle + fCakeBags + fFrogs + fBeerSmall + fBeerLarge;
                  if (total >= 290)
                  {
                  total = total * .9;
                  discount = total - discount; //calculate customers discount if eligable
                  }
                  else
                  {
                  discount = 0;
                  }
                  // print customers recipt 
                  System.out.println ("You have purchased " + totalCakesBags + " Cauldron Cake Bags for " + fCakeBags + " knuts");
                  System.out.println ("You have purchased " + totalCakesSingle + " Single Cauldron Cakes for " + fCakesSingle + " knuts");
                  System.out.println ("You have purchased " + totalFrogs + " Chocolate Frogs for " + fFrogs + " knuts");
                  System.out.println ("You have purchased " + totalBeerSmall + " Small Butterbeers for " + fBeerSmall + " knuts");
                  System.out.println ("You have purchased " + totalBeerLarge + " Large Butterbeers for " + fBeerLarge + " knuts");
                  System.out.println ("------------------------------------------------------------------");
                  System.out.println ("Your total is " + total + " knuts.");
                  System.out.println ("You recieved a discount of " + discount + " knuts");
                  
                  System.out.println (" How would you like to pay for your purchase? ");
                  System.out.println (" 1) knuts");
                  System.out.println (" 2) sickles");
                  System.out.println (" 3) galleons");
                  System.out.println ("Please note the following: ");
                  System.out.println (" A) We appreciate exact change!");
                  System.out.println (" B) Operator does not have more than 20 Galleons on the cart at any time!");
                  System.out.println (" C) Recall our currency options:");
                  System.out.println ("29 Knuts == 1 Sickle");
                  System.out.println ("17 Sickles == 1 Galleon == 493 Knuts");
                  
                  answer = keyboard.nextInt();
                  
                  if (answer == 1) // if customer chooses to pay with knuts
                  {
                    System.out.println ("Please enter the amount of knuts you wish to pay with: ");
                    totalKnuts = keyboard.nextInt();
                    
                    
                    
                    
                    
                     if (totalKnuts > total) //if customer needs change
                     {
                     totalChange = totalKnuts - total;
                     
                     System.out.println ("Thank you for your purchase here is " + totalChange + " knuts in change");
                     break ;
                     }
                    
                     else if (totalKnuts < total)// if the user enters too little money
                     {
                       System.out.println ("That number is too low. Goodbye.");
                       System.exit(0);
                     }
                     
                     else // if user gives exact change
                     {
                        System.out.println ("Thank you for gving exact change it is greatly appreciated.  Enjoy your day and thank you for shopping.");
                       break;
                     }
                  
                  }
                  
                  else if (answer == 2) // if customer decides to pay with Sickles
                  {
                  System.out.println ("Please enter the amount of sickles you would like to pay with: ");
                  totalSickles = keyboard.nextInt();
                  
                 
                 
                  //calculate change that is due
              	knuts = totalSickles * 29;



                  if (knuts > total ) //if requires change
                  {
                  knuts = knuts - total;
                  
                  if ( knuts >= 493)
                {
                  do
                {
                   knuts = knuts - 493;
                   galleons ++;
                } while (knuts >= 493);

                do
               {
                  knuts = knuts - 29;
                  sickles ++;
               } while (knuts >= 29);
               
               System.out.println ("Your toatl change is " + knuts + " knuts, " + sickles + " sickles and " + galleons + " galleons thank you for your purchase.");
               break;
               }
             else if (knuts >= 29 && knuts < 493)
	            {
	              do
	            { knuts = knuts - 29;
	                sickles ++;
	             } while (knuts >= 29);
                
                System.out.println ("Your total change is " + knuts + " knuts and " + sickles + " sickles.  Thank you for your purchase.");
                break;
	             }
              else 
               {
               
               System.out.println ("Your total change is " + knuts + " knuts.  Thank you for your purchase.");
               break;
               }
                  
              }
                  else if (knutSickles < total) // if the customer eneters too little money
                  {
                     System.out.println ("That number is too low.  Goodbye.");
                     System.exit(0);
                  }
                  
                  else // if the customer gives exact change
                  {
                     System.out.println ("Thank you for giving exact change it is greatly appreciated.  Enjoy your day and thank you for shopping.");
                     break;
                  } 
                  }
                  
                  else if (answer == 3) // if the customer decided to pay with galleons
                  {
                  System.out.println (" Please enter the number of gallions you wish to pay with: ");
                  totalGalleons = keyboard.nextInt();
                  // calculate the change needed
                  knuts = totalGalleons * 493;
                                   
                  if (knuts > total) // if change is required
                  {
                       if (knuts > total ) //if requires change
                  {
                  knuts = knuts - total;
                  
                  if ( knuts >= 493)
                {
                  do
                {
                   knuts = knuts - 493;
                   galleons ++;
                } while (knuts >= 493);

                do
               {
                  knuts = knuts - 29;
                  sickles ++;
               } while (knuts >= 29);
               
               System.out.println ("Your toatl change is " + knuts + " knuts, " + sickles + " sickles and " + galleons + " galleons thank you for your purchase.");
               break;
               }
             else if (knuts >= 29 && knuts < 493)
	            {
	              do
	            { knuts = knuts - 29;
	                sickles ++;
	             } while (knuts >= 29);
                
                System.out.println ("Your total change is " + knuts + " knuts and " + sickles + " sickles.  Thank you for your purchase.");
                break;
	             }
              else 
               {
               
               System.out.println ("Your total change is " + knuts + " knuts.  Thank you for your purchase.");
               break;
               }
                  
              }

                  
                  }
                  else if (knuts < total) // if the user enters too little money
                  {
                     System.out.println ("That number is too low.  Goodbye.");
                     System.exit(0);
                  }
                  
                  else // if the user provides exact change
                  {
                     System.out.println ("Thank you for giving exact change it is greatly appreciated.  Enjoy your day and thank you for shopping.");
                     break;
                  } 

                  
                  }
                      
                
                }
                 
                }while (answer == 1 || answer == 2 || answer == 3 || answer == 4);//so the loop will end once check out is selected
                
                }                     
                
                
                
     // -----------------------------------------------------------------------------------------------------------           
            else if (chance == 2) //if they miss the passowrd once 
               {
                  System.out.println("please try again");
                  System.out.println("please enter the correct password.");
                  password = keyboard.nextLine();
                  
                  if (password.equals("buckbeak"))
               {
                System.out.println ("That password is correct  enjoy A bag of Cauldron Cakes for 50 knuts \n" +  //print ou the discounted prices
                                    "Chocolate Frogs for 15 knuts each \n" +
                                    "Both small and large Butterbeers for 50 knuts \n" +
                                    "and an overall discoutn of 10% if you spend 10 sickles (290 knuts) or more!");
               do 
                {
                System.out.println ("Please choose an option: "); // give user options to choose from 
                System.out.println ("   1) Update Cauldron Cake order");
                System.out.println ("   2) Update Chocolate Frogs order");
                System.out.println ("   3) Update Butterbeer order" );
                System.out.println ("   4) Check out" );    
                
                answer = keyboard.nextInt();
                
               if (answer == 1)
               {
                  System.out.println ("Please input how many Cauldron cakes you would like: "); //find out how many CC the customer wants
                  totalCakesSingle = keyboard.nextInt();
                 
                  if (totalCakesSingle >= 0)  // if someone enters a correct positive number 
                  {
                  System.out.println ("You have purchased " + totalCakesSingle + " Cauldron Cakes"); //list out how many CCs the customer has purchased
                  }
                 
                  else
                   {
                   System.out.println ("You have entered an invalid number Goodbye."); // if someone tries to enter a negative number
                   System.exit(0); //end program
                   }
                 }
                 
                 else if (answer == 2) //if they select Chocolate Frogs
                  {
                   System.out.println ("Please input how many Chocolate Frogs you would like: "); // find out how many CFs the customer wants
                   totalFrogs = keyboard.nextInt();
                   
                     if (totalFrogs >= 0) // if someone enters a correct positive number
                       {
                       System.out.println ("You have purchased " + totalFrogs + " chocolate frogs."); // list how many CFs the customer has ordered
                       }
                   
                     else 
                     {
                      System.out.println ("You have entered an invalid number Goodbye."); // if someone tried to enter a negative number 
                      System.exit(0); //end program
                     }
                  }
                   
                  else if (answer == 3) // if someone selects butterbeer
                   {
                   System.out.println ("Please select an option: "); //let them choose a large or small butterbeer
                   System.out.println (" 1) Large Butterbeer");
                   System.out.println (" 2) Small Butterbeer");
                   answer = keyboard.nextInt();
                   
                     if (answer == 1) //if the customer wants a large butterbeer
                     { 
                      System.out.println ("Please enter how many Large Butterbeers you would like: "); // to find out how many large BBs the customer wants
                      totalBeerLarge = keyboard.nextInt();
                    
                        if (totalBeerLarge >= 0) // if the customer enters a valid positive number
                        {
                        System.out.println ("You have purchased " + totalBeerLarge + " Large Butterbeers."); //list how many Large BBs the customer has ordered
                        }
                     
                         else 
                        {
                         System.out.println ("You have entered an inavlid number goodbye.");//if someone enters a negative number
                         System.exit(0); //end program
                        } 
                     }
                   
                     else if (answer == 2) //if the customer wants a small BB
                     {
                      System.out.println ("Please enter how many Small Butterbeers you would like: "); // Fine out how many small BBs customer wants
                      totalBeerSmall = keyboard.nextInt();
                      
                        if (totalBeerSmall >= 0) // if the customer enters a valid positive number
                        {
                        System.out.println ("You have purchased " + totalBeerSmall + " Small Butterbeers."); //list how many Large BBs the customer has ordered
                        }
                     
                         else 
                        {
                         System.out.println ("You have entered an inavlid number goodbye.");//if someone enters a negative number
                         System.exit(0); //end program
                        } 
                     
                     }
                     
                     else 
                     {
                        System.out.println ("You have entered an invalid number.  Goodbye.");
                        System.exit(0);
                     }
                    }
                   else if (answer == 4) // if user hits check out
                  {
                  // lots and lots of equations!!!!
                  totalCakesBags = totalCakesSingle/6;
                  totalCakesSingle = totalCakesSingle - (totalCakesBags * 6);
                  
                  fCakesSingle = xCCSingle * totalCakesSingle;
                  fCakeBags = xCCBag * totalCakesBags;
                  fFrogs = xCFrogs * totalFrogs;
                  fBeerSmall = xBBSmall * totalBeerSmall;
                  fBeerLarge = xBBLarge * totalBeerLarge;
                  total = fCakesSingle + fCakeBags + fFrogs + fBeerSmall + fBeerLarge;
                  if (total >= 290)
                  {
                  total = total * .9;
                  discount = total - discount; //calculate customers discount if eligable
                  }
                  else
                  {
                  discount = 0;
                  }
                  // print customers recipt 
                  System.out.println ("You have purchased " + totalCakesBags + " Cauldron Cake Bags for " + fCakeBags + " knuts");
                  System.out.println ("You have purchased " + totalCakesSingle + " Single Cauldron Cakes for " + fCakesSingle + " knuts");
                  System.out.println ("You have purchased " + totalFrogs + " Chocolate Frogs for " + fFrogs + " knuts");
                  System.out.println ("You have purchased " + totalBeerSmall + " Small Butterbeers for " + fBeerSmall + " knuts");
                  System.out.println ("You have purchased " + totalBeerLarge + " Large Butterbeers for " + fBeerLarge + " knuts");
                  System.out.println ("------------------------------------------------------------------");
                  System.out.println ("Your total is " + total + " knuts.");
                  System.out.println ("You recieved a discount of " + discount + " knuts");
                  
                  System.out.println (" How would you like to pay for your purchase? ");
                  System.out.println (" 1) knuts");
                  System.out.println (" 2) sickles");
                  System.out.println (" 3) galleons");
                  System.out.println ("Please note the following: ");
                  System.out.println (" A) We appreciate exact change!");
                  System.out.println (" B) Operator does not have more than 20 Galleons on the cart at any time!");
                  System.out.println (" C) Recall our currency options:");
                  System.out.println ("29 Knuts == 1 Sickle");
                  System.out.println ("17 Sickles == 1 Galleon == 493 Knuts");
                  
                  answer = keyboard.nextInt();
                  
                  if (answer == 1) // if customer chooses to pay with knuts
                  {
                    System.out.println ("Please enter the amount of knuts you wish to pay with: ");
                    totalKnuts = keyboard.nextInt();
                    
                    
                    
                    
                    
                     if (totalKnuts > total) //if customer needs change
                     {
                     totalChange = totalKnuts - total;
                     
                     System.out.println ("Thank you for your purchase here is " + totalChange + " knuts in change");
                     break ;
                     }
                    
                     else if (totalKnuts < total)// if the user enters too little money
                     {
                       System.out.println ("That number is too low. Goodbye.");
                       System.exit(0);
                     }
                     
                     else // if user gives exact change
                     {
                        System.out.println ("Thank you for gving exact change it is greatly appreciated.  Enjoy your day and thank you for shopping.");
                       break;
                     }
                  
                  }
                  
                  else if (answer == 2) // if customer decides to pay with Sickles
                  {
                  System.out.println ("Please enter the amount of sickles you would like to pay with: ");
                  totalSickles = keyboard.nextInt();
                  
                 
                 
                  //calculate change that is due
              	knuts = totalSickles * 29;



                  if (knuts > total ) //if requires change
                  {
                  knuts = knuts - total;
                  
                  if ( knuts >= 493)
                {
                  do
                {
                   knuts = knuts - 493;
                   galleons ++;
                } while (knuts >= 493);

                do
               {
                  knuts = knuts - 29;
                  sickles ++;
               } while (knuts >= 29);
               
               System.out.println ("Your toatl change is " + knuts + " knuts, " + sickles + " sickles and " + galleons + " galleons thank you for your purchase.");
               break;
               }
             else if (knuts >= 29 && knuts < 493)
	            {
	              do
	            { knuts = knuts - 29;
	                sickles ++;
	             } while (knuts >= 29);
                
                System.out.println ("Your total change is " + knuts + " knuts and " + sickles + " sickles.  Thank you for your purchase.");
                break;
	             }
              else 
               {
               
               System.out.println ("Your total change is " + knuts + " knuts.  Thank you for your purchase.");
               break;
               }
                  
              }
                  else if (knutSickles < total) // if the customer eneters too little money
                  {
                     System.out.println ("That number is too low.  Goodbye.");
                     System.exit(0);
                  }
                  
                  else // if the customer gives exact change
                  {
                     System.out.println ("Thank you for giving exact change it is greatly appreciated.  Enjoy your day and thank you for shopping.");
                     break;
                  } 
                  }
                  
                  else if (answer == 3) // if the customer decided to pay with galleons
                  {
                  System.out.println (" Please enter the number of gallions you wish to pay with: ");
                  totalGalleons = keyboard.nextInt();
                  // calculate the change needed
                  knuts = totalGalleons * 493;
                                   
                  if (knuts > total) // if change is required
                  {
                       if (knuts > total ) //if requires change
                  {
                  knuts = knuts - total;
                  
                  if ( knuts >= 493)
                {
                  do
                {
                   knuts = knuts - 493;
                   galleons ++;
                } while (knuts >= 493);

                do
               {
                  knuts = knuts - 29;
                  sickles ++;
               } while (knuts >= 29);
               
               System.out.println ("Your toatl change is " + knuts + " knuts, " + sickles + " sickles and " + galleons + " galleons thank you for your purchase.");
               break;
               }
             else if (knuts >= 29 && knuts < 493)
	            {
	              do
	            { knuts = knuts - 29;
	                sickles ++;
	             } while (knuts >= 29);
                
                System.out.println ("Your total change is " + knuts + " knuts and " + sickles + " sickles.  Thank you for your purchase.");
                break;
	             }
              else 
               {
               
               System.out.println ("Your total change is " + knuts + " knuts.  Thank you for your purchase.");
               break;
               }
                  
              }

                  
                  }
                  else if (knuts < total) // if the user enters too little money
                  {
                     System.out.println ("That number is too low.  Goodbye.");
                     System.exit(0);
                  }
                  
                  else // if the user provides exact change
                  {
                     System.out.println ("Thank you for giving exact change it is greatly appreciated.  Enjoy your day and thank you for shopping.");
                     break;
                  } 

                  
                  }
                      
                
                }
                 
                }while (answer == 1 || answer == 2 || answer == 3 || answer == 4);//so the loop will end once check out is selected
                
                }                     
                

                         else // if customer enters the wrong password twice
            {
               System.out.println ("Sorry that passowrd is incorrect, please enjoy our normal prices. "); //print out the regular prices 
               System.out.println ("A single Cauldron Cake: 10 knuts");
               System.out.println ("A bag of Cauldron Cakes (contains 6 cakes): 55 knuts");
               System.out.println ("Chocolate Frogs : 20 knuts each");
               System.out.println ("A small Butterbeer: 50 knuts");
               System.out.println ("A large Buterbeer: 75 knuts");  
             do 
                {
                System.out.println ("Please choose an option: "); // give user options to choose from 
                System.out.println ("   1) Update Cauldron Cake order");
                System.out.println ("   2) Update Chocolate Frogs order");
                System.out.println ("   3) Update Butterbeer order" );
                System.out.println ("   4) Check out" );    
                
                answer = keyboard.nextInt();
                
               if (answer == 1)
               {
                  System.out.println ("Please input how many Cauldron cakes you would like: "); //find out how many CC the customer wants
                  totalCakesSingle = keyboard.nextInt();
                 
                  if (totalCakesSingle >= 0)  // if someone enters a correct positive number 
                  {
                  System.out.println ("You have purchased " + totalCakesSingle + " Cauldron Cakes"); //list out how many CCs the customer has purchased
                  }
                 
                  else
                   {
                   System.out.println ("You have entered an invalid number Goodbye."); // if someone tries to enter a negative number
                   System.exit(0); //end program
                   }
                 }
                 
                 else if (answer == 2) //if they select Chocolate Frogs
                  {
                   System.out.println ("Please input how many Chocolate Frogs you would like: "); // find out how many CFs the customer wants
                   totalFrogs = keyboard.nextInt();
                   
                     if (totalFrogs >= 0) // if someone enters a correct positive number
                       {
                       System.out.println ("You have purchased " + totalFrogs + " chocolate frogs."); // list how many CFs the customer has ordered
                       }
                   
                     else 
                     {
                      System.out.println ("You have entered an invalid number Goodbye."); // if someone tried to enter a negative number 
                      System.exit(0); //end program
                     }
                  }
                   
                  else if (answer == 3) // if someone selects butterbeer
                   {
                   System.out.println ("Please select an option: "); //let them choose a large or small butterbeer
                   System.out.println (" 1) Large Butterbeer");
                   System.out.println (" 2) Small Butterbeer");
                   answer = keyboard.nextInt();
                   
                     if (answer == 1) //if the customer wants a large butterbeer
                     { 
                      System.out.println ("Please enter how many Large Butterbeers you would like: "); // to find out how many large BBs the customer wants
                      totalBeerLarge = keyboard.nextInt();
                    
                        if (totalBeerLarge >= 0) // if the customer enters a valid positive number
                        {
                        System.out.println ("You have purchased " + totalBeerLarge + " Large Butterbeers."); //list how many Large BBs the customer has ordered
                        }
                     
                         else 
                        {
                         System.out.println ("You have entered an inavlid number goodbye.");//if someone enters a negative number
                         System.exit(0); //end program
                        } 
                     }
                   
                     else if (answer == 2) //if the customer wants a small BB
                     {
                      System.out.println ("Please enter how many Small Butterbeers you would like: "); // Fine out how many small BBs customer wants
                      totalBeerSmall = keyboard.nextInt();
                      
                        if (totalBeerSmall >= 0) // if the customer enters a valid positive number
                        {
                        System.out.println ("You have purchased " + totalBeerSmall + " Small Butterbeers."); //list how many Large BBs the customer has ordered
                        }
                     
                         else 
                        {
                         System.out.println ("You have entered an inavlid number goodbye.");//if someone enters a negative number
                         System.exit(0); //end program
                        } 
                     
                     }
                     
                     else 
                     {
                        System.out.println ("You have entered an invalid number.  Goodbye.");
                        System.exit(0);
                     }
                    }
                   else if (answer == 4) // if user hits check out
                  {
                  // lots and lots of equations!!!!
                  totalCakesBags = totalCakesSingle/6;
                  totalCakesSingle = totalCakesSingle - (totalCakesBags * 6);
                  
                  fCakesSingle = cCSingle * totalCakesSingle;
                  fCakeBags = cCBag * totalCakesBags;
                  fFrogs = cFrogs * totalFrogs;
                  fBeerSmall = bBSmall * totalBeerSmall;
                  fBeerLarge = bBLarge * totalBeerLarge;
                  total = fCakesSingle + fCakeBags + fFrogs + fBeerSmall + fBeerLarge;
                                   // print customers recipt 
                  System.out.println ("You have purchased " + totalCakesBags + " Cauldron Cake Bags for " + fCakeBags + " knuts");
                  System.out.println ("You have purchased " + totalCakesSingle + " Single Cauldron Cakes for " + fCakesSingle + " knuts");
                  System.out.println ("You have purchased " + totalFrogs + " Chocolate Frogs for " + fFrogs + " knuts");
                  System.out.println ("You have purchased " + totalBeerSmall + " Small Butterbeers for " + fBeerSmall + " knuts");
                  System.out.println ("You have purchased " + totalBeerLarge + " Large Butterbeers for " + fBeerLarge + " knuts");
                  System.out.println ("------------------------------------------------------------------");
                  System.out.println ("Your total is " + total + " knuts.");
                  
                  
                  System.out.println (" How would you like to pay for your purchase? ");
                  System.out.println (" 1) knuts");
                  System.out.println (" 2) sickles");
                  System.out.println (" 3) galleons");
                  System.out.println ("Please note the following: ");
                  System.out.println (" A) We appreciate exact change!");
                  System.out.println (" B) Operator does not have more than 20 Galleons on the cart at any time!");
                  System.out.println (" C) Recall our currency options:");
                  System.out.println ("29 Knuts == 1 Sickle");
                  System.out.println ("17 Sickles == 1 Galleon == 493 Knuts");
                  
                  answer = keyboard.nextInt();
                  
                  if (answer == 1) // if customer chooses to pay with knuts
                  {
                    System.out.println ("Please enter the amount of knuts you wish to pay with: ");
                    totalKnuts = keyboard.nextInt();
                    
                    
                    
                    
                    
                     if (totalKnuts > total) //if customer needs change
                     {
                     totalChange = totalKnuts - total;
                     
                     System.out.println ("Thank you for your purchase here is " + totalChange + " knuts in change");
                     break ;
                     }
                    
                     else if (totalKnuts < total)// if the user enters too little money
                     {
                       System.out.println ("That number is too low. Goodbye.");
                       System.exit(0);
                     }
                     
                     else // if user gives exact change
                     {
                        System.out.println ("Thank you for gving exact change it is greatly appreciated.  Enjoy your day and thank you for shopping.");
                       break;
                     }
                  
                  }
                  
                  else if (answer == 2) // if customer decides to pay with Sickles
                  {
                  System.out.println ("Please enter the amount of sickles you would like to pay with: ");
                  totalSickles = keyboard.nextInt();
                  
                 
                 
                  //calculate change that is due
              	knuts = totalSickles * 29;



                  if (knuts > total ) //if requires change
                  {
                  knuts = knuts - total;
                  
                  if ( knuts >= 493)
                {
                  do
                {
                   knuts = knuts - 493;
                   galleons ++;
                } while (knuts >= 493);

                do
               {
                  knuts = knuts - 29;
                  sickles ++;
               } while (knuts >= 29);
               
               System.out.println ("Your toatl change is " + knuts + " knuts, " + sickles + " sickles and " + galleons + " galleons thank you for your purchase.");
               break;
               }
             else if (knuts >= 29 && knuts < 493)
	            {
	              do
	            { knuts = knuts - 29;
	                sickles ++;
	             } while (knuts >= 29);
                
                System.out.println ("Your total change is " + knuts + " knuts and " + sickles + " sickles.  Thank you for your purchase.");
                break;
	             }
              else 
               {
               
               System.out.println ("Your total change is " + knuts + " knuts.  Thank you for your purchase.");
               break;
               }
                  
              }
                  else if (knutSickles < total) // if the customer eneters too little money
                  {
                     System.out.println ("That number is too low.  Goodbye.");
                     System.exit(0);
                  }
                  
                  else // if the customer gives exact change
                  {
                     System.out.println ("Thank you for giving exact change it is greatly appreciated.  Enjoy your day and thank you for shopping.");
                     break;
                  } 
                  }
                  
                  else if (answer == 3) // if the customer decided to pay with galleons
                  {
                  System.out.println (" Please enter the number of gallions you wish to pay with: ");
                  totalGalleons = keyboard.nextInt();
                  // calculate the change needed
                  knuts = totalGalleons * 493;
                                   
                  if (knuts > total) // if change is required
                  {
                       if (knuts > total ) //if requires change
                  {
                  knuts = knuts - total;
                  
                  if ( knuts >= 493)
                {
                  do
                {
                   knuts = knuts - 493;
                   galleons ++;
                } while (knuts >= 493);

                do
               {
                  knuts = knuts - 29;
                  sickles ++;
               } while (knuts >= 29);
               
               System.out.println ("Your toatl change is " + knuts + " knuts, " + sickles + " sickles and " + galleons + " galleons thank you for your purchase.");
               break;
               }
             else if (knuts >= 29 && knuts < 493)
	            {
	              do
	            { knuts = knuts - 29;
	                sickles ++;
	             } while (knuts >= 29);
                
                System.out.println ("Your total change is " + knuts + " knuts and " + sickles + " sickles.  Thank you for your purchase.");
                break;
	             }
              else 
               {
               
               System.out.println ("Your total change is " + knuts + " knuts.  Thank you for your purchase.");
               break;
               }
                  
              }

                  
                  }
                  else if (knuts < total) // if the user enters too little money
                  {
                     System.out.println ("That number is too low.  Goodbye.");
                     System.exit(0);
                  }
                  
                  else // if the user provides exact change
                  {
                     System.out.println ("Thank you for giving exact change it is greatly appreciated.  Enjoy your day and thank you for shopping.");
                     break;
                  } 

                  
                  }
                      
                
                }
                 
                }while (answer == 1 || answer == 2 || answer == 3 || answer == 4);//so the loop will end once check out is selected
                
                }                     
                
                
                

            
            }
               
               
               
               
  // -------------------------------------------------------------------------------------------                 
            

            }
         else if (answer == 2)
            {
            System.out.println ("Okay please enjoy our normal prices: "); //print out regular prices 
            System.out.println ("A single Cauldron Cake: 10 knuts");
            System.out.println ("A bag of Cauldron Cakes (contains 6 cakes): 55 knuts");
            System.out.println ("Chocolate Frogs : 20 knuts each");
            System.out.println ("A small Butterbeer: 50 knuts");
            System.out.println ("A large Buterbeer: 75 knuts");
            
            do 
                {
                System.out.println ("Please choose an option: "); // give user options to choose from 
                System.out.println ("   1) Update Cauldron Cake order");
                System.out.println ("   2) Update Chocolate Frogs order");
                System.out.println ("   3) Update Butterbeer order" );
                System.out.println ("   4) Check out" );    
                
                answer = keyboard.nextInt();
                
               if (answer == 1)
               {
                  System.out.println ("Please input how many Cauldron cakes you would like: "); //find out how many CC the customer wants
                  totalCakesSingle = keyboard.nextInt();
                 
                  if (totalCakesSingle >= 0)  // if someone enters a correct positive number 
                  {
                  System.out.println ("You have purchased " + totalCakesSingle + " Cauldron Cakes"); //list out how many CCs the customer has purchased
                  }
                 
                  else
                   {
                   System.out.println ("You have entered an invalid number Goodbye."); // if someone tries to enter a negative number
                   System.exit(0); //end program
                   }
                 }
                 
                 else if (answer == 2) //if they select Chocolate Frogs
                  {
                   System.out.println ("Please input how many Chocolate Frogs you would like: "); // find out how many CFs the customer wants
                   totalFrogs = keyboard.nextInt();
                   
                     if (totalFrogs >= 0) // if someone enters a correct positive number
                       {
                       System.out.println ("You have purchased " + totalFrogs + " chocolate frogs."); // list how many CFs the customer has ordered
                       }
                   
                     else 
                     {
                      System.out.println ("You have entered an invalid number Goodbye."); // if someone tried to enter a negative number 
                      System.exit(0); //end program
                     }
                  }
                   
                  else if (answer == 3) // if someone selects butterbeer
                   {
                   System.out.println ("Please select an option: "); //let them choose a large or small butterbeer
                   System.out.println (" 1) Large Butterbeer");
                   System.out.println (" 2) Small Butterbeer");
                   answer = keyboard.nextInt();
                   
                     if (answer == 1) //if the customer wants a large butterbeer
                     { 
                      System.out.println ("Please enter how many Large Butterbeers you would like: "); // to find out how many large BBs the customer wants
                      totalBeerLarge = keyboard.nextInt();
                    
                        if (totalBeerLarge >= 0) // if the customer enters a valid positive number
                        {
                        System.out.println ("You have purchased " + totalBeerLarge + " Large Butterbeers."); //list how many Large BBs the customer has ordered
                        }
                     
                         else 
                        {
                         System.out.println ("You have entered an inavlid number goodbye.");//if someone enters a negative number
                         System.exit(0); //end program
                        } 
                     }
                   
                     else if (answer == 2) //if the customer wants a small BB
                     {
                      System.out.println ("Please enter how many Small Butterbeers you would like: "); // Fine out how many small BBs customer wants
                      totalBeerSmall = keyboard.nextInt();
                      
                        if (totalBeerSmall >= 0) // if the customer enters a valid positive number
                        {
                        System.out.println ("You have purchased " + totalBeerSmall + " Small Butterbeers."); //list how many Large BBs the customer has ordered
                        }
                     
                         else 
                        {
                         System.out.println ("You have entered an inavlid number goodbye.");//if someone enters a negative number
                         System.exit(0); //end program
                        } 
                     
                     }
                     
                     else 
                     {
                        System.out.println ("You have entered an invalid number.  Goodbye.");
                        System.exit(0);
                     }
                    }
                   else if (answer == 4) // if user hits check out
                  {
                  // lots and lots of equations!!!!
                  totalCakesBags = totalCakesSingle/6;
                  totalCakesSingle = totalCakesSingle - (totalCakesBags * 6);
                  
                  fCakesSingle = cCSingle * totalCakesSingle;
                  fCakeBags = cCBag * totalCakesBags;
                  fFrogs = cFrogs * totalFrogs;
                  fBeerSmall = bBSmall * totalBeerSmall;
                  fBeerLarge = bBLarge * totalBeerLarge;
                  total = fCakesSingle + fCakeBags + fFrogs + fBeerSmall + fBeerLarge;
                                   // print customers recipt 
                  System.out.println ("You have purchased " + totalCakesBags + " Cauldron Cake Bags for " + fCakeBags + " knuts");
                  System.out.println ("You have purchased " + totalCakesSingle + " Single Cauldron Cakes for " + fCakesSingle + " knuts");
                  System.out.println ("You have purchased " + totalFrogs + " Chocolate Frogs for " + fFrogs + " knuts");
                  System.out.println ("You have purchased " + totalBeerSmall + " Small Butterbeers for " + fBeerSmall + " knuts");
                  System.out.println ("You have purchased " + totalBeerLarge + " Large Butterbeers for " + fBeerLarge + " knuts");
                  System.out.println ("------------------------------------------------------------------");
                  System.out.println ("Your total is " + total + " knuts.");
                  
                  
                  System.out.println (" How would you like to pay for your purchase? ");
                  System.out.println (" 1) knuts");
                  System.out.println (" 2) sickles");
                  System.out.println (" 3) galleons");
                  System.out.println ("Please note the following: ");
                  System.out.println (" A) We appreciate exact change!");
                  System.out.println (" B) Operator does not have more than 20 Galleons on the cart at any time!");
                  System.out.println (" C) Recall our currency options:");
                  System.out.println ("29 Knuts == 1 Sickle");
                  System.out.println ("17 Sickles == 1 Galleon == 493 Knuts");
                  
                  answer = keyboard.nextInt();
                  
                  if (answer == 1) // if customer chooses to pay with knuts
                  {
                    System.out.println ("Please enter the amount of knuts you wish to pay with: ");
                    totalKnuts = keyboard.nextInt();
                    
                    
                    
                    
                    
                     if (totalKnuts > total) //if customer needs change
                     {
                     totalChange = totalKnuts - total;
                     
                     System.out.println ("Thank you for your purchase here is " + totalChange + " knuts in change");
                     break ;
                     }
                    
                     else if (totalKnuts < total)// if the user enters too little money
                     {
                       System.out.println ("That number is too low. Goodbye.");
                       System.exit(0);
                     }
                     
                     else // if user gives exact change
                     {
                        System.out.println ("Thank you for gving exact change it is greatly appreciated.  Enjoy your day and thank you for shopping.");
                       break;
                     }
                  
                  }
                  
                  else if (answer == 2) // if customer decides to pay with Sickles
                  {
                  System.out.println ("Please enter the amount of sickles you would like to pay with: ");
                  totalSickles = keyboard.nextInt();
                  
                 
                 
                  //calculate change that is due
              	knuts = totalSickles * 29;



                  if (knuts > total ) //if requires change
                  {
                  knuts = knuts - total;
                  
                  if ( knuts >= 493)
                {
                  do
                {
                   knuts = knuts - 493;
                   galleons ++;
                } while (knuts >= 493);

                do
               {
                  knuts = knuts - 29;
                  sickles ++;
               } while (knuts >= 29);
               
               System.out.println ("Your toatl change is " + knuts + " knuts, " + sickles + " sickles and " + galleons + " galleons thank you for your purchase.");
               break;
               }
             else if (knuts >= 29 && knuts < 493)
	            {
	              do
	            { knuts = knuts - 29;
	                sickles ++;
	             } while (knuts >= 29);
                
                System.out.println ("Your total change is " + knuts + " knuts and " + sickles + " sickles.  Thank you for your purchase.");
                break;
	             }
              else 
               {
               
               System.out.println ("Your total change is " + knuts + " knuts.  Thank you for your purchase.");
               break;
               }
                  
              }
                  else if (knutSickles < total) // if the customer eneters too little money
                  {
                     System.out.println ("That number is too low.  Goodbye.");
                     System.exit(0);
                  }
                  
                  else // if the customer gives exact change
                  {
                     System.out.println ("Thank you for giving exact change it is greatly appreciated.  Enjoy your day and thank you for shopping.");
                     break;
                  } 
                  }
                  
                  else if (answer == 3) // if the customer decided to pay with galleons
                  {
                  System.out.println (" Please enter the number of gallions you wish to pay with: ");
                  totalGalleons = keyboard.nextInt();
                  // calculate the change needed
                  knuts = totalGalleons * 493;
                                   
                  if (knuts > total) // if change is required
                  {
                       if (knuts > total ) //if requires change
                  {
                  knuts = knuts - total;
                  
                  if ( knuts >= 493)
                {
                  do
                {
                   knuts = knuts - 493;
                   galleons ++;
                } while (knuts >= 493);

                do
               {
                  knuts = knuts - 29;
                  sickles ++;
               } while (knuts >= 29);
               
               System.out.println ("Your toatl change is " + knuts + " knuts, " + sickles + " sickles and " + galleons + " galleons thank you for your purchase.");
               break;
               }
             else if (knuts >= 29 && knuts < 493)
	            {
	              do
	            { knuts = knuts - 29;
	                sickles ++;
	             } while (knuts >= 29);
                
                System.out.println ("Your total change is " + knuts + " knuts and " + sickles + " sickles.  Thank you for your purchase.");
                break;
	             }
              else 
               {
               
               System.out.println ("Your total change is " + knuts + " knuts.  Thank you for your purchase.");
               break;
               }
                  
              }

                  
                  }
                  else if (knuts < total) // if the user enters too little money
                  {
                     System.out.println ("That number is too low.  Goodbye.");
                     System.exit(0);
                  }
                  
                  else // if the user provides exact change
                  {
                     System.out.println ("Thank you for giving exact change it is greatly appreciated.  Enjoy your day and thank you for shopping.");
                     break;
                  } 

                  
                  }
                      
                
                }
                 
                }while (answer == 1 || answer == 2 || answer == 3 || answer == 4);//so the loop will end once check out is selected
                
                }   
            
        
         else 
            {
            System.out.print ("You have entered an invalid number.  Goodbye."); //close program if someone enters a different number
            System.exit(0);
            }
          }
  //--------------------------------------------------------------------------------       
      
   else if (answer == 2) // if there are no customers
     {
      System.out.print ("Go hand out flyers or something since no one is here. "); // if no customer shows up
      System.exit(2);
      }
   else 
      {
      System.out.print ("You entered an invalid number.  Goodbye :o)"); // if someone enters a different number than expected 
      System.exit(0);
      }
      
   }while (time == 0);
      
   }
   
}