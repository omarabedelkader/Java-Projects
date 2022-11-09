
package Testing;
import java.util.*;

public class Testing {
    
    public static void main(String args[]){
        
      /*  
        Scanner clavier = new Scanner(System.in);
        
        System.out.println("number: ");
        int number = clavier.nextInt();
        
        System.out.println("number1: ");
        int number1 = clavier.nextInt();
        
        System.out.println("number2: ");
        int number2 = clavier.nextInt();
        int max = 0; */
        
        /*
        if ((number >= number1) & (number >= number2)){
            max = number;
                }
                else
                    if ((number1 >= number) & (number1 >= number2)){
                     max = number1;
                    }
        else
        max= number2;
        
        */
        
       /* max=number2<(max=(number<number1)?number1:number)?max:number2;
        
        System.out.println("Max number: " + max); */
        
       /*
        final int y=10;
        int x=10, a=x;
        
        switch(x){
            case y: x++;
            case y+1: x++;
            case y+2: x++;
            default: x++;
        }
        
        System.out.println("x= " + x);
        
        switch(a){
            case y: a++; break;
            case y+1: a++; break;
            case y+2: a++; break;
            default: a++;
        }
        
        System.out.println("a= " + a);
        
        */
       
       /*
       for(int x=0; x<5; x++)
           System.out.println("x= "+x);
       
       int y=0;
       
       while(y<5){ 
           System.out.println("y= "+y);
           y++;
       }
       
       int z=0;
       
       do{
           System.out.println("z= "+z);
           z++;
       }while(z<5);

        */
       
       /*
       for(int y=0; y<20; y++){
           if(y/5==2)
               break;
           System.out.println("y= " + y);
       }
       
        for(int y=0; y<20; y++){
           if(y/5==2)
               continue;
           System.out.println("y= " + y);
       }
       
        for(int y=0; y<20; y++){
           if(y/5==2)
               continue;
           System.out.println("y= " + y);
       }
        
        int z=1;
        while(z<20){
            z++;
            if(z%2==0)
                continue;
            System.out.println("z= " + z);
        }
        
        int x=0;
        do{
            System.out.println("x= " + x);
            if(x/5==2)
                break;
        }
        while(x<20);
        for(int y=0; y<20; y++){
            if(y/5==2)
                break;
            System.out.println("y= " + y);
        }
        int t=0;
        while(x<20){
            System.out.println("t= " + t);
            if(t/5==2)
                break;
            t++;
        }
        */
       
       /*
       String s1="abcdef";
       String ssch="def";
       int rang = s1.indexOf(ssch);
       
       System.out.println(rang);*/
       
       /*
       String s1,s2,s3,s4,s5,s6,s7,s8,ch;
       ch = "abc";
       char i = 'i';
       s1 = ch;
       char j='j';
       s2 = new String(ch.toCharArray());
       System.out.println(s2);
       s3 = i + ch;
       System.out.println("s3= " + s3);
       s4 = "i" + "j";
       System.out.println("s4= " + s4);
       if(ch==s2)
           System.out.println("ch==s2");
       else
           System.out.println("ch<>s2");
 
       if(s1==ch)
           System.out.println("s1==ch");
       else
           System.out.println("s1<>ch");
       s4=String.valueOf(i);
       System.out.println(s4);
       */
       
       /* diviseur d'un entier
       Scanner input = new Scanner(System.in);
       
       System.out.print("Entrez le nombre: ");
       int n = input.nextInt();
       
       for (int i = 1; i < n; i++){
           if(n % i == 0){
               System.out.println(i);
           }
       }

       */
       
       /*
       int spaces = 0;
       for(int i = 0; i < 10; i ++)
       {
           System.out.print(i);
           for(int j = 1; j <= spaces; j++)
           {
               System.out.print(" ");
           }
           System.out.print("X");
           System.out.println();
           spaces ++;
       }
       */
       
       /*
       for(int i = 1; i <= 7; i++)
       {
        System.out.println(i + " Kilometre a pieds ca use les souliers");
       }
       */
       
       /*
       for(int j=0; j<7 ;j++)
       {
           for (int i=9;i>=0;i--)
           {
              System.out.print(i + " ");
           }
           System.out.println();
       }
       */
       
       /*
       double n; int x;
       
        
       System.out.print("Entrez un nbre: ");
       Scanner clavier= new Scanner (System.in);
       x=clavier.nextInt();
       
       n = Math.log(x)/Math.log(2);
     
       if(n%1==0) System.out.println(x+" est exposant de 2 et d'ordre "+n);
       else System.out.println("Faux");
           
        */
   
     /*
    int n, s = 0, c = 0; 
    Scanner scan = new Scanner(System.in);

    do
        {
           System.out.print("Entrer un chiffre binaire: ");
           n=scan.nextInt();
           if(n!=0 && n!=1)
               continue;
           s += n * Math.pow(2,c);
           c++;
        }while(c<8);

    System.out.println("Le nombre décimal est: " + s);   
    */
     
     /*
    Scanner input = new Scanner(System.in);
    int stars, spaces =0, n;
    
    do
    {
        System.out.print("Entrer un nombre: ");
        n=input.nextInt();
    }while(n<5 || n>15 || n%2==0);
    
    stars=n;
            
    for(int i=0; i<n; i++)
    {
        for(int j=0; j<spaces; j++)
            System.out.print(" ");
        for(int j=0; j<stars; j++)
            System.out.print("*");
        System.out.println();
        stars --;
        spaces ++;
    }
    
    spaces = n-2;
    stars = 2;
    for(int i=1; i<n; i++)
    {
        for(int j=0; j<spaces; j++)
            System.out.print(" ");
        for(int j=0; j<stars; j++)
            System.out.print("*");
        System.out.println();
        stars ++;
        spaces --;
    }
    */
    
     /*
     long t, millis, secondes, minutes, heures, jours;
     
     
     Scanner input = new Scanner(System.in);
     
     do{
       System.out.print("Entrer un nombre de millisecondes positif: ");
       t = input.nextLong();
     }while(t<0);
     
     millis = t%1000;
     t /=1000;
     secondes = t % 60;
      t /= 60;
     minutes = t % 60;
      t /= 60;
     heures = t % 24;
     jours = t / 24;
     
     
     System.out.println("jours: "+jours+", heures: "+heures+", minutes: "+minutes+", secondes: "+secondes);
     */
     
     /* Stars
     
    Scanner input = new Scanner(System.in);
    int n;
    do{
        System.out.print("Enter a number: ");
        n=input.nextInt();
    }while(n%2==0 || n<5 || n>15);
     
    int d=n/2, spaces=d,stars=1;
     
    for(int i=0; i<=d;i++)
    {
        for(int j=0;j<spaces;j++)
            System.out.print(" ");
        for(int j=0;j<stars;j++)
            System.out.print("*");
        System.out.println();
        spaces--;
        stars+=2;
    }
    
    spaces=1;
    stars=n-2;
     
    for(int i=0; i<d;i++)
    {
        for(int j=0;j<spaces;j++)
            System.out.print(" ");
        for(int j=0;j<stars;j++)
            System.out.print("*");
        System.out.println();
        spaces++;
        stars-=2;
    }    
    
    */
    
    /* 
    Scanner input = new Scanner(System.in);
     
    int count=0, count1=0, max, n;
     
    do{
        System.out.print("enter a number: ");
        n=input.nextInt();
    }while(n<0);
     
    max = n;
     
    while(n>=1){
        if(count<10){
            System.out.print(n+", ");
        }
        else{
            System.out.println();
            System.out.print(n+", ");
            count=0;
        }
        if(n%2==0)
            n=n/2;
        else
            n=3*n+1;
        if(max<n)
            max=n;
        count++;
        count1 ++;
    }
    
    System.out.println("la valeur maximal est: "+ max);
    System.out.println("Il y a  "+ count1+" valeurs");

    */
    
    /* binary to decimal
    
    
    int n,dec=0,count=0;
    
    Scanner input = new Scanner(System.in);
    
        do{
        System.out.print("Entrer un chiffre binaire: ");
        n=input.nextInt();
        if(n!=0&&n!=1)
            continue;
        dec+=n*Math.pow(2, count);
        count++;
        }while(count<8);
    System.out.print("le nombre decimal est: "+dec);
    */
    
    /* stars 
    Scanner input = new Scanner(System.in);
    
    int n, stars, spaces;
    
    do{
        System.out.print("Entrer le nombre des etoiles: ");
        n=input.nextInt();
    }while(n<5||n>15||n%2==0);
    
    stars=n;
    spaces=0;
    
    for(int i=0; i<n; i++)
    {
        for(int j=0; j<spaces; j++)
            System.out.print(" ");
        for(int j=0; j<stars; j++)
            System.out.print("*");
        System.out.println();
        stars --;
        spaces ++;
    }
    
    spaces = n-2;
    stars = 2;
    
    for(int i=0; i<n-1; i++)
    {
        for(int j=0; j<spaces; j++)
            System.out.print(" ");
        for(int j=0; j<stars; j++)
            System.out.print("*");
        System.out.println();
        stars ++;
        spaces --;
    }
    */

    /*
    int n, s, m, h,ms, j;
    
    Scanner input = new Scanner(System.in);
    
    do{
        System.out.print("Entrer le nombre de ms: ");
        n=input.nextInt();
    }while(n<0);
    
    ms=n%1000;
    n/=1000;
    s=n%60;
    n/=60;
    m=n%60;
    n/=60;
    h=n%60;
    n/=60;
    j=n%24;
    
    System.out.print("jours: "+j+" hours: "+h+" mins: "+m+" seconds: "+s+" ms: " + ms);
    
    */
    
    /*
  
    int n, spaces=0, stars=5;
    
    n=5;
    
    stars=n;
    
    for(int i=0; i<n; i++){
        for(int z=0; z<stars; z++){
            for(int j=0;j<spaces; j++)
                System.out.print(" ");
            for(int j=0;j<stars;j++)
                System.out.print("*");
            System.out.println();
        }
        
        spaces+=stars;
        stars--;
    }
    
    */
    
    /*
    Scanner input = new Scanner(System.in);
    
    int dec_num, quot, i=1, j;
    int bin_num[] = new int[100];
    
    System.out.print("Input a Decimal Number : ");
    dec_num = input.nextInt();
    
    quot = dec_num;
    
    while(quot !=0)
    {
        bin_num[i++] = quot%2;
        quot = quot/2;
    }
    
     System.out.print("Binary number is: ");
    for(j=i-1; j>0; j--)
    {
        System.out.print(bin_num[j]);
    }
    
    System.out.print("\n");
*/
    /*
    Scanner input = new Scanner(System.in);
    String bool ;
    boolean repeat = true;
    do{
    System.out.print("Enter a number: ");
    double num1 = input.nextDouble();
    
    System.out.print("Enter a Operator: ");
    String op = input.next();
    
    System.out.print("Enter another number: ");
    double num2 = input.nextDouble();
    
    if(op.equals("+")){
        System.out.println(num1+num2);
    }
    else if(op.equals("-")){
        System.out.println(num1-num2);
    }
    else if(op.equals("*")){
        System.out.println(num1*num2);
    }
    else if(op.equals("/")){
        System.out.println(num1/num2);
    }
    else{
        System.out.println("Invalid operator");
    }
    System.out.println("Do you want to continue?(Y/N)");
    bool = input.next();
    if(bool.equals("y"))
        continue;
    else
        repeat = false;
    }while(repeat);
    
    */
    /*
    Scanner input = new Scanner (System.in);
    int c;
        System.out.println("Enter a number:");
    c = input.nextInt();
    */
    /*
    switch (c){
        case 0: System.out.println("is 0");
        break;
        case 1: System.out.println("is one");
        break;
        case 2: System.out.println("is two"); 
        break;
        default:  System.out.println("is not a number");   
    }
*/
    
    /*
    if(c==0){
        System.out.println("is 0");
    }
    else if(c==1){
        System.out.println("is one");
    }
    else if(c==2){
        System.out.println("is two");
    }else{
        System.out.println("is not a number");
    }
*/
         
    
    }
    
}
