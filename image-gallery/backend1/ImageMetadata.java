public class ImageMetadata {

    private final String filter;
    private final String watermark;
    private final String size;


    public ImageMetadata(String filter,String watermark,String size) {
        this.filter = filter;
        this.watermark = watermark;
        this.size = size;

    }

    public String getFilter() {
        return filter;
    }

    public String getWatermark() {
        return watermark;
    }

    public String getSize() {
        return size;
    }
}