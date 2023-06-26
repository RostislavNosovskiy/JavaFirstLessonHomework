// import java.util.Scanner;

// // 4) (дополнительное задание) Задано уравнение вида q + w = e,
// //  q, w, e >= 0. Некоторые цифры могут быть заменены знаком вопроса, 
// //  например, 2? + ?5 = 69. Требуется восстановить выражение до верного равенства.
// //   Предложить хотя бы одно решение или сообщить, что его нет.
// public class task4 {
//     public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введите выражение, обязательно разделяйте все числа и знаки операций пробелами");
//        String expression = scanner.nextLine();
//        String res = res(split(expression));
//        System.out.println(res);

//     }
//     static String[] split (String expression ){
//         String [] result = new String[3];
//         String[] arr = expression.split(" ");
//         result[0] = arr[0];
//         result[1] = arr[2];
//         result[2] = arr[4];
//         return result;
//     }

//     static String res (String [] split){
        
//         String q = split[0];
//         String e = split[1];
//         String w = split[2];
//         char []qi = new char [2];
//         char []ei = new char [2];
//         char []wi = new char [2];
//         for(int i = 0; i<2; i++){
//             qi[i]= q.charAt(i);
//             ei[i]= e.charAt(i);
//             wi[i]= w.charAt(i);
//         }

//         for(int i = 0; i<2; i++){
//             if (qi[i] == '?' && ei[i] == '?'){
//                 qi[i] = '1';
//                 int num = Character.digit(wi[i], 10)-1;
//                 ei[i] = (char) num;
//             }else if (qi[i]== '?'&& ei[i] != '?' ){
//                 int num = Character.digit(wi[i], 10)-Character.digit(ei[i], 10);
//                 qi[i] = (char) num;
//             }else if (ei[i]== '?'&& qi[i] != '?'){
//                 int num = Character.digit(wi[i], 10)-Character.digit(qi[i], 10);
//                 ei[i] = (char) num;}

//         }String qres = "";
//         for(int i = 0; i<2; i++){
//             String s  = String.valueOf(qi[i]);
//             qres+=s;}
//         String eres = "";
//         for(int i = 0; i<2; i++){
//             String s  = String.valueOf(ei[i]);
//             eres+=s;}

//         String result = "";
//         result = qres+"+"+eres+"="+w;
//         return result;

//     }
// }
