package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextArea;
import javafx.stage.FileChooser;

import java.io.File;
import java.util.Arrays;


public class Controller {
    @FXML
    private TextArea areaText;
    private TextFile currentTextFile;
    private NotepadModel model; // access to model

    public Controller(NotepadModel model) {
        this.model = model;
    }

    @FXML
    private void onSave() {
        TextFile textFile = new TextFile(currentTextFile.getFile(), Arrays.asList(areaText.getText().split("\n")));
        model.save(textFile);
    }

    @FXML
    private void onLoad() {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setInitialDirectory(new File("./"));
        File file = fileChooser.showOpenDialog(null);
        if (file != null) {
            IOResult<TextFile> io = model.load(file.toPath());
            if (io.isOk() && io.hasData()) {
                currentTextFile = io.getData();
                areaText.clear();
                currentTextFile.getContent().forEach(line -> areaText.appendText(line + "\n"));

            } else {
                System.out.println("Failed");

            }
        }
    }

    @FXML
    private void onClose() {
        model.close();

    }

    @FXML
    private void onAbout() {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setHeaderText(null);
        alert.setTitle("About");
        alert.setContentText("This is a text editor. I made it late at night using a tutorial on Youtube. Thank you, an anonymous American guy!");
        alert.show();
    }


}
