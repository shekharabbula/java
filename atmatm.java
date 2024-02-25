/******************************************************************************
                             ABBULA SHEKHAR 
                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;

public class atmatm
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int Bal=10000;
		int Dip=0;
		int Amt=0;
		int count=1;
		int originalpin=1111;
		double accNo=12345;
		double mobNo=86888;
		
		
		
		while(true){
		    System.out.println("Wel Come To Bank Of India (BOI) : ");
                    System.out.println();
    		    System.out.println("Card Insertion Successfully Completed : ");
		    System.out.println("Please Enter the PIN NO :");
		    int pin=sc.nextInt();//1111
		    if(pin>1000 && pin<=9999){
		        if(pin==originalpin){
		            System.out.println("1.with Drawal :");
		            System.out.println("2.Deposit :");
		            System.out.println("3.Check Balance :");
		            System.out.println("4.Pin change :");
		            System.out.println("5.Statement :");
		            System.out.println("6.Exit :");
		            
		            System.out.println("CHOOSE :");
		            
		            int NO=sc.nextInt();
		            
		            
		            if(NO==1){
		                System.out.println("Please Enter the PIN NO :");
		                pin=sc.nextInt();//1111
		                if(pin>1000 && pin<=9999){
		                    if(pin==originalpin){
		                        while(true){
		                            System.out.println("Enter the With drawal Amount :");
    		                            Amt=sc.nextInt();
    		                            if(Amt>0 && Amt%100==0){
    		                            	System.out.println("1.Saving");
    		                            	System.out.print("2.Current  Select   :");
    		                           	int s=sc.nextInt();
    		                            	if(Amt<Bal && s==1 || s==2){
    		                                	Bal=Bal-Amt;
    		                                	System.out.println("Amount withDrawal is :"+Amt);
    		                                	System.out.println("Balance Amount is :"+Bal);
    		                                	System.out.println("Transaction successful");
                                            		System.out.println("THANKS FOR VISITING OUR BANK");
                                            		break;
    		                            	}
    		                            	else{
    		                                     System.out.println("Insuffiient Bank Balance :");
    		                            	}
    		                           }
    		                           else{
    		                            System.out.println("Inavalid Amount to be Entered Please Enter Multiples of 100's :");
    		                           }
		                        }
		                    }
                                    else{
                                        System.out.println("Wrong Pin : ");
                                    }
		                }
                                else{
                                    System.out.println("pin does not exit : ");
                                }
		            }
		            else if(NO==2){
		                System.out.println("Please Enter the PIN NO :");
		                pin=sc.nextInt();//1111
		                if(pin>1000 && pin<=9999){
		                    if(pin==originalpin){
                                       
		                        while(true){
		                            System.out.println("Enter Amount to be Deposit :");
    		                        Dip=sc.nextInt();
    		                        if(Dip>=100 && Dip<100000 && Dip%100==0){
    		                            
    		                            
    		                            System.out.println("select 100's :  ");
    		                            int amt1=sc.nextInt();
    		                            System.out.println("select 200's :  ");
    		                            int amt2=sc.nextInt();
    		                            System.out.println("select 500's :  ");
    		                            int amt3=sc.nextInt();
    		                            System.out.println("select 2000's :  ");
    		                            int amt4=sc.nextInt();
    		                            
    		                            int amt11=100*amt1;
    		                            int amt22=200*amt2;
    		                            int amt33=500*amt3;
    		                            int amt44=2000*amt4;
    		                            
    		                            int total=amt11+amt22+amt33+amt44;
    		                            
    		                            if(total==Dip){
    		                                Bal=Bal+Dip;
            		                        System.out.println("Successfilly completed Diposite Process :");
            		                        System.out.println("Total Balance Is :"+Bal);
            		                        System.out.println("THANKS FOR VISITING OUR BANK");
            		                        break;
    		                            }
    		                            
    		                            else{
    		                                System.out.println("Amount Didn't Matched with Your Cash");
    		                            }
    		                           
    		                            
    		                            
    		                        }
    		                        else{
    		                            System.out.println("Please Enter Amount Should be multiples of 100's : ");
    		                        }
		                        }
		                        
		                    }
		                }
		            }
		            else if(NO==3){
		                System.out.println("Please Enter the PIN NO :");
		                pin=sc.nextInt();//1111
		                if(pin>1000 && pin<=9999){
		                    if(pin==originalpin){
		                        System.out.println("Available Bank Balance is : "+Bal);
		                        System.out.println("THANKS FOR VISITING OUR BANK");
		                    }
		                }
		                
		            }
		            else if(NO==4){
		                int c1=0;
		                int c2=0;
		                while(true){
		                    System.out.println("Enter The Account NO : ");
    		                double accNo1=sc.nextInt();
    		                if(accNo==accNo1){
    		                    System.out.println("Enter The Mobile NO :");
    		                    double mobNo1=sc.nextInt();
    		                    if(mobNo==mobNo1){
    		                        System.out.println("Current Pin :");
        		                    int pin1=sc.nextInt();
        		                    if(pin1>1000 && pin1<9999){
        		                        if(pin1==pin){
        		                            
                		                    System.out.println("enter New Pin");
                		                    int newpin=sc.nextInt();
                		                    System.out.println("Confirm your Pin");
                		                    int newpin1=sc.nextInt();
                		                    
                		                    if(newpin==newpin1){
                		                        originalpin=newpin1;
                    		                    	System.out.println("Pin Generation successfully completed :");
                    		                    	System.out.println("Thank You For Visiting Our Bank : ");
                    		                    	break;
                		                    }
                		                    else{
                		                        System.out.println("Pin  no does Not match : ");
                		                    }
                		                    
        		                    
        		                    
        		                        }
            		                    else{
            		                        System.out.println("Pin does not match :");
            		                    }
        		                    }
            		                else{
            		                    System.out.println("Invalid PIn : ");
            		                }
    		                        
    		                    }
    		                    else{
    		                        System.out.println("Invalid Mobile No :");
    		                        c1++;
    		                        if(c1==3){
    		                            System.out.println("you Entered Wrong Mobile NO ");
    		                            System.out.println("you have reached today's Limit");
    		                            System.out.println("Please jera repu anna correct enter cheyy ra : ");
    		                            System.out.println("Thank you for Visiting Our Bank :");
    		                            break;
    		                        }
    		                    }
    		                }
    		                else{
    		                    System.out.println("Invalid Account No : ");
    		                    c2++;
    		                    if(c2==3){
    		                        System.out.println("you Entered Wrong Account NO ");
    		                        System.out.println("you have reached today's Limit Govindaa...");
    		                        System.out.println("Please jera repu anna correct enter cheyy ra : ");
    		                        System.out.println("Thank you for Visiting Our Bank :");
    		                        break;
    		                    }
    		                }
    		            }
		                    
		            }
		            else if(NO==5){
		                System.out.println("Recently Withdrawel Money :"+Amt);
		                System.out.println("Deposited Money: "+Dip);
		                System.out.println("Available Balance : "+Bal);
		                
		            }
		                
		            else if(NO==6){
		                System.out.println("Remainig Balance Display On The Screen  :  ");
		                System.out.println("1.Yes");
		                System.out.print("2.No    Select  :");
		                int yes=sc.nextInt();
		                if(yes==1){
		                    System.out.println("Available Balance : "+Bal);
		                    System.out.println("THANKS FOR VISITING OUR BANK");
		                    break;
		                }
		                else{
		                    System.out.println("THANKS FOR VISITING OUR BANK");
		                    break;
		                }
		                
		            }
		        }
		        else{
		            System.out.println("Incorrect Pin NO :");
		            count++;
		        }
		    }
		    else{
		        System.out.println("Invalid pin NO :");
		    }
		    if(count==3){
		        System.out.println("Account is blocked");
                        System.out.println("Please Contact our branch :");
                        System.out.println("THANKS FOR VISITION OUR BANK");
                        break;
		    }
		    
		    
		}
	}
}
