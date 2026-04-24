package github.com.ifyosakwe.clippy.model;

public record CreateShortUrlCmd(
        String originalUrl,
        Boolean isPrivate,
        Integer expirationInDays,
        Long userId) {
}
