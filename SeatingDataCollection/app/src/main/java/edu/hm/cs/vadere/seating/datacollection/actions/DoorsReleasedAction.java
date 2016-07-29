package edu.hm.cs.vadere.seating.datacollection.actions;

import edu.hm.cs.vadere.seating.datacollection.model.LogEventType;

public class DoorsReleasedAction extends Action {
    private long logEventId;
    public DoorsReleasedAction(ActionManager actionManager) {
        super(actionManager);
    }

    @Override
    public void perform() {
        logEventId = getLogEventWriter().logTrainEvent(LogEventType.DOOR_RELEASE);
    }

    @Override
    public void undo() {
        deleteLogEvent(logEventId);
    }

}
