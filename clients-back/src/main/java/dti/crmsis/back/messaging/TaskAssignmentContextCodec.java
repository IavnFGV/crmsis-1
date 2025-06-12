package dti.crmsis.back.messaging;

import dti.crmsis.back.taskassignment.TaskAssignmentContext;
import io.vertx.core.buffer.Buffer;
import io.vertx.core.eventbus.MessageCodec;
import io.vertx.core.json.JsonObject;

public class TaskAssignmentContextCodec implements MessageCodec<TaskAssignmentContext, TaskAssignmentContext> {
    @Override
    public void encodeToWire(Buffer buffer, TaskAssignmentContext context) {
        JsonObject json = JsonObject.mapFrom(context);
        String str = json.encode();
        buffer.appendInt(str.length());
        buffer.appendString(str);
    }

    @Override
    public TaskAssignmentContext decodeFromWire(int pos, Buffer buffer) {
        int length = buffer.getInt(pos);
        String str = buffer.getString(pos + 4, pos + 4 + length);
        JsonObject json = new JsonObject(str);
        return json.mapTo(TaskAssignmentContext.class);
    }

    @Override
    public TaskAssignmentContext transform(TaskAssignmentContext context) {
        return context; // lt it be so for now
    }

    @Override
    public String name() {
        return "task-assignment-context-codec";
    }

    @Override
    public byte systemCodecID() {
        return -1;
    }
}