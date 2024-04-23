package classes;

public class Context {
    Strategy verifyMethod;

    public Context(Strategy verifyMethod) {
        this.verifyMethod = verifyMethod;
    }

    public Context() {
        this.verifyMethod = new VerifyTribune();
    }

    public void setVerifyMethod(Strategy verifyMethod) {
        this.verifyMethod = verifyMethod;
    }

    public void verifyAttendee(Attendee attendee) {
        verifyMethod.verify(attendee.getName());
    }
}
