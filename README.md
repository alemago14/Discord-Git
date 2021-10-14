# Discord-Git

la banda del lechuga

<<<<<<< HEAD

Sandra was here!
=======
Que puto que sos VAle no

<h1 style="color:#0489"> Gero anashe probando alg</h1>

Barry#numb.ERONE!

## Con esto envias mails con SpringBoot ALE



```java
// using SendGrid's Java Library
// https://github.com/sendgrid/sendgrid-java
import com.sendgrid.*;
import java.io.IOException;

public class Example {
  public static void main(String[] args) throws IOException {
    Email from = new Email("test@example.com");
    String subject = "Sending with SendGrid is Fun";
    Email to = new Email("test@example.com");
    Content content = new Content("text/plain", "and easy to do anywhere, even with Java");
    Mail mail = new Mail(from, subject, to, content);

    SendGrid sg = new SendGrid(System.getenv("SENDGRID_API_KEY"));
    Request request = new Request();
    try {
      request.setMethod(Method.POST);
      request.setEndpoint("mail/send");
      request.setBody(mail.build());
      Response response = sg.api(request);
      System.out.println(response.getStatusCode());
      System.out.println(response.getBody());
      System.out.println(response.getHeaders());
    } catch (IOException ex) {
      throw ex;
    }
  }

```
<<<<<<< HEAD
>>>>>>> 5ec20d12cee0b431e249d66def2631926777cddb
=======
<<<<<<< HEAD
</div>

## Felipe Herrera!
=======
>>>>>>> 5ec20d12cee0b431e249d66def2631926777cddb
>>>>>>> d1d160b4faf50f23cac770ffc2c2cf77e4df9200
>>>>>>> 26f0fd2731aef076c806c14bd04ad2fd6c79b961
