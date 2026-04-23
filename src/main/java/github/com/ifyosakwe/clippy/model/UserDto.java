package github.com.ifyosakwe.clippy.model;

import java.io.Serializable;

public record UserDto(Long id, String name) implements Serializable {
}
