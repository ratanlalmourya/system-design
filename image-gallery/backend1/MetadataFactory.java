import java.util.HashMap;
import java.util.Map;

public class MetadataFactory {
    private static final Map<String, ImageMetadata> cache = new HashMap<>();

    public static ImageMetadata getMetadata(String filter, String watermark, String size) {
        String key = filter + "_" + watermark + "_" + size;
        return cache.computeIfAbsent(key, k -> new ImageMetadata(filter, watermark, size));
    }
}