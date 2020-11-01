package kjd.reactnative.bluetooth.conn;

public class DelimitedConnectionClientFactory implements DeviceConnectionFactory {
    @Override
    public DeviceConnection create() {
        return new DelimitedConnectionClientImpl();
    }
}
