package com.state_machine.core.actions;

import com.state_machine.core.actions.util.ActionStatus;
import com.state_machine.core.droneState.DroneStateTracker;
import com.state_machine.core.providers.RosPublisherProvider;
import com.state_machine.core.providers.RosSubscriberProvider;
import org.apache.commons.logging.Log;
import org.ros.message.Time;

/**
 * Created by edward on 17-3-26.
 */
public class ExternalAction extends Action {

    private RosPublisherProvider rosPublisherProvider;
    private RosSubscriberProvider rosSubscriberProvider;
    private Log log;
    private DroneStateTracker droneStateTracker;

    public ExternalAction(){}

    @Override
    public ActionStatus enterAction(Time time){
        return null;
    }

    @Override
    public ActionStatus loopAction(Time time) {
        return null;
    }

    public String toString() {
        return "ExternalAction";
    }
}
