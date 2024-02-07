package week14;

import java.util.ArrayList;
import java.util.List;

import java.util.Arrays;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class Class14_8_1_VideoStreamProcessorTest_AssertNull_AssertNotNull_in_JUnit_Java {
}

class VideoStreamProcessor {

    public List<VideoMetadata> filterVideos(List<VideoMetadata> videoList) {
        List<VideoMetadata> filteredVideos = new ArrayList<>();

        // Add filtering logic here based on specific criteria
        for (VideoMetadata video : videoList) {
            // Example filtering criteria: Duration should be less than or equal to 30 minutes
            // and resolution should be greater than or equal to Full HD (1920x1080).
            if (video.getDuration() <= 30 && isResolutionFullHD(video.getResolution())) {
                filteredVideos.add(video);
            }
        }

        return filteredVideos;
    }

    private boolean isResolutionFullHD(String resolution) {
        // Check if the resolution is Full HD (1920x1080) or higher
        if (resolution != null && resolution.matches(".*\\d{4}x\\d{3}.*")) {
            int width = Integer.parseInt(resolution.split("x")[0]);
            int height = Integer.parseInt(resolution.split("x")[1]);
            System.out.println(width);
            System.out.println(height);
            return width >= 1920 && height >= 1080;
        }
        return false;
    }
}

class VideoMetadata {
    private String title;
    private String resolution;
    private int duration;

    public VideoMetadata(String title, String resolution, int duration) {
        this.title = title;
        this.resolution = resolution;
        this.duration = duration;
    }

    // Getters and Setters (optional) for accessing private fields

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getResolution() {
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "VideoMetadata{" +
                "title='" + title + '\'' +
                ", resolution='" + resolution + '\'' +
                ", duration=" + duration +
                '}';
    }
}


class MainTest8_1 {


    @Test
    public void testFilterVideos_ValidVideos() {
        // Test case to validate the video filtering with valid videos
        VideoMetadata video1 = new VideoMetadata("Video1", "2560x1440", 20);
        VideoMetadata video2 = new VideoMetadata("Video2", "3210x1520", 25);
        VideoMetadata video3 = new VideoMetadata("Video3", "4560x1640", 30);
        VideoMetadata video4 = new VideoMetadata("Video4", "6560x2440", 15);

        List<VideoMetadata> videoList = Arrays.asList(video1, video2, video3, video4);

        VideoStreamProcessor processor = new VideoStreamProcessor();
        List<VideoMetadata> filteredVideos = processor.filterVideos(videoList);


        // Validate that the filtered videos list is not null
        assertNotNull(filteredVideos);

        // In this scenario, video1, video2, video3 and video4 should not be filtered out,
        // so we expect these videos to be present in the filteredVideos list.
        assertTrue(filteredVideos.contains(video1), "Video1 here");
        assertTrue(filteredVideos.contains(video2), "Video2 here");
        assertTrue(filteredVideos.contains(video3), "Video3 here");
        assertTrue(filteredVideos.contains(video4), "Video4 here");

    }

    @Test
    public void testFilterVideos_EmptyInput() {
        // Test case to validate the video filtering with an empty video list
        List<VideoMetadata> videoList = Arrays.asList();

        VideoStreamProcessor processor = new VideoStreamProcessor();
        List<VideoMetadata> filteredVideos = processor.filterVideos(videoList);


        // Validate that the filtered videos list is not null
            assertNotNull(filteredVideos);
        // In this scenario, there are no videos in the list, so we expect the filteredVideos list to be empty.
            assertTrue(filteredVideos.isEmpty(), "List of video is empty");
    }

    @Test
    public void testFilterVideos_VideoListWithNullAttributes() {
        // Test case to validate the video filtering with videos having null attributes
        VideoMetadata video1 = new VideoMetadata("Video1", "2560x1440", 60);//long videos
        VideoMetadata video2 = new VideoMetadata("Video2", null, 40); // Null resolution
        VideoMetadata video3 = new VideoMetadata("Video3", "2560x1440", 90);//long video

        List<VideoMetadata> videoList = Arrays.asList(video1, video2, video3);

        VideoStreamProcessor processor = new VideoStreamProcessor();
        List<VideoMetadata> filteredVideos = processor.filterVideos(videoList);

        // Validate that the filtered videos list is not null
            assertNotNull(filteredVideos);
        // In this scenario, video2 should be filtered out due to the null resolution,
        // so we expect video2 to be absent in the filteredVideos list.
            assertFalse(filteredVideos.contains(video2), "Video2 is absent");
        // video1 and video3 should  be filtered out, so we expect them to be absent in the filteredVideos list.
            assertFalse(filteredVideos.contains(video1), "Video1 is absent");
            assertFalse(filteredVideos.contains(video1), "Video3 is absent");
    }

    @Test
    public void testFilterVideos_AllVideosPassFilter() {

        // Test case to validate the video filtering where all videos pass the filter
        VideoMetadata video1 = new VideoMetadata("Video1", "2560x1440", 20);
        VideoMetadata video2 = new VideoMetadata("Video2", "2560x1440", 25);
        VideoMetadata video3 = new VideoMetadata("Video3", "1920x1080", 30);

        List<VideoMetadata> videoList = Arrays.asList(video1, video2, video3);

        VideoStreamProcessor processor = new VideoStreamProcessor();
        List<VideoMetadata> filteredVideos = processor.filterVideos(videoList);

        // Validate that the filtered videos list is not null
        assertNotNull(filteredVideos);
        // In this scenario, all videos should pass the filter,
        // so we expect all videos to be present in the filteredVideos list.
        assertTrue(filteredVideos.contains(video1), "Video1 is not in list");
        assertTrue(filteredVideos.contains(video2), "Video2 is not in list");
        assertTrue(filteredVideos.contains(video3), "Video3 is not in list");
    }
}




