package goncharuk.ross.Patterns.Structural.Facade.ExampleTwo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class DwarvenGoldmineFacade {

    private final List<DwarvenMineWorker> workers;

    public DwarvenGoldmineFacade(){
        workers = new ArrayList<>(3);
        workers.add(new DwarvenTunnelDigger());
        workers.add(new DwarvenGoldDigger());
        workers.add(new DwarvenCartOperator());
    }

    private static void makeActions(Collection<DwarvenMineWorker> workers, DwarvenMineWorker.Action... actions){
        for (DwarvenMineWorker worker : workers)
            worker.action(actions);
    }

    public void startNewDay(){
        makeActions(workers,DwarvenMineWorker.Action.WAKE_UP, DwarvenMineWorker.Action.GO_TO_MINE);
    }
    public void gidOutGold(){
        makeActions(workers, DwarvenMineWorker.Action.WORK);
    }
    public void goHome(){
        makeActions(workers, DwarvenMineWorker.Action.GO_HOME, DwarvenMineWorker.Action.GO_TO_SLEEP);
    }
}
