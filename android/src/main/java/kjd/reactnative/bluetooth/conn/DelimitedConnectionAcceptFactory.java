package kjd.reactnative.bluetooth.conn;

public class DelimitedConnectionAcceptFactory implements DeviceConnectionFactory {
    @Override
    public DeviceConnection create() {
        return new DelimitedConnectionAcceptImpl();
    }
}
