public class Image {
    private String id;
    private String url;
    private ImageMetadata metadata;

    public Image(String id, String url, ImageMetadata metadata) {
        this.id = id;
        this.url = url;
        this.metadata = metadata;
    }

    // Getters
    public String getId() {
        return id;
    }
    public String getUrl() {
        return url;
    }
    public ImageMetadata getMetadata() {
        return metadata;
    }

    // Setters
    public void setId(String id) {
        this.id = id;
    }
    
    public void setUrl(String url) {
        this.url = url;
    }

    public void setMetadata(ImageMetadata metadata) {
        this.metadata = metadata;
    }

    

}
    