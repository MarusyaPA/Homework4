public class Main {
    public static void main(String[] args) {
        int age = 22;
        if (age > 18)
            System.out.println("Если возраст человека равен " +age+ " то он совершеннолетний");
        int age2 = 17;
        if (age2 < 18)
            System.out.println("Если возраст человека равен " +age2+ " он не достиг совершеннолетия, нужно немного подождать");

        float temp = 5.5F;
        if (temp < 10)
            System.out.println("На улице " +temp+ " нужно надеть шапку");
        float temp2 = 11.3F;
        if (temp2 > 10)
            System.out.println("На улице " +temp2+ " можно идти без шапки");

        int speed = 55;
        if (speed < 60)
            System.out.println("Если скорость " +speed+ " то можно ездить спокойно");
        int speed2 = 80;
        if (speed2 > 60)
            System.out.println("Если скорость " +speed2+ " придется заплатить штраф");
    }
}