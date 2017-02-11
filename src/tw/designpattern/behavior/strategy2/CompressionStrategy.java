package tw.designpattern.behavior.strategy2;

import java.io.File;
import java.util.ArrayList;

/**
 * Created by chiachen on 2016/11/5.
 */
public interface CompressionStrategy {
    void compressFiles(ArrayList<File> files);
}
