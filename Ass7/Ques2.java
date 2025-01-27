package Ass7;

public class Ques2 {
    static int findSumOfSquareDigits(int n){
        int res=0;
        while(n>0){
            int rem=n%10;
            res+=(rem*rem);
            n/=10;
        }
        return res;
    }
    public static void main(String[] args) {
        String str="VAT";
        String newStr="";

        for(int i=0;i<str.length();i++){
            newStr+=(str.charAt(i)-64);
        }

        int num=Integer.parseInt(newStr);
    

        while(num!=1 && num!=4){
            int temp=findSumOfSquareDigits(num);
            num=temp;
        }

        if(num==1){
            System.out.println("Beauty No");
        }else{
            System.out.println("Dirty No");
        }  
    }
    
}
