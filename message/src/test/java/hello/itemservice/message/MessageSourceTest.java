package hello.itemservice.message;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.MessageSource;

import java.util.Locale;

import static org.assertj.core.api.Assertions.*;

@SpringBootTest
public class MessageSourceTest {

    @Autowired
    MessageSource ms;

    @Test
    void helloMessage(){
        Locale aDefault = Locale.getDefault();
        System.out.println("aDefault = " + aDefault);
        String result = ms.getMessage("hello", null, Locale.KOREA);
        assertThat(result).isEqualTo("안녕");
    }

}