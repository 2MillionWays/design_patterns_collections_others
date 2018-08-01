package goncharuk.ross.Patterns.Behavioral.ChainOfResponsibility.ExampleTwo;

import java.util.Objects;

public class Request {
    private final RequestType requestType;
    private final String requestDescription;
    private boolean handled;

    public Request(final RequestType requestType) {
        this.requestType = Objects.requireNonNull(requestType);
        this.requestDescription = Objects.requireNonNull(requestType.getDescription());
    }

    public String getRequestDescription() {
        return requestDescription;
    }

    public RequestType getRequestType() {
        return requestType;
    }

    public void markHandled() {
        this.handled = true;
    }

    public boolean isHandled() {
        return this.handled;
    }

    @Override
    public String toString() {
        return getRequestDescription();
    }

    public enum RequestType {
        DEFEND_CASTLE("defend castle!"),
        TORTURE_PRISONER("torture prisoners!"),
        COLLECT_TAX("collect taxes!");

        private String description;
        RequestType(String desc){
            this.description = desc;
        }

        public String getDescription() {
            return description;
        }
    }
}
