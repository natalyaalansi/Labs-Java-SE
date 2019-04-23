package sample;

import java.nio.file.Path;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: user
 * Date: 20.03.18
 * Time: 23:39
 * To change this template use File | Settings | File Templates.
 */
public class TextFile {
    private final Path file;
    private final List<String> content;     // хранение текста

    public TextFile(Path file, List<String> content) {
        this.file = file;
        this.content = content;
    }

    public Path getFile() {
        return file;
    }

    public List<String> getContent() {
        return content;
    }

}
