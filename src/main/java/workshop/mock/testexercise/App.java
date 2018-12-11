package workshop.mock.testexercise;

import workshop.mock.testexercise.service.GreetService;

public class App {

    private GreetService greetService;

    public String greetLowerCase(String name) {
        return greetService.hello(name).toLowerCase();
    }

    public String byeUpperCase(String bye) {
        return greetService.goodbye(bye).toUpperCase();
    }

}
