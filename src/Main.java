import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a=2;
        while (a == 2) {
            System.out.println("Введите №задания или 0 для окончания программы");
            int b = in.nextInt();
            int c = 1;
            if (b == 1) {
                while (c == 1) {
                    System.out.println("Введите координату x(через запятую)");
                    double x = in.nextDouble();
                    if (x < 0) {
                        x = x * (-1);
                    }
                    System.out.println("Введите координату у(через запятую)");
                    double y = in.nextDouble();
                    if (y < 0) {
                        y = y * (-1);
                    }
                    double s = (x + y);
                    if (s >= 1 && s <= 1 * 1 + 1 * 1) {
                        System.out.println("Точка входит в зону");
                    } else {
                        System.out.println("Точка не входит в зону");
                    }
                    System.out.println("Чтобы выйти в главное меню нажмите '0' ");
                    c = in.nextInt();
                }
            } else if (b == 2) {
                while (c == 1) {

                    System.out.println("Введите день недели начала разговора (1-7)");
                    int d = in.nextInt();
                    System.out.println("Введите время начала разговора(часы - пример:'18')");
                    int t = in.nextInt();
                    System.out.println("Введите время начала разговора(минуты - пример:'57')");
                    int t1 = in.nextInt();
                    System.out.println("Введите продолжительность разговора в минутах");
                    int dt = in.nextInt();
                    System.out.println("Введите стоимость разговора за минуту");
                    double s = in.nextInt();
                    double sm = 0.0;
                    int min = t*60+t1;
                    if (min>21*60 || min<8*60){
                        s = s*0.8;
                    }
                    for (int i = 0; i<dt;i++){
                        min = min +1;
                        if (min == 24*60) {
                            d = d + 1;
                            min = 0;
                            if (d > 7) {
                                d = 1;
                            }
                        }
                        if ((d == 6) || (d == 7)) {
                            if ((min >21*60) || (min < 8*60)) {
                                sm = sm + (s * 0.8 * 0.9);
                            } else {
                                sm = sm + (s * 0.9);
                            }
                        }else if((d == 1) || (d == 2)||(d == 3) || (d == 4)||(d == 5)){
                            if (min>21*60 || min<8*60){
                                sm =sm+ s*0.8;
                            }
                            else {
                                sm=sm+s;
                            }
                        }

                    }
                    System.out.println("ВЫ должны вернуть в казну:");
                    System.out.println(sm);
                    System.out.println("Чтобы закончить нажмите '0' ");
                    c = in.nextInt();


                }

            }
            else if (b == 3) {
                while (c == 1) {
                    System.out.println("Введите число A");
                    int A = in.nextInt();
                    System.out.println("Введите число B");
                    int B = in.nextInt();
                    System.out.println("Введите число C");
                    int C = in.nextInt();
                    if (A % 2 == 0 || B % 2 == 0) {
                        System.out.println("Одно из чисел четное");
                    }
                    else {
                        System.out.println("Нет четных чисел");
                    }
                    if (A % 3 == 0 && B % 3 == 0 && C % 3 == 0) {
                        System.out.println("Все числа кратные трём");
                    }
                    else {
                        System.out.println("Не все числа кратны 3");
                        System.out.println("Чтобы закончить нажмите '0' ");
                        c = in.nextInt();
                    }

                }

            }
            else if (b == 0) {
                a = 1;
            }else {
                System.out.println("ОШИБКА! Читать научитесь!");
            }
        }
    }
}