package com.company;

public class Game {
        private String name; // 名称
        private int price; // 価格
        private  String  company;
        public Game(String name, int price, String company) { // コンストラクタ
            this.name= name;
            this.price = price;
            this.company =company;
        }
        public String getName() { // 名称を取得
            return name;
        }
        public int getPrice() { // 価格を取得
            return price;
        }
        public String getCompany() { // 価格を取得
            return company;
        }
    }

