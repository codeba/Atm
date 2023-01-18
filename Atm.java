package patika;

import java.util.Scanner;

public class Atm {
    public static void main(String[] args) {
        String userName, pasword;
        int right = 3;
        int balance = 1500;
        int select;
        Scanner sc = new Scanner(System.in);
        while (right > 0) {
            System.out.println("Kullanıcı adınız:");
            userName = sc.nextLine();
            System.out.println("şifreniz:");
            pasword = sc.nextLine();
            if (userName.equals("patika") && pasword.equals("dev123")) {
                System.out.println("Merhaba XXX bankasına hoşgeldiniz");
                do {
                    System.out.println("Lütfen yapmak istediğiniz işlemi seciniz");
                    System.out.println("1-Para yatırma\n2-Para Çekme\n3-Bakiye Sorma\n4-Çıkış yap");
                    select = sc.nextInt();
                    if (select == 1) {
                        System.out.println("para miktarı:");
                        int price = sc.nextInt();
                        balance += price;

                    } else if (select == 2) {
                        System.out.println("para miktarı:");
                        int price = sc.nextInt();
                        if (balance < price) {
                            System.out.println("bakiye yetersiz");
                        } else {
                            balance -= price;
                        }
                    } else if (select == 3) {
                        System.out.println("Bakiyeniz:" + balance);
                    }
                } while (select != 4);
                System.out.println("tekrar görüşmek üzere");
                break;
            } else {
                right--;
                System.out.println("hatalı giriş yaptınız!!!");
                if (right == 0) {
                    System.out.println("Hesabınız bloke olmuştur");
                }
                System.out.println("Kalan hakkınız:" + --right);
            }
        }
    }
}
