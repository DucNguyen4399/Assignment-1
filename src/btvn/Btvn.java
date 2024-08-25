package btvn;
public class Btvn
{  
    public static void main(String[] args)
    {
        int number1=11;
        int number2=22;
        
        //Phép Cộng
        int sum=number1 + number2;
        System.out.println("Phep cong:" + number1 + "+" + number2 + "=" + sum);
        
        //Phép trừ
        int dif=number1 - number2;
        System.out.println("Phep tru: " + number1 + "-" + number2 + "=" + dif);
        
        //Phép Nhân
        int mul=number1 * number2;
        System.out.println("Phep nhan:" + number1 + "*" + number2 + "=" + mul);
                
        //Phép chia
        int div=number1 / number2;
        System.out.println("Phep chia:" +number1 + "/" + number2 + "=" + div);
        
        //Phép Chia Lấy Dư
        int divGetRemainder=number1 % number2;
        System.out.println("Phep chia lay du:" + number1 + "%" + number2 + "=" + divGetRemainder);
    }
}

