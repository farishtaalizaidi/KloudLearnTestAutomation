package model;

public class RegistrationPageElement {

    private String id;
    private String keysToSend;

    public RegistrationPageElement(String id, String keysToSend) {
        this.id = id;
        this.keysToSend = keysToSend;
    }

    public String getId() {
        return id;
    }

    public String getKeysToSend() {
        return keysToSend;
    }
}
