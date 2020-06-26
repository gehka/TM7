public class ConcreteCommand implements Command {

    private Receiver receiver;

    @Override
    public void execute() {
        this.receiver.lichtAn();
    }

    public void setReceiver(Receiver receiver) {
        this.receiver = receiver;
    }
}
