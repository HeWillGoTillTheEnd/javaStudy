package chapter6;

public class FinalMethodEx {
    public static void main(String[] args) {

    }
}

class Chess{
    enum ChessPlayer{
        WHITE,BLACK
    }
    final ChessPlayer getFirstPlayer(){
        return ChessPlayer.WHITE;
    }
}


class WorldChess extends Chess{

//    @Override
//    ChessPlayer getFirstPlayer() {
//        return super.getFirstPlayer();
//    }
}