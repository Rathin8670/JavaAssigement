package Ass7;

public class Ques4 {
    
    public static void main(String[] args) {
        String str="MODEM IS AN ELECTRONIC DEFGVICE";
        String[] words=str.split(" ");
        
        for(int i=0;i<words.length;i++){
            String st=words[i];
            int cnt=1;
            for(int j=0;j<st.length()-1;j++){
                if(st.charAt(j)+1==st.charAt(j+1)){
                    cnt++;
                }
            }
            if(cnt>=2){
                System.out.println(st+" Length "+cnt);
            }
        }
    }
}
