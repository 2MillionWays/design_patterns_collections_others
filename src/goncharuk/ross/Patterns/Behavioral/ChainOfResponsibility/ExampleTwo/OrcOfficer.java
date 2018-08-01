package goncharuk.ross.Patterns.Behavioral.ChainOfResponsibility.ExampleTwo;

public class OrcOfficer extends RequestHandler {

    public OrcOfficer(RequestHandler handler) {
        super(handler);
    }

    @Override
    public void handleRequest(Request req) {
        if (req.getRequestType().equals(Request.RequestType.TORTURE_PRISONER)) {
            printHandling(req);
            req.markHandled();
        } else {
            super.handleRequest(req);
        }
    }

    @Override
    public String toString() {
        return "Orc officer";
    }
}
