package com.company;

//配列をリスト型に変えることが出来なかったので改良としてゲームを開発した会社名を表示できるようにしました。

public class Client {
    public static void main(String[] args) {
        GameListAggregate gameListAggregate = new GameListAggregate();
        Iterator iterator = gameListAggregate.createIterator();
        gameListAggregate.add(new Game("テーブルトークRPG", 5000, "A社"));
        gameListAggregate.add(new Game("クリーチャーハンター", 7300, "B社"));
        gameListAggregate.add(new Game("ファーストファンタジー", 5400, "C社"));
        gameListAggregate.add(new Game("化け物ウォッチ", 5000, "D社"));
        iterator.first(); // まず探す場所を先頭位置にしてもらう

       // List<Game>gameList =new ArrayList<Game>();
        //gameList.add(new Game("AAA",2980));


        while ( ! iterator.isDone() ) { // まだある？ まだあるよ！
            Game game = (Game)iterator.getItem(); // はいどうぞ (と受取る)
            System.out.println(game.getName());
            System.out.println(game.getPrice());
            System.out.println(game.getCompany());
            iterator.next(); // 次を頂戴
        }
    }
}

