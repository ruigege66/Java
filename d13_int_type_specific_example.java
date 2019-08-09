public class d13_int_type_specific_example{
    public static void main(String[] args){
        long i5 = 100L;
        //int i6 = i5;
        //??????????????????
        int i6 = (int)i5;
        System.out.println(i6);

        long i7 = 2147483648L;
        int i8 = (int)i7;
        System.out.println(i8);

        byte i11 = 50;
        byte i9 = 127;
        byte i10 = 128;


    }
}
