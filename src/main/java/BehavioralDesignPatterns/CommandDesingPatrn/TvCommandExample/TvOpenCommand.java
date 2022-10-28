package BehavioralDesignPatterns.CommandDesingPatrn.TvCommandExample;

public class TvOpenCommand implements TvCommand{

    Television tv = null;

    public TvOpenCommand(final Television tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.openTv();
    }


}
