public class functions_services {
    
    public String convertURL(String originalUrl) {
        if (originalUrl == null || originalUrl.isEmpty()) {
            throw new IllegalArgumentException("URL cannot be empty");
        } 
        // Generate short code from original URL
        String shortCode = generateShortCode(originalUrl);
        System.out.println("Original: " + originalUrl + " -> Short: " + shortCode);
        return shortCode;
    }
    
    public void saveUrl(String originalUrl, String shortCode) {
        if (originalUrl == null || shortCode == null) {
            throw new IllegalArgumentException("URL and short code cannot be null");
        }
        // TODO: Implement database save logic
        System.out.println("Saving: " + originalUrl + " with code: " + shortCode);
    }
    
    public void removeUrl(String shortCode) {
        if (shortCode == null || shortCode.isEmpty()) {
            throw new IllegalArgumentException("Short code cannot be empty");
        }
        // TODO: Implement database delete logic
        System.out.println("Removing URL with code: " + shortCode);
    }
    
    private String generateShortCode(String url) {
        return Integer.toHexString(url.hashCode()).substring(0, 6);
    }
}
