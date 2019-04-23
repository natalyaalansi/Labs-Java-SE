package sample;

/**
 * Created with IntelliJ IDEA.
 * User: user
 * Date: 20.03.18
 * Time: 23:52
 * To change this template use File | Settings | File Templates.
 */
public class IOResult<T> {

    private T data;
    private boolean ok;

    // проверка успешности операции
    public IOResult(boolean ok, T data) {
        this.ok = ok;
        this.data = data;
    }

    public boolean isOk() {
        return ok;
    }

    public boolean hasData() {
        return data != null;
    }

    public T getData() {
        return data;
    }

}
