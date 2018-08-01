package goncharuk.ross.Patterns.Behavioral.ChainOfResponsibility.ExampleTwo;

public class OrcSoldier extends RequestHandler {

    public OrcSoldier(RequestHandler handler) {
        super(handler);
    }

    @Override
    public void handleRequest(Request req) {
        if (req.getRequestType().equals(Request.RequestType.COLLECT_TAX)) {
            printHandling(req);
            req.markHandled();
        } else {
            super.handleRequest(req);
        }
    }

    @Override
    public String toString() {
        return "Orc soldier";
    }
}
