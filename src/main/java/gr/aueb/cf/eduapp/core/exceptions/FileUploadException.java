package gr.aueb.cf.eduapp.core.exceptions;

public class FileUploadException extends AppGenericException{
    private static final String CODE_DEFAULT = "FileUploadError";

    public FileUploadException(String code, String message) {
        super(code + CODE_DEFAULT, message);
    }
}
