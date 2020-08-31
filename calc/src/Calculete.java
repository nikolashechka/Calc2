import java.util.Scanner;
public class Calculete {
    //переменные
    public static String num1="";
    public static String num2="";
    public static Boolean FlagRim=false;

    public static void main (String args[]){
        int result=0;
            Scanner in = new Scanner(System.in);
        System.out.println("Привет, добро пожаловать в калькулятор. Он считает арабские или римские  числа от 1(I) до 10(X).Введите операцию подсчета!");
        String Operation = in.nextLine();//получаю строку
        Operation=Operation.trim();// убираю пробелы

        if (Operation.indexOf('+')!=-1)
        {
            //то плюс
             num1= Operation.substring(0,Operation.indexOf('+'));//получаю число 1
             num2= Operation.substring(Operation.indexOf('+')+1);//получаю число 2
            //убираю пробелы
             num1=num1.trim();
             num2=num2.trim();
             ggg();
         try {
             //вычисление плюс
             result=Integer.parseInt(num1)+Integer.parseInt(num2);
             }
         catch (ArithmeticException e)
         {
             System.out.println("Оба числа должны быть или арабскими или римскими");
             System.exit(0);
         }
        }
        if (Operation.indexOf('-')!=-1)
        {
            //то минус
            num1= Operation.substring(0,Operation.indexOf('-'));
            num2= Operation.substring(Operation.indexOf('-')+1);
            num1=num1.trim();
            num2=num2.trim();
            ggg();
            try {
                //вычисление разность
                result=Integer.parseInt(num1)-Integer.parseInt(num2);
            }
            catch (ArithmeticException e)
            {
                System.out.println("Оба числа должны быть или арабскими или римскими");
                System.exit(0);
            }
        }
        if (Operation.indexOf('*')!=-1)
        {
            //то умножение
            num1= Operation.substring(0,Operation.indexOf('*'));
            num2= Operation.substring(Operation.indexOf('*')+1);
            num1=num1.trim();
            num2=num2.trim();
            ggg();
            try {
                //вычисление умножение
                result=Integer.parseInt(num1)*Integer.parseInt(num2);
            }
            catch (ArithmeticException e)
            {
                System.out.println("Оба числа должны быть или арабскими или римскими");
                System.exit(0);
            }
        }
        if (Operation.indexOf('/')!=-1)
        {
            //то деление
            num1= Operation.substring(0,Operation.indexOf('/'));
            num2= Operation.substring(Operation.indexOf('/')+1);
            num1=num1.trim();
            num2=num2.trim();
            ggg();
            try {
                //вычисление деление
                result=Integer.parseInt(num1)/Integer.parseInt(num2);
            }
            catch (ArithmeticException e)
            {
                System.out.println("Оба числа должны быть или арабскими или римскими");
                System.exit(0);
            }
        }
        String Rez="";
        //рассчитваю римске число
        if (FlagRim)
        {
            if (result==100)
            {
                Rez="C";
            }
            else
            {
                //считаю десятки
                int Promezh=result/10;
                for (int i=0;i<Promezh;i++)
                {
                    Rez=Rez+"X";
                }
                //считаю остаток
                Promezh=result%10;

                if (Promezh==9)
                {
                    Rez=Rez+"IX";
                }
                if (Promezh==8)
                {
                    Rez=Rez+"VIII";
                }
                if (Promezh==7)
                {
                    Rez=Rez+"VII";
                }
                if (Promezh==6)
                {
                    Rez=Rez+"VI";
                }
                if (Promezh==5)
                {
                    Rez=Rez+"V";
                }
                if (Promezh==4)
                {
                    Rez=Rez+"IV";
                }
                if (Promezh==3)
                {
                    Rez=Rez+"III";
                }
                if (Promezh==2)
                {
                    Rez=Rez+"II";
                }
                if (Promezh==1)
                {
                    Rez=Rez+"I";
                }
                if (Promezh==0)
                {
                    Rez="не нулей в римских цифрах";
                }
            }
        }
        else{
            // если арабское число
            Rez=Integer.toString(result);
        }
        //вывод
        System.out.println("Результат: "+Rez);
    }
    static void ggg()
    {
        //условие чтобы оба числа были или арабскими или цифрами
        if ((num1.equals("I") || num1.equals("II")  ||num1.equals("III")  || num1.equals("IV")  || num1.equals("V") ||num1.equals("VI") ||num1.equals("VII")   || num1.equals("VIII")  ||num1.equals("IX")  ||num1.equals("X"))&& (num2.equals("I") || num2.equals("II")  ||num2.equals("III")  || num2.equals("IV")  || num2.equals("V") ||num2.equals("VI") ||num2.equals("VII")  ||num2.equals("VIII")  ||num2.equals("IX")  ||num2.equals("X")))
        {
            //region Perevod
            switch (num1)
            {
                case "I":

                    num1="1";
                    break;
                case "II":
                    num1="2";
                    break;
                case "III":
                    num1="3";
                    break;
                case "IV":
                    num1="4";
                    break;
                case "V":
                    num1="5";
                    break;
                case "VI":
                    num1="6";
                    break;
                case "VII":
                    num1="7";
                    break;
                case "VIII":
                    num1="8";
                    break;
                case "IX":
                    num1="9";
                    break;
                case "X":
                    num1="10";
                    break;

            }

            switch (num2)
            {
                case "I":
                    num2="1";
                    break;
                case "II":
                    num2="2";
                    break;
                case "III":
                    num2="3";
                    break;
                case "IV":
                    num2="4";
                    break;
                case "V":
                    num2="5";
                    break;
                case "VI":
                    num2="6";
                    break;
                case "VII":
                    num2="7";
                    break;
                case "VIII":
                    num2="8";
                    break;
                case "IX":
                    num2="9";
                    break;
                case "X":
                    num2="10";
                    break;

            }
            //endregion}
        //на выходе знать какие цифры считаю
            FlagRim=true;
        }

        try {
            //условие чтоб от 1 до 10
            if (Integer.parseInt(num1)>10 || Integer.parseInt(num2)>10 ||Integer.parseInt(num1)<1 ||Integer.parseInt(num2)<1)
            {
                System.out.println("Возможно вы ввели не числа или пытаетесь провести операцию с арибскими и римскими цифрами одновременно либо число больше X");
                System.exit(0);
            }
        }
        catch (Exception e)
        {
            System.out.println("То что Вы вводите должно быть числами!");
            System.exit(0);
        }
    }
}
