package artur.sharafutdinov.watcher;

import java.io.File;
import java.util.TimerTask;

/**
 * Created by tatar on 12.03.17.
 */
public abstract class FileWatcher extends TimerTask {
    private long timeStamp;
    private File file;

    public FileWatcher( File file ) {
        this.file = file;
        this.timeStamp = file.lastModified();
    }

    public final void run() {
        long timeStamp = file.lastModified();

        if( this.timeStamp != timeStamp ) {
            this.timeStamp = timeStamp;
            onChange(file);
        }
    }

    protected abstract void onChange( File file );
}
