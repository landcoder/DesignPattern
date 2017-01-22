package state;

/**
 * Desc
 * Created by Mustang on 17/1/22.
 */
public class RedState implements State {
    @Override
    public void last(Context c) {
        c.setState(new BlueState());
    }

    @Override
    public void next(Context c) {
        c.setState(new GreenState());
    }

    @Override
    public String getState() {
        return "red";
    }
}
