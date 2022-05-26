package ro.ase.cts.gr1085.labCommand;

public class BlocareCont implements OperatiuneBancara_command {

    private ServerOperatiuniBancare server;

    //constructor
    public BlocareCont(ServerOperatiuniBancare server) {
        this.server = server;
    }

    @Override
    public void efectuareOperatiune() {
        server.blocheazaCont();
    }
}