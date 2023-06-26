// 2) Вывести все простые числа от 1 до 1000
public class task2 {
    public static void main(String[] args) {
        System.out.println(simple_nums(1000)); 
    }
    static String simple_nums(int max_value){
        String simple_nums = "";
        int count_of_deletel = 0;
        for (int i = 2;i<=max_value; i++){
            for (int j = 2; j<=i/2;j++){
                if (i%j == 0 && i!=j){
                    count_of_deletel++;  
                }
            }
            if (count_of_deletel==0){
                simple_nums+= i + " ";
            }
            count_of_deletel = 0;
        }
        return simple_nums;
    }
}
