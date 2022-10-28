package BehavioralDesignPatterns.CommandDesingPatrn.TvCommandExample;

public class TvCloseCommand implements TvCommand{

    Television tv = null;

    public TvCloseCommand( final Television tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.closeTv();
    }


}
