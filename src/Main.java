//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

            public static void main(String[] args) {
                System.out.println(permission(25, 16));
                System.out.println(permission(18, 21));
                System.out.println(permission(50, 7));
                System.out.println(permission(30, 1 ));
                System.out.println(permission(generateRandomAge(), 25));
                System.out.println(permission(generateRandomAge(), 36 ));
            }


            public static String permission(int age, int temperature) {
                if ((age >= 20 && age <= 45 && temperature >= -20 && temperature <= 30) ||
                        (age < 20 && temperature >= 0 && temperature <= 28) ||
                        (age > 45 && temperature >= -10 && temperature <= 25)) {
                    return "Можно идти гулять";
                } else {
                    return "Остатся дома ";
                }
            }


            public static int generateRandomAge() {

                return (int) (Math.random() * 100) + 1;
            }
        }