import com.learn.ProviderService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * xml的方式调用
 *
 */
public class App {
    public static void main( String[] args ) throws IOException {

        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("consumer.xml");
        context.start();
        ProviderService providerService = (ProviderService) context.getBean("providerService");
        String str = providerService.SayHello("ni chacha");
        System.out.println(str);
        System.in.read();

    }
}