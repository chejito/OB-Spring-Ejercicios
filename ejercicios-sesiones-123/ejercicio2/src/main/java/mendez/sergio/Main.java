package mendez.sergio;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        // Contexto de la aplicación
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        // Instanciamos una variable userService
        UserService userService = (UserService) context.getBean("userService");

        // Dentro del atributo notificationService del userService invocamos su método imprimirSaludo()
        userService.notificationService.imprimirSaludo();

    }

}
