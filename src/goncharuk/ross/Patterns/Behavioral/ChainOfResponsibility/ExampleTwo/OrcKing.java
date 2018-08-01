package goncharuk.ross.Patterns.Behavioral.ChainOfResponsibility.ExampleTwo;


//Forms the chain
public class OrcKing {
    RequestHandler chain;

    public OrcKing(){
        buildChain();
    }
    //Similar to Decorator
    private void buildChain(){
        chain = new OrcCommander(new OrcOfficer(new OrcSoldier(null)));
    }
    public void makeRequest(Request request){
        chain.handleRequest(request);
    }
}
