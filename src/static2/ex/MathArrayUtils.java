package static2.ex;

public class MathArrayUtils {

    //유틸리티성 클래스
    //객체를 만들지 않아도 됨->생성자 막기용
    private MathArrayUtils() {}

    public static int sum(int[] number){
        int sum=0;
        for(int num:number){
            sum+=num;
        }
        return sum;
    }

    public static double average(int[] number){
        return (double)sum(number)/number.length;
    }

    public static int min(int[] number){
        int min=number[0];
        for(int num:number){
            if (num<min) min=num;
        }
        return min;
    }

    public static int max(int[] number){
        int max=number[0];
        for(int num:number){
            if (num>max) max=num;
        }
        return max;
    }





}
