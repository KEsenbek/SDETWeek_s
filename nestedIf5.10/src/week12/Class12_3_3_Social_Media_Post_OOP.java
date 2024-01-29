package week12;

public class Class12_3_3_Social_Media_Post_OOP {
    class SocialMediaPost{
        private String postContent;// Represents the content of the social media post.

        private int numberOfLikes;// Represents the count of likes received for the post.

        private int numberOfComments;

        public SocialMediaPost(String postContent) {
            this.postContent = postContent;
            this.numberOfComments=0;
            this.numberOfLikes=0;
        }

        public void likePost() {
            numberOfLikes++;
            System.out.println("Post is liked");
        }

        // Method to add a comment to the post
        public void addComment(String comment) {
            numberOfComments++;
            System.out.println("New comment: \"" + comment + "\"");
        }

        // Method to display post details
        public void displayPostDetails() {
            System.out.println("Post Content: " + postContent + "");
            System.out.println("Number of Likes: " + numberOfLikes + "");
            System.out.println("Number of Comments: " + numberOfComments + "");
        }
    }
}
