package main;

import classes.Attendee;
import classes.Context;
import classes.VerifyTribune;
import classes.VerifyVIP;

public class Program {
    public static void main(String[] args) {
        Attendee a1 = new Attendee("VIP");
        Attendee a2 = new Attendee("Tribuna");
        Attendee a3 = new Attendee("Peluza");

        Context c = new Context();

        c.verifyAttendee(a3);

        c.setVerifyMethod(new VerifyTribune());
        c.verifyAttendee(a2);

        c.setVerifyMethod(new VerifyVIP());
        c.verifyAttendee(a1);
    }
}
