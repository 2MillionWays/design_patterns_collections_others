package goncharuk.ross.Patterns.Other.MVC;

//Controller class - mediator for view and controller
public class StudentController {

    private Student student;
    private StudentView studentView;

    public StudentController(Student student, StudentView studentView) {
        this.student = student;
        this.studentView = studentView;
    }

    public void setStudentName(String name) {
        this.student.setName(name);
        updateView();
    }

    public void setStudentGroup(String group){
        this.student.setGroup(group);
        updateView();
    }

    private void updateView(){
        this.studentView.displayModel(this.student.getName(),this.student.getGroup());
    }
}
