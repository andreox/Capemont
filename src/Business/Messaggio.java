package Business;

import java.io.Serializable;

public class Messaggio implements Serializable {

    private static final long serialVersionUID = 6529685098267757690L;
    private String command ;
    private Object object ;

    public Messaggio(String command, Object object) {
        this.command = command;
        this.object = object;
    }

    public String getCommand() {
        return command;
    }

    public void setCommand(String command) {
        this.command = command;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }
}
