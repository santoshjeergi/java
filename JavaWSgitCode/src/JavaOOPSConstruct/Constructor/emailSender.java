package JavaOOPSConstruct.Constructor;

import java.util.ArrayList;

public class emailSender implements SendNotifications{
    @Override
    public void sendEmailNotifications(ArrayList<User> users) {
        for ( User u : users)
        {
            System.out.println("sending email to:" + u.email);
        }
    }
}
