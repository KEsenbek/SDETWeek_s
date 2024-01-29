package week9;

import java.util.Arrays;

public class Class9_12_3_URL_Separator_Arrays_with_Split {
    public static void main(String[] args) {
        separateURL("https://www.example.com/home");
    }

    public static String[] separateURL(String url) {
        // Check if the URL is not null or empty
        if (url == null || url.isEmpty()) {
            return new String[]{"Invalid URL"};
        }

        // Use the split() method to divide the URL into components
        String[] urlParts = url.split("://");

        // Check if the URL has the expected structure
        if (urlParts.length != 2) {
            return new String[]{"Invalid URL format"};
        }

        // Combine all components into a single array
        String[] result = new String[3];
        result[0] = urlParts[0];

        // Separate the domain and path using a for loop and split
        String[] domainPathParts = urlParts[1].split("/", 2);
        result[1] = domainPathParts[0];

        // Check if there is a path component
        if (domainPathParts.length > 1) {
            result[2] = domainPathParts[1];
        } else {
            result[2] = "";
        }

        return result;
    }
}
