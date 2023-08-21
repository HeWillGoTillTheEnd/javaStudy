package problems4.q2;

public interface Delicious {

    void eat();

    void sweet();

    interface Edible extends Delicious{
        void eat();
    }
    interface Sweetable extends Delicious{
        void sweet();
    }
}
