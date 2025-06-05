public class ImageController {

    @GetMapping
    public List<Image> getAllImages() {
        // Logic to retrieve all images
        return List.of(
            new Image("1", "https://picsum.photos/id/237/300", MetadataFactory.getMetadata("sepia", "watermark1", "300x300")),
            new Image("2", "https://picsum.photos/id/238/300", MetadataFactory.getMetadata("sepia", "watermark1", "300x300"))
        );
    }   

}