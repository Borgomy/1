import java.util.Scanner;
import java.text.*;
import java.util.Date;
public class M {
    public static void main(String argc[]){
        
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
        System.out.println(sdf.format(new Date()));
        Date d=new Date();
        
        String str =String.valueOf(d);
        System.out.println(str.charAt(8)+""+str.charAt(9));
        System.out.println(System.currentTimeMillis());
        /* 
        int mas[];
        int count,c;
        int del;
        System.out.println("Введите количество элементов");
        Scanner sc=newScanner(System.m);
        count=sc.nextInt();
        mas=new int[count];

        for(i=1;i<count;i++){
        mas[i]=sc.nextInt();}
        
        System.out.println("Какое число убрать? ");
        del =sc.nextInt();
        for(int i=0; i<count; i++){
            if(mas[i]==del){c++;}
            int mas2[] = new int[count-c];
            c=0;
            for(int y=0;i<count;i++){                   массив делается без к-л числа
                if(mas[i]!=del){mas2[c]=mas[i];}
                c++;
                for(int i=0;i<c;i++){
                    System.out.println(mas2[i]);
                }
            }
        }
*/
       
    }
    
}
