public class EquqlToEqualTOandEquals {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "hello";

        System.out.println("s1 == s2 ? : " +(s1 == s2) );
        System.out.println("adress of hashcode s1 :"+s1.hashCode());
        System.out.println("adress of hashcode s2: "+s2.hashCode());

        String s3 = new String("hello");
        System.out.println("address of s3 :" +s3.hashCode());
        System.out.println("s2 == s3 : " +s2 == s3);

        System.out.println("s3.equals s1 "+s3.equals(s1));

        
    }
}
