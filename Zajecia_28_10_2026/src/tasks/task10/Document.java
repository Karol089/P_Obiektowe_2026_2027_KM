package tasks.task10;

public class Document {
    private String fileName;

    public Document(String fileName) {
        this.fileName = fileName;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public Document copy(){
        return new Document(this.fileName);
    }
}
