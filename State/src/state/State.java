package state;

/**
 * Desc
 * Created by Mustang on 17/1/22.
 */
public interface State {

    /**
     * 上一个
     * @param c
     */
    void last(Context c);

    /**
     * 下一个
     * @param c
     */
    void next(Context c);

    /**
     * 获取状态
     * @return
     */
    String getState();
}
