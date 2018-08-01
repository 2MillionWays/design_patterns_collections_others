package goncharuk.ross.Patterns.Behavioral.Observer;

//Observer interface - defines interface for subscribers notification of subject's changes
public interface Observer {

    //method to update observer used by subject
    void update();

    //attach with subject to observer
    void setSubject(Subject sub);
}
