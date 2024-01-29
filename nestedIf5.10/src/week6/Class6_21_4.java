package week6;

public class Class6_21_4 {

    //Create a Java program that checks if a given filename corresponds to a specified file type category
    // (e.g., image, audio, video, document, etc.). You should create a static method named checkFileType()
    // that takes two parameters: a String representing the filename and a String representing the expected file type category.
    //The file type categories to check for are:
    //"image": Image files (.jpg, .png)
    //"audio": Audio files (.mp3, .wav)
    //"video": Video files (.mp4, .avi)
    //"document": Document files (.pdf, .docx)
    //The method should return a boolean indicating whether the filename corresponds to the expected file type category.
    public static void main(String[] args) {
        checkFileType("asdasd.jpd", ".jpd");
    }

    public static boolean checkFileType(String fileName, String fileType) {
        if (fileType.equals("image")) {
            if(fileName.endsWith(".jpg") || fileName.endsWith(".png")) {
                return true;
            }else {
                return false;
            }
        }
        else if (fileType.equals("audio")) {
            if (fileName.endsWith(".mp3") || fileName.endsWith(".wav")){
                return true;
            }else {
                return false;
            }
        } else if (fileType.equals("video")) {
            if (fileName.endsWith(".mp4") || fileName.endsWith(".avi")) {
                return true;
            }else {
                return false;
            }

        } else if (fileType.equals("document")) {
            if (fileName.endsWith(".pdf") || fileName.endsWith(".docx")) {
                return true;
            }else {
                return false;
            }
        }


        else  {
            return false;
        }

    }
}
