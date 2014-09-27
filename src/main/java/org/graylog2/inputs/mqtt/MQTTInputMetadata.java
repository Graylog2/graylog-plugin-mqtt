package org.graylog2.inputs.mqtt;

import org.graylog2.plugin.PluginMetaData;
import org.graylog2.plugin.Version;

import java.net.URI;

public class MQTTInputMetadata implements PluginMetaData {
    @Override
    public String getUniqueId() {
        return MQTTInput.class.getCanonicalName();
    }

    @Override
    public String getName() {
        return "MQTT Input Plugin";
    }

    @Override
    public String getAuthor() {
        return "TORCH GmbH";
    }

    @Override
    public URI getURL() {
        return URI.create("http://www.torch.sh");
    }

    @Override
    public Version getVersion() {
        return new Version(0, 90, 0);
    }

    @Override
    public String getDescription() {
        return "Process messages from one or multiple topics of an MQTT broker.";
    }

    @Override
    public Version getRequiredVersion() {
        return new Version(0, 90, 0);
    }
}
