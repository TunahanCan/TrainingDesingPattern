package BehavioralDesignPatterns.CommandDesingPatrn.TvCommandExample;

public class TvRomete {
    public TvCommand[] remoteKey = new TvCommand[2];

    public TvRomete() {
        final Television tv = new Television();
        remoteKey[0] = new TvCloseCommand(tv);
        remoteKey[1] = new TvOpenCommand(tv);
    }

    public void tusla(final int i) {
        if (i > remoteKey.length || i < 0) {
            throw new RuntimeException("" + "Tus gecersiz!");
        }
        remoteKey[i].execute();
    }
}
