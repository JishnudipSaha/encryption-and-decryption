import java.util.*;
class encr
{
    String encryptText(String st)
    {
      
        int l=st.length();
        int x=0;
       String  sc="";
        while(l-1>=0)
        {
            int k=(st.charAt(x))+1;
            char c=(char)k;
            sc=c+sc;
            l--;
            x++;
        }
        return sc;
    }
    String decryptText(String s1)
    {
        int l1=s1.length();
        int x1=0;
        String sc1="";
        while(l1-1>=0)
        {
            int k1=(s1.charAt(x1))-1;
            char c1=(char)k1;
            sc1=c1+sc1;
            l1--;
            x1++;
        }
        return sc1;
    }
    public static void main(String []args)
    {
        encr Math=new encr();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:-");
        String str=sc.nextLine();
        String showenc=Math.encryptText(str);
        String showdec=Math.decryptText(showenc);
        System.out.println("the encrypt text is:-"+showenc);
        System.out.println("the decrypt text is:-"+showdec);
    }
}