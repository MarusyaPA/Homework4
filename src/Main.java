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

        int speed = 80;
        if (speed < 60){
            System.out.println("Если скорость " + speed + " то можно ездить спокойно");
        }else {
            System.out.println("Если скорость " + speed + " придется заплатить штраф");
    }
        int ageChild=6;
        if (ageChild >= 2 && ageChild <= 6){
            System.out.println("Если возраст человека равен " + ageChild + " то ему нужно ходить в детский сад");
    }
        int ageSchool=9;
        if (ageSchool >= 7 && ageChild <= 18){
            System.out.println("Если возраст человека равен " + ageSchool + " то ему нужно ходить в школу");
        }
        int ageUniverse=21;
        if (ageUniverse >18  && ageUniverse <= 24){
            System.out.println("Если возраст человека равен " + ageUniverse + " то ему нужно ходить в институт");
        }
        int ageForWork=30;
        if (ageForWork >24 ){
            System.out.println("Если возраст человека равен " + ageForWork + " то ему пора работать");
        }
        int age1=4;
        if (age1 <= 5){
            System.out.println("Если возраст ребенка равен " + age1 + " то ему нельзя кататься на аттракционе");
        }
        int age4=7;
        if (age4 >5  && age2 < 14){
            System.out.println("Если возраст ребенка равен " + age4 + " он может кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя");
        }
        int age3=16;
        if (ageForWork >15 ){
            System.out.println("Если возраст ребенка равен " + age3 + " то он может кататься без сопровождения взрослого");
        }
        int trainPlace=120;
        int sitPlace = 35;
        int stayPlace = 15;
        if (trainPlace> sitPlace+stayPlace){
            System.out.println("свободные места в вагоне есть");
    } else {
            System.out.println("свободных мест в вагоне нет");
        }
        int one = 1;
        int two = 2;
        int three = 3;
        if (one>two && one>three) {
            System.out.println ("1 самое большое число");
        } else {
            System.out.println("1 не самое большое число");}
        if (two>one && two>three) {
            System.out.println ("2 самое большое число");
        } else {
            System.out.println("2 не самое большое число");}
        if (three>two && three>one) {
            System.out.println ("3 самое большое число");
        } else {
            System.out.println("3 не самое большое число");}
    }
}