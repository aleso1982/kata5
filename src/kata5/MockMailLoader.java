package kata5;

public class MockMailLoader implements MailLoader{

    @Override
    public Mail[] load() {
        Mail[] mails = new Mail[5];
        mails[0] = new Mail("prueba@google.com");
        mails[1] = new Mail("prueba@google.com");
        mails[2] = new Mail("prueba@yahoo.com");
        mails[3] = new Mail("prueba@outlook.com");
        mails[4] = new Mail("prueba@google.com");
        return mails;
    }
    
}
