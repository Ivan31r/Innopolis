package algorithmsAndDataStructures.simpAlgorithms.testAlgorithms;

public class GBCourse {
    public static void main(String[] args) {
        System.out.println(pe(2, 9));

    }

    public static int pe(int base, int sign) {
        int result = 1;
        while (sign > 0) {
            if (sign % 2 == 0) {
                sign /= 2;
                base*= base;
            } else {
                sign -= 1;
                result *= base;
            }
        }
        return result;
    }

//    public static int power(int base,int sign){
//        int result=1;
//        while (sign>0){
//            if (sign%2==0){
//                sign/=2;
//                base*=base;
//            }else {
//                sign-=1;
//                result*=base;
//            }
//        }
//        return result;
//    }
}
