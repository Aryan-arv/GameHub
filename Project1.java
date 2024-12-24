
import java.util.*;
public class Project
{
    String name;
    Scanner in=new Scanner(System.in);
    static String pass[]=new String[50];
    static String name1[]=new String[50];2
    String p;
    static int cttr=0;
    static int pos=0;
    void Choice()
    {
        int c=0;
        Project obj=new Project();
        while(c!=3)
        {
            System.out.println("Press 1.To Play Tic-Tac-Toe");
            System.out.println("Press 2.To Rock-Paper-Scissor");
            System.out.println("Press 3.To Home Page");
            System.out.print("Enter Your Choice:");
            c=in.nextInt();
            System.out.println();
            switch(c)
            {
                case 1:obj.start1();
                        break;
                case 2:obj.start2();
                        break;
                case 3:obj.quits();
                        break;
                default:System.out.println("Please Enter a vaild Choice");
                        break;
            }
        }
    }
    void RPS(String name)
    {
        String s[]={"rock","paper","scissor"};
        String temp,user;
        Random r=new Random();
        int cpu1=r.nextInt(3);
        temp=s[cpu1];
        Scanner input=new Scanner(System.in);
        while(true)
        {
            System.out.print("Please Enter Your Move (rock,paper,scissor):");
            user=input.next();
            System.out.println();
            if((user.equals("rock"))||(user.equals("paper"))||(user.equals("scissor")))
                break;
            else
            {
                System.out.println("\t\t\t"+user+" is not a Valid Move");
                System.out.println("\t\t\tPlease Try Again");
            }
        }
        System.out.println("Bot Played: "+temp);
        if(temp.equals(user))
        {
            System.out.println("\t\t\t Match Draw");
        }
        else if((user.equals("rock"))&&(temp.equals("paper")))
            System.out.println("\t\t\tYou Lose!");
        else if((user.equals("paper"))&&(temp.equals("scissor")))
            System.out.println("\t\t\tYou Lose!");
        else if((user.equals("scissor"))&&(temp.equals("rock")))
            System.out.println("\t\t\tYou Lose!");
        else
            System.out.println("\t\t\t"+name+" is The Winner!");
    }
    void start1()
    {
        int choice=0;
        Project obj1=new Project();
        System.out.println();
        System.out.println("\t\t\tWelcome "+name1[pos]+" To The Game of Tic-Tac-Toe");
        System.out.println();
        while(choice!=2)
        {
            System.out.println("Press 1. To Start the Game");
            System.out.println("Press 2. To Return To Main Menu");
            System.out.print("Enter the Choice:");
            choice=in.nextInt();
            System.out.println();
            
            switch(choice)
            {
                case 1:obj1.TTT(name1[pos]);
                break;
                case 2:obj1.quits();
                break;
                default:System.out.println("\t\t\tPlease Enter a vaild Choice");
                break;
            }         
        }
    }
    void start2()
    {
        int choice=0;
        Project obj1=new Project();
        System.out.println();
        System.out.println("\t\t\tWelcome "+name1[pos]+" To The Game of Rock-Paper-Scissor");
        System.out.println();
        while(choice!=2)
        {
            System.out.println("Press 1. To Start the Game");
            System.out.println("Press 2. To Return To Main Menu");
            System.out.print("Enter the Choice:");
            choice=in.nextInt();
            System.out.println();
            
            switch(choice)
            {
                case 1:obj1.RPS(name1[pos]);
                break;
                case 2:obj1.quits();
                break;
                default:System.out.println("\t\t\tPlease Enter a vaild Choice");
                break;
            }         
        }
    }
    void quits()
    {
        System.out.println("\t\t\tThanks For Playing The Game");
        System.out.println();
    }
    void TTT(String name)
    {
        int ctr=1;
        char p[];
        Random r=new Random();
        int player,i;
        p=new char[10];
        for(i=1;i<=9;i++)
        {
            p[i]=' ';
        }
        while(ctr<=6)
        {
            System.out.println("\t\t\t"+p[1]+"|"+p[2]+"|"+p[3]);
            System.out.println("\t\t\t-+-+-"); 
            System.out.println("\t\t\t"+p[4]+"|"+p[5]+"|"+p[6]);
            System.out.println("\t\t\t-+-+-"); 
            System.out.println("\t\t\t"+p[7]+"|"+p[8]+"|"+p[9]);
            if(((p[1]==p[2])&&(p[2]==p[3])&&(p[3]=='X'))||((p[4]==p[5])&&(p[5]==p[6]))&&(p[6]=='X')
                ||((p[7]==p[8])&&(p[8]==p[9])&&(p[9]=='X'))||((p[1]==p[4])&&(p[4]==p[7])&&(p[7]=='X'))
                ||((p[2]==p[5])&&(p[5]==p[8])&&(p[8]=='X'))||((p[3]==p[6])&&(p[6]==p[9])&&(p[9]=='X'))
                ||((p[1]==p[5])&&(p[5]==p[9])&&(p[9]=='X'))||((p[3]==p[5])&&(p[5]==p[7])&&(p[7]=='X')))
            {
                System.out.println();
                System.out.println("\t\t\t"+name+" is the Winner!");
                System.out.println();
                break;
            }
            else if(((p[1]==p[2])&&(p[2]==p[3])&&(p[3]=='0'))||((p[4]==p[5])&&(p[5]==p[6]))&&(p[6]=='0')
                ||((p[7]==p[8])&&(p[8]==p[9])&&(p[9]=='0'))||((p[1]==p[4])&&(p[4]==p[7])&&(p[7]=='0'))
                ||((p[2]==p[5])&&(p[5]==p[8])&&(p[8]=='0'))||((p[3]==p[6])&&(p[6]==p[9])&&(p[9]=='0'))
                ||((p[1]==p[5])&&(p[5]==p[9])&&(p[9]=='0'))||((p[3]==p[5])&&(p[5]==p[7])&&(p[7]=='0')))
            {
                System.out.println();
                System.out.println("\t\t\tBot is the Winner!");
                System.out.println();
                break;
            }
            while(true)
            {
                System.out.println("Enter the Position(1-9)");
                player=in.nextInt();
                if((player==1)||(player==2)||(player==3)||(player==4)||(player==5)
                        ||(player==6)||(player==7)||(player==8)||(player==9))
                    break;
                else
                {
                System.out.println("\t\t\t"+player+" is not a Valid Move");
                System.out.println("\t\t\tPlease Try Again");
                }
            }
            if((p[player]==' '))
            {
                switch(player)
                {
                    case 1:p[1]='X';
                    break;
                    case 2:p[2]='X';
                    break;
                    case 3:p[3]='X';
                    break;
                    case 4:p[4]='X';
                    break;
                    case 5:p[5]='X';
                    break;
                    case 6:p[6]='X';
                    break;
                    case 7:p[7]='X';
                    break;
                    case 8:p[8]='X';
                    break;
                    case 9:p[9]='X';
                    break;
                    default:System.out.println("\t\t\tInvalid Choice");
                }
            }
            while(true)
            {
                if(ctr>=5)
                {
                        continue;
                }
                else
                {
                int cpu=r.nextInt(9)+1;
                if((p[cpu])==' ')
                {    
                    switch(cpu)
                    {
                        case 1:p[1]='0';
                        break;
                        case 2:p[2]='0';
                        break;
                        case 3:p[3]='0';
                        break;
                        case 4:p[4]='0';
                        break;
                        case 5:p[5]='0';
                        break;
                        case 6:p[6]='0';
                        break;
                        case 7:p[7]='0';
                        break;
                        case 8:p[8]='0';
                        break;
                        case 9:p[9]='0';
                        break;
                        default:System.out.println("\t\t\tInvalid Choice");
                        break;
                    }
                    break;
                }
                }
            }
            ctr++;
        }
        if(((p[1]==p[2])&&(p[2]==p[3])&&(p[3]=='X'))||((p[4]==p[5])&&(p[5]==p[6]))&&(p[6]=='X')
                ||((p[7]==p[8])&&(p[8]==p[9])&&(p[9]=='X'))||((p[1]==p[4])&&(p[4]==p[7])&&(p[7]=='X'))
                ||((p[2]==p[5])&&(p[5]==p[8])&&(p[8]=='X'))||((p[3]==p[6])&&(p[6]==p[9])&&(p[9]=='X'))
                ||((p[1]==p[5])&&(p[5]==p[9])&&(p[9]=='X'))||((p[3]==p[5])&&(p[5]==p[7])&&(p[7]=='X')))
            {
                System.out.println();
            }
            else if(((p[1]==p[2])&&(p[2]==p[3])&&(p[3]=='0'))||((p[4]==p[5])&&(p[5]==p[6]))&&(p[6]=='0')
                ||((p[7]==p[8])&&(p[8]==p[9])&&(p[9]=='0'))||((p[1]==p[4])&&(p[4]==p[7])&&(p[7]=='0'))
                ||((p[2]==p[5])&&(p[5]==p[8])&&(p[8]=='0'))||((p[3]==p[6])&&(p[6]==p[9])&&(p[9]=='0'))
                ||((p[1]==p[5])&&(p[5]==p[9])&&(p[9]=='0'))||((p[3]==p[5])&&(p[5]==p[7])&&(p[7]=='0')))
            {
                System.out.println();
            }
            else
                System.out.println("\t\t\tMatch Draw");
    }
    void check()
    {
        Project obj=new Project();
        String inpass;
        int z=0;
        System.out.print("Please Enter The Password:");
        inpass=in.next();
        System.out.println();
        for(int i=0;i<50;i++)
        {   
            if(inpass.equals(pass[i]))
            {
                z=1;
                pos=i;
                break;
            }
        }
        if(z==1)
        {
            System.out.println("\t\t\t\tLogin Successful");
            obj.Choice();
        }
        else
        {
            System.out.println("\t\t\tInvalid Password Please Enter Correct Password");   
        }
    }
    void signup()
    {
        String n1;
        System.out.print("Please Enter Your Name:");
        n1=in.next();
        System.out.println();
        Random r=new Random();
        StringBuilder sb=new StringBuilder();
        String alphab="abcdefghijklmnopqrstuvwxyz";
        String num="0123456789";
        String temp=alphab+num;
        for(int i=0;i<4;i++)
        {
            int index=r.nextInt(temp.length());
            char randomChar=temp.charAt(index);
            sb.append(randomChar);
        }
        p=sb.toString();
        cttr++;
        pass[cttr]=p;
        name1[cttr]=n1;
        System.out.println("\t\t\tNew Password Generated-"+p);
    }
    public static void main(String args[])
    {
        Project obj=new Project();
        int ch=0;
        Scanner in=new Scanner(System.in);
        System.out.println("\t\t\t~~~Welcome to the Gaming Zone~~~"); 
        while(ch!=3)
        {
            System.out.println("Press 1.To Sign in");
            System.out.println("Press 2.To Sign up");
            System.out.println("Press 3.To Quit");
            System.out.print("Enter Your Choice:");
            ch=in.nextInt();
            System.out.println();
            switch(ch)
            {
                case 1:obj.check();
                break;
                case 2:obj.signup();
                break;
                case 3:obj.quits();
                break;
                default:System.out.println("\t\t\tPlease Enter a vaild Choice");
                break;
            }
        }    
    }    
}
