package Homeworks.Homework_7_2;

public class Tack_3 {

    public static String declareWinner(Fighter fighter1, Fighter fighter2, String firstAttacker) {

        String win = "";

        while (true) {
            if (firstAttacker.equals(fighter1.name)) {

                System.out.println(fighter1.name + " наносит удар");

                fighter2.health -= fighter1.damagePerAttack;

                if (fighter1.health <= 0) {
                    break;
                }
                if (fighter2.health <= 0) {
                    break;
                }

                if (fighter2.health > fighter1.health) {
                    win = fighter2.name;
                } else if (fighter1.health > fighter2.health) {
                    win = fighter1.name;
                }

                System.out.println(fighter2.name + " получил " + fighter1.damagePerAttack + " урона " +
                        " и у него" +
                        " осталось " + fighter2.health + " здоровья.");
                System.out.println(fighter2.name + " наносит удар");

                fighter1.health -= fighter2.damagePerAttack;

                if (fighter1.health <= 0) {
                    break;
                }
                if (fighter2.health <= 0) {
                    break;
                }

                if (fighter2.health > fighter1.health) {
                    win = fighter2.name;
                } else if (fighter1.health > fighter2.health) {
                    win = fighter1.name;
                }

                System.out.println(fighter1.name + " получил " + fighter2.damagePerAttack +
                        " урона " + " и у него" +
                        " осталось " + fighter1.health + " здоровья.");
            }

            if (firstAttacker.equals(fighter2.name)) {
                System.out.println(fighter2.name + " наносит удар");

                fighter1.health -= fighter2.damagePerAttack;

                if (fighter1.health <= 0) {
                    break;
                }
                if (fighter2.health <= 0) {
                    break;
                }

                if (fighter2.health > fighter1.health) {
                    win = fighter2.name;
                } else if (fighter1.health > fighter2.health) {
                    win = fighter1.name;
                }

                System.out.println(fighter1.name + " получил " + fighter2.damagePerAttack +
                        " урона " + " и у него" +
                        " осталось " + fighter1.health + " здоровья.");
                System.out.println(fighter1.name + " наносит удар");

                fighter2.health -= fighter1.damagePerAttack;

                if (fighter1.health <= 0) {
                    break;
                }
                if (fighter2.health <= 0) {
                    break;
                }

                if (fighter2.health > fighter1.health) {
                    win = fighter2.name;
                } else if (fighter1.health > fighter2.health) {
                    win = fighter1.name;
                }

                System.out.println(fighter2.name + " получил " + fighter1.damagePerAttack +
                        " урона " + " и у него" +
                        " осталось " + fighter2.health + " здоровья.");

            }
        }

        if (fighter2.health > fighter1.health) {
            win = fighter2.name;
        } else if (fighter1.health > fighter2.health) {
            win = fighter1.name;
        }

        return win;
    }

    public static void main(String[] args) {

//        System.out.println(declareWinner(new Fighter("boris", 15, 5),
//                new Fighter("harry", 10, 2), "boris"));
    }
}
