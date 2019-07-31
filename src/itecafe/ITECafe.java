/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package itecafe;

import java.util.Scanner;

public class ITECafe {

    public static void main(String[] args) {
        //準備

        Item hotcoffee = new Item(1, "ホットコーヒー", 280);
        Item tea = new Item(2, "紅茶", 260);
        Item icecoffee = new Item(3, "アイスコーヒー", 200);
        Item icetea = new Item(4, "アイスティー", 260);
        Item syoutokeeki = new Item(5, "ショートケーキ", 400);
        Item tiizukeki = new Item(6, "チーズケーキ", 400);
        Item tyokokeki = new Item(7, "チョコレートケーキ", 450);
        Item tyokobanana = new Item(8, "チョコバナナパフェ", 390);
        Item itigo = new Item(9, "イチゴパフェ", 390);
        Item meet = new Item(10, "ミートパスタ", 650);
        Item mixtuksu = new Item(11, "ミックスピザ", 700);
        Item kurowaxtusan = new Item(12, "クロワッサン", 180);
        Item tosuto = new Item(13, "トーストサンド", 200);
        Item hurenti = new Item(14, "フレンチトースト", 210);

        Item[] items = new Item[20];
        items[0] = hotcoffee;
        items[1] = tea;
        items[2] = icecoffee;
        items[3] = icetea;
        items[4] = syoutokeeki;
        items[5] = tiizukeki;
        items[6] = tyokokeki;
        items[7] = tyokobanana;
        items[8] = itigo;
        items[9] = meet;
        items[10] = mixtuksu;
        items[11] = kurowaxtusan;
        items[12] = tosuto;
        items[13] = hurenti;
        Scanner sach = new Scanner(System.in);
        //メニューを表示
        while(true){
  
        System.out.println("ITE Cafe システム");
   

        int Syouhinbangou = 0;    //商品番号
        int Suuryou = 0;    //数量
        int outNum3 = 0;
        int Genkin = 0;
        int outNum5 = 0;
        int goukei = 0;

        while (true) {
            System.out.println(hotcoffee.getNo() + "：" + hotcoffee.getName());
            System.out.println(tea.getNo() + ":" + tea.getName());
            System.out.println(icecoffee.getNo() + ":" + icecoffee.getName());
            System.out.println(icetea.getNo() + ":" + icetea.getName());
            System.out.println(syoutokeeki.getNo() + ":" + syoutokeeki.getName());
            System.out.println(tiizukeki.getNo() + ":" + tiizukeki.getName());
            System.out.println(tyokokeki.getNo() + ":" + tyokokeki.getName());
            System.out.println(tyokobanana.getNo() + ":" + tyokobanana.getName());
            System.out.println(itigo.getNo() + ":" + itigo.getName());
            System.out.println(meet.getNo() + ":" + meet.getName());
            System.out.println(mixtuksu.getNo() + ":" + mixtuksu.getName());
            System.out.println(kurowaxtusan.getNo() + ":" + kurowaxtusan.getName());
            System.out.println(tosuto.getNo() + ":" + tosuto.getName());
            System.out.println(hurenti.getNo() + ":" + hurenti.getName());
            while (true) {
                //商品を入力
                System.out.println("番号を入力してください");

                try {
                    Scanner scan = new Scanner(System.in);
                    String num = scan.next();
                    Syouhinbangou = Integer.parseInt(num);
                    
                    if(Syouhinbangou <= 0){
                        System.out.println("システムを終了します");
                        System.exit(0);
   
                    }

                    System.out.println(items[Syouhinbangou - 1].getNo() + ":" + items[Syouhinbangou - 1].getName() + "" + items[Syouhinbangou - 1].getPrics() + "円が入力されました");

                    break;

                } catch (NumberFormatException e) {
                    System.out.println("[入力エラー:数値を入力してください]");
                }
            }

            //数を入力
            System.out.println("数量入力してください");
            try {
                Scanner scan = new Scanner(System.in);
                String num = scan.next();
                Suuryou = Integer.parseInt(num);
                //System.out.println(outNum2);

            } catch (NumberFormatException e) {
                System.out.println("[入力エラー:数値を入力してください]");
            }

            //合計金額を出す
            goukei = items[Syouhinbangou - 1].getPrics() * Suuryou;
            System.out.println("合計" + (int) (goukei * 1.08) + "円です");

            //終了？？　終了なら break;
            System.out.println("お会計に進みますか？1.はい　2.いいえ");
            Scanner scan = new Scanner(System.in);

            try {
                String num = scan.next();
                outNum3 = Integer.parseInt(num);
                if (outNum3 == 1) {
                    break;
                }
            } catch (NumberFormatException e) {

            }
        }

        while (true) {
            System.out.println("お金を入れてください");
            try {
                Scanner scan = new Scanner(System.in);
                String num = scan.next();
                Genkin = Integer.parseInt(num);
            } catch (NumberFormatException e) {

            }
            System.out.println(Genkin + "でよろしいですか？ 1.はい 2.いいえ");
            Scanner scan = new Scanner(System.in);

            try {
                String num = scan.next();
                outNum5 = Integer.parseInt(num);
                if (outNum5 == 1) {
                    if (Genkin >= goukei) {
                        break;
                    }
                }
            } catch (NumberFormatException e) {

            }

        }
        System.out.println("お釣りは" + (Genkin - (int)(goukei * 1.08)) + "円です");
        }
  
    }

}
