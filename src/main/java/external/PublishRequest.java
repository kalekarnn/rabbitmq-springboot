package external;

import java.io.Serializable;

public class PublishRequest implements Serializable {

    private static final long serialVersionUID = 4171804338654722565L;

    private String exchangeName;
    private String message;

    public String getExchangeName() {
        return exchangeName;
    }

    public void setExchangeName(String exchangeName) {
        this.exchangeName = exchangeName;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
