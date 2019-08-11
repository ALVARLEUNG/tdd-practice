import java.util.List;

public class Player {
    private List<Poker> pokers;

    public Player(List<Poker> pokers) {
        this.pokers = pokers;
    }

    public Player() {
    }

    public List<Poker> getPokers() {
        return pokers;
    }

    public void setPokers(List<Poker> pokers) {
        this.pokers = pokers;
    }
}
