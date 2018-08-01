package goncharuk.ross.Patterns.Other;

import goncharuk.ross.Patterns.Other.DependencyInjection.*;
import goncharuk.ross.Patterns.Other.MVC.Student;
import goncharuk.ross.Patterns.Other.MVC.StudentController;
import goncharuk.ross.Patterns.Other.MVC.StudentView;

public class OtherPatternsMain {
    public static void main(String[] args) {

        //Dependency Injection - dependencies (services) are injected, or passed by reference, into a dependent object (Consumer)
        //and are made part of the client's state.
        //Separates the creation of client's dependencies from it's own behavior, which allows a loosely coupled design
        //and follow the IoC and SRP
        MessageServiceInjector injector = new EmailServiceInjector();
        Consumer app = injector.getConsumer();
        app.processMessage("Email","rgoncharuk@gmail.com");
        injector = new SMSServiceInjector();
        app = injector.getConsumer();
        app.processMessage("SMS", "0963214286");
        System.out.println("------------------------- MVC");

        //MVC - separate the user interface into three interconnected components: Model - manages data,
        //View - displays data, Controller - mediator - update data and re-display view.
        Student modelObject = new Student("Ross","FL301");
        StudentView view = new StudentView();
        StudentController controller = new StudentController(modelObject,view);
        view.displayModel(modelObject.getName(),modelObject.getGroup());
        //change model through controller - view is updated automatically
        controller.setStudentGroup("FL401");
    }
}
