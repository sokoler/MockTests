package workshop.mock.testexercise.service;



public class GreetService {

    private String defaultGreeting = "Hello Mock!";

    public String hello(String name) {
        return name == null ? defaultGreeting: "Hello " + name;
    }

    public String goodbye( String bye){
        return bye == null ? defaultGreeting: "Bye " + bye;
    }

}
