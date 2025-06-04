package dti.crmsis.back.messaging;

import dti.crmsis.back.services.webhooks.WebhookRequestService;
import io.vertx.core.buffer.Buffer;
import io.vertx.core.eventbus.MessageCodec;
import io.vertx.core.json.JsonObject;

public class JsonProxyCodec implements MessageCodec<WebhookRequestService.JsonProxy, WebhookRequestService.JsonProxy> {
    @Override
    public void encodeToWire(Buffer buffer, WebhookRequestService.JsonProxy jsonProxy) {
        JsonObject json = JsonObject.mapFrom(jsonProxy);
        String str = json.encode();
        buffer.appendInt(str.length());
        buffer.appendString(str);
    }

    @Override
    public WebhookRequestService.JsonProxy decodeFromWire(int pos, Buffer buffer) {
        int length = buffer.getInt(pos);
        String str = buffer.getString(pos + 4, pos + 4 + length);
        JsonObject json = new JsonObject(str);
        return json.mapTo(WebhookRequestService.JsonProxy.class);
    }

    @Override
    public WebhookRequestService.JsonProxy transform(WebhookRequestService.JsonProxy jsonProxy) {
        return jsonProxy; // lt it be so for now
    }

    @Override
    public String name() {
        return "json-proxy-codec";
    }

    @Override
    public byte systemCodecID() {
        return -1;
    }
}