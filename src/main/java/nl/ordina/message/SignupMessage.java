package nl.ordina.message;

import static nl.ordina.message.MessageType.SIGNUP;

public class SignupMessage extends Message {

    private String name;
    private String color;

    public SignupMessage() {
        setType(SIGNUP);
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}