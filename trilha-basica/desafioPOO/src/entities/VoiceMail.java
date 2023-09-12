package entities;

public class VoiceMail {

    private Double duration;
    private String name;
    private String message;

    public VoiceMail(Double duration, String name, String message) {
        this.duration = duration;
        this.name = name;
        this.message = message;
    }

    public Double getDuration() {
        return duration;
    }

    public void setDuration(Double duration) {
        this.duration = duration;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}